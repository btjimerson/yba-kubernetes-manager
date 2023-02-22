package xyz.pintobean.yba.action;

import java.util.Arrays;
import java.util.Base64;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import io.fabric8.kubernetes.api.model.Secret;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import xyz.pintobean.yba.domain.YbaArguments;

/**
 * Base class for YBA actions
 */
public abstract class YbaClientAction {
 
    YbaArguments args;
    private static final Log LOG = LogFactory.getLog(YbaClientAction.class);

    /**
     * Runs this action. Subclasses should override this with their specific action logic.
     * @return Map<String, Object> A map of key/value pairs as a result of this action.
     */
    public abstract Map<String, Object> runAction();
    
    /**
     * Sets the Yugabyte arguments passed
     * @param args The Yugabyte arguments passed
     */
    public void setArgs(YbaArguments args) {
        this.args = args;
    }

    /**
     * Gets the Yugabyte arguments passed
     * @return  The Yugabyte arguments passed
     */
    public YbaArguments getArgs() {
        return this.args;
    }

    /**
     * Creates a valid base URL
     * @param hostname The hostname of YBA
     * @return A valid base URL
     */
    protected String normalizeHostname(String hostname) {
        return "http://" + hostname;
    }
    
    /**
     * Creates an HTTP entity with an API token header and request body
     * @param apiToken The API token to use
     * @param request The request body for the HTTP entity
     * @return An HTTP entity with the API token and request body
     */
    protected HttpEntity<Object> getHttpEntity(String apiToken, Object request) {
		HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		httpHeaders.set("X-AUTH-YW-API-TOKEN", apiToken);

		HttpEntity<Object> httpEntity = new HttpEntity<>(request, httpHeaders);
		return httpEntity;
	}

    /**
     * Creates an HTTP entity with an API token header and no request body
     * @param apiToken The API token to use
     * @return An HTTP entity with the API token and empty request body
     */
    protected HttpEntity<Object> getHttpEntity(String apiToken) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        httpHeaders.set("X-AUTH-YW-API-TOKEN", apiToken);
        
        HttpEntity<Object> httpEntity = new HttpEntity<>(httpHeaders);
        return httpEntity;
    }

    /**
     * Reads the API token secret
     * @param secretName The name of the secret containing the API token
     * @param namespace The namespace of the secret
     * @return The Base64 decoded secret
     * @throws ApiException
     */
    protected String getApiToken(String secretName, String namespace) {

        KubernetesClient client = new KubernetesClientBuilder().build();
        Secret apiTokenSecret = client.
            secrets().
            inNamespace(namespace).
            withName(secretName).
            get();
        
        if (apiTokenSecret != null) {
            Map<String, String> data = apiTokenSecret.getData();
            if (data != null && data.containsKey("apiToken")) {
                byte[] apiToken = Base64.getDecoder().decode(data.get("apiToken"));
                return new String(apiToken);
            }
        }

        LOG.info(String.format(
            "API token not found with name [%s] in namespace [%s]. Returning null.", 
            secretName, 
            namespace));
        return null;

    }
}
