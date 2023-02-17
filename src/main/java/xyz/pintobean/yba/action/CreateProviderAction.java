package xyz.pintobean.yba.action;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import xyz.pintobean.yba.domain.provider.Config;
import xyz.pintobean.yba.domain.provider.Config__1;
import xyz.pintobean.yba.domain.provider.Provider;
import xyz.pintobean.yba.domain.provider.Region;
import xyz.pintobean.yba.domain.provider.Zone;

/**
 * Creates a Kubernetes cloud provider
 */
public class CreateProviderAction extends YbaClientAction {

    private static final Log LOG = LogFactory.getLog(CreateProviderAction.class);

    private String apiToken;
    private String customerUuid;

    /**
     * Implements <code>YbaClientAction.runAction()</code>
     */
    @Override
    public Map<String, Object> runAction() {
  
        //Kube configuration
        Config__1 zoneConfig = new Config__1();
        zoneConfig.setKubeconfigContent(this.readFile(args.getKubeconfigPath()));
        zoneConfig.setKubeconfigName(args.getZone() + "-kubeconfig.yaml");
        zoneConfig.setKubenamespace(args.getNamespace());

        //Availability zone
        Zone zone = new Zone();
        zone.setCode(args.getZone());
        zone.setName(args.getZone());
        zone.setConfig(zoneConfig);
        List<Zone> zoneList = new ArrayList<>();
        zoneList.add(zone);

        //Region
        Region region = new Region();
        region.setName(args.getRegion());
        region.setCode(args.getRegion());
        region.setLatitude(args.getRegionLatitude());
        region.setLongitude(args.getRegionLongitude());
        region.setZoneList(zoneList);
        List<Region> regionList = new ArrayList<>();
        regionList.add(region);
        
        //Provider configuration
        Config providerConfig = new Config();
        providerConfig.setKubeconfigProvider("gke");
        providerConfig.setKubeconfigServiceAccount(args.getServiceAccount());
        providerConfig.setKubeconfigImageRegistry("quay.io/yugabyte/yugabyte");
        providerConfig.setKubeconfigPullSecretName(args.getPullSecretName());
        providerConfig.setKubeconfigImagePullSecretName(args.getPullSecretName());
        providerConfig.setKubeconfigPullSecretContent(this.readFile(args.getPullSecretPath()));
        providerConfig.setKubePodAddressTemplate("{pod_name}.{service_name}.{namespace}.svc.{cluster_domain}");

        //Provider
        Provider provider = new Provider();
        provider.setName(args.getProviderName());
        provider.setCode("kubernetes");
        provider.setConfig(providerConfig);
        provider.setRegionList(regionList);

        //Build request URL
        StringBuilder url = new StringBuilder();
        url.append(normalizeHostname(args.getHostname()));
        url.append("/api/v1/customers/");
        url.append(this.getCustomerUuid());
        url.append("/providers/kubernetes");
        LOG.debug(String.format("URL created = [%s]", url.toString()));

        //API call
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<Object> httpEntity = this.getHttpEntity(this.getApiToken(), provider);
        LOG.info(String.format("Sending Create Provider request to %s", url.toString()));
        String response = restTemplate.postForObject(
            url.toString(), 
            httpEntity, 
            String.class)
        ;
        LOG.debug(String.format("Response for create provider = [%s]", response));

        JSONObject jsonObject = new JSONObject(response);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("result", "success");
        result.put("providerUuid", jsonObject.getString("uuid"));
        return result;
        
    }

    /**
     * Reads a file into a String value
     * @param filePath The path to the file to read
     * @return A string representation of the file's contents
     */
    private String readFile(String filePath) {

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
        } catch (FileNotFoundException fnfe) {
            LOG.error(String.format("File for file path [%s] not found. Exiting...", filePath), fnfe);
            return null;
        }

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder sb = new StringBuilder();

        try {
            while (bufferedReader.ready()) {
                sb.append(bufferedReader.readLine());
                sb.append("\n");                
            }
            bufferedReader.close();
        } catch (IOException ioe) {
            LOG.error(String.format("Error reading file [%s]. Exiting...", filePath), ioe);
            return null;
        }

        String fileContents = sb.toString();
                
        LOG.debug(String.format("File contents = [\n%s\n]", fileContents));
        return fileContents;

    }

    /**
     * Gets the API token
     * @return The API token
     */
    public String getApiToken() {
        return apiToken;
    }

    /**
     * Sets the API token
     * @param apiToken The API token
     */
    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    /**
     * Gets the customer UUID
     * @return The customer UUID
     */
    public String getCustomerUuid() {
        return customerUuid;
    }

    /**
     * Sets the customer UUID
     * @param The customer UUID
     */
    public void setCustomerUuid(String customerUuid) {
        this.customerUuid = customerUuid;
    }
}
