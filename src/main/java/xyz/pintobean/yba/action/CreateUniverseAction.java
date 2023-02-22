package xyz.pintobean.yba.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.json.JSONObject;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import xyz.pintobean.yba.domain.universe.Cluster;
import xyz.pintobean.yba.domain.universe.DeviceInfo;
import xyz.pintobean.yba.domain.universe.Region;
import xyz.pintobean.yba.domain.universe.Universe;
import xyz.pintobean.yba.domain.universe.UserIntent;

/**
 * Creates a new universe
 */
public class CreateUniverseAction extends YbaClientAction {

    private static final Log LOG = LogFactory.getLog(CreateUniverseAction.class);

    private String customerUuid;
    private String providerUuid;

    /**
     * Implements <code>YbaClientAction.runAction()</code>
     */
    @Override
    public Map<String, Object> runAction() {

        //Get list of current regions
        StringBuilder url = new StringBuilder();
        url.append(normalizeHostname(args.getHostname()));
        url.append("/api/v1/customers/");
        url.append(this.getCustomerUuid());
        url.append("/regions");

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<Object> httpEntity = this.getHttpEntity(this.getApiToken("yugabyte-api-token", "yugabyte"));
        List<Region> regions = restTemplate.exchange(
            url.toString(),
            HttpMethod.GET,
            httpEntity,
            new ParameterizedTypeReference<List<Region>>() {}
        ).getBody();
        LOG.debug(String.format("Regions for provider = [%s]", regions));

        List<String> regionListUuids = new ArrayList<>();
        if (regions != null) {
            for (Region region : regions) {
                regionListUuids.add(region.getUuid());
            }
        }
        
        //Device info
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.setNumVolumes(1);
        deviceInfo.setStorageClass(args.getStorageClass());
        deviceInfo.setVolumeSize(args.getVolumeSize());

        //User intent
        UserIntent userIntent = new UserIntent();
        userIntent.setAssignPublicIP(Boolean.TRUE);
        userIntent.setDeviceInfo(deviceInfo);
        userIntent.setEnableClientToNodeEncrypt(Boolean.TRUE);
        userIntent.setEnableIPV6(Boolean.FALSE);
        userIntent.setEnableNodeToNodeEncrypt(Boolean.TRUE);
        userIntent.setEnableYCQL(Boolean.TRUE);
        userIntent.setEnableYCQLAuth(Boolean.TRUE);
        userIntent.setEnableYEDIS(Boolean.FALSE);
        userIntent.setEnableYSQL(Boolean.TRUE);
        userIntent.setEnableYSQLAuth(Boolean.TRUE);
        userIntent.setInstanceType("small");
        userIntent.setNumNodes(1);
        userIntent.setProvider(this.getProviderUuid());
        userIntent.setProviderType("kubernetes");
        userIntent.setRegionList(regionListUuids);
        userIntent.setReplicationFactor(args.getReplicationFactor());
        userIntent.setUniverseName(args.getUniverseName());
        userIntent.setUseTimeSync(Boolean.TRUE);
        userIntent.setYbSoftwareVersion(args.getYbSoftwareVersion());
        userIntent.setYcqlPassword(args.getYcqlPassword());
        userIntent.setYsqlPassword(args.getYsqlPassword());

        //Cluster
        Cluster cluster = new Cluster();
        cluster.setClusterType("PRIMARY");
        cluster.setUserIntent(userIntent);
        List<Cluster> clusters = new ArrayList<>();
        clusters.add(cluster);

        //Universe
        Universe universe = new Universe();
        universe.setClusterOperation("CREATE");
        universe.setClusters(clusters);
        universe.setNodePrefix("yb-dev" + args.getUniverseName());
        universe.setUniverseUUID(UUID.randomUUID().toString());

        //Build request URL
        url = new StringBuilder();
        url.append(normalizeHostname(args.getHostname()));
        url.append("/api/v1/customers/");
        url.append(this.getCustomerUuid());
        url.append("/universes/clusters");

        //API call
        httpEntity = this.getHttpEntity(
            this.getApiToken("yugabyte-api-token", "yugabyte"),
            universe
        );
        LOG.info(String.format("Sending Create Universe request to %s", url.toString()));
        String response = restTemplate.postForObject(
            url.toString(), 
            httpEntity, 
            String.class)
        ;
        LOG.debug(String.format("Response for create universe = [%s]", response));

        //Return values
        JSONObject jsonObject = new JSONObject(response);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("result", "success");
        result.put("universeUuid", jsonObject.getString("resourceUUID"));
        result.put("taskUuid", jsonObject.getString("taskUUID"));
        return result;


    }

    public String getCustomerUuid() {
        return customerUuid;
    }

    public void setCustomerUuid(String customerUuid) {
        this.customerUuid = customerUuid;
    }

    public String getProviderUuid() {
        return providerUuid;
    }

    public void setProviderUuid(String providerUuid) {
        this.providerUuid = providerUuid;
    }
    
}
