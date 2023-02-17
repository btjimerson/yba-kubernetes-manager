
package xyz.pintobean.yba.domain.provider;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "KUBECONFIG_PROVIDER",
    "KUBECONFIG_SERVICE_ACCOUNT",
    "KUBECONFIG_IMAGE_REGISTRY",
    "KUBE_POD_ADDRESS_TEMPLATE",
    "KUBECONFIG_IMAGE_PULL_SECRET_NAME",
    "KUBECONFIG_PULL_SECRET_NAME",
    "KUBECONFIG_PULL_SECRET_CONTENT"
})
@Generated("jsonschema2pojo")
public class Config {

    @JsonProperty("KUBECONFIG_PROVIDER")
    private String kubeconfigProvider;
    @JsonProperty("KUBECONFIG_SERVICE_ACCOUNT")
    private String kubeconfigServiceAccount;
    @JsonProperty("KUBECONFIG_IMAGE_REGISTRY")
    private String kubeconfigImageRegistry;
    @JsonProperty("KUBE_POD_ADDRESS_TEMPLATE")
    private String kubePodAddressTemplate;
    @JsonProperty("KUBECONFIG_IMAGE_PULL_SECRET_NAME")
    private String kubeconfigImagePullSecretName;
    @JsonProperty("KUBECONFIG_PULL_SECRET_NAME")
    private String kubeconfigPullSecretName;
    @JsonProperty("KUBECONFIG_PULL_SECRET_CONTENT")
    private String kubeconfigPullSecretContent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Config() {
    }

    /**
     * 
     * @param kubeconfigProvider
     * @param kubeconfigServiceAccount
     * @param kubePodAddressTemplate
     * @param kubeconfigImagePullSecretName
     * @param kubeconfigPullSecretContent
     * @param kubeconfigPullSecretName
     * @param kubeconfigImageRegistry
     */
    public Config(String kubeconfigProvider, String kubeconfigServiceAccount, String kubeconfigImageRegistry, String kubePodAddressTemplate, String kubeconfigImagePullSecretName, String kubeconfigPullSecretName, String kubeconfigPullSecretContent) {
        super();
        this.kubeconfigProvider = kubeconfigProvider;
        this.kubeconfigServiceAccount = kubeconfigServiceAccount;
        this.kubeconfigImageRegistry = kubeconfigImageRegistry;
        this.kubePodAddressTemplate = kubePodAddressTemplate;
        this.kubeconfigImagePullSecretName = kubeconfigImagePullSecretName;
        this.kubeconfigPullSecretName = kubeconfigPullSecretName;
        this.kubeconfigPullSecretContent = kubeconfigPullSecretContent;
    }

    @JsonProperty("KUBECONFIG_PROVIDER")
    public String getKubeconfigProvider() {
        return kubeconfigProvider;
    }

    @JsonProperty("KUBECONFIG_PROVIDER")
    public void setKubeconfigProvider(String kubeconfigProvider) {
        this.kubeconfigProvider = kubeconfigProvider;
    }

    @JsonProperty("KUBECONFIG_SERVICE_ACCOUNT")
    public String getKubeconfigServiceAccount() {
        return kubeconfigServiceAccount;
    }

    @JsonProperty("KUBECONFIG_SERVICE_ACCOUNT")
    public void setKubeconfigServiceAccount(String kubeconfigServiceAccount) {
        this.kubeconfigServiceAccount = kubeconfigServiceAccount;
    }

    @JsonProperty("KUBECONFIG_IMAGE_REGISTRY")
    public String getKubeconfigImageRegistry() {
        return kubeconfigImageRegistry;
    }

    @JsonProperty("KUBECONFIG_IMAGE_REGISTRY")
    public void setKubeconfigImageRegistry(String kubeconfigImageRegistry) {
        this.kubeconfigImageRegistry = kubeconfigImageRegistry;
    }

    @JsonProperty("KUBE_POD_ADDRESS_TEMPLATE")
    public String getKubePodAddressTemplate() {
        return kubePodAddressTemplate;
    }

    @JsonProperty("KUBE_POD_ADDRESS_TEMPLATE")
    public void setKubePodAddressTemplate(String kubePodAddressTemplate) {
        this.kubePodAddressTemplate = kubePodAddressTemplate;
    }

    @JsonProperty("KUBECONFIG_IMAGE_PULL_SECRET_NAME")
    public String getKubeconfigImagePullSecretName() {
        return kubeconfigImagePullSecretName;
    }

    @JsonProperty("KUBECONFIG_IMAGE_PULL_SECRET_NAME")
    public void setKubeconfigImagePullSecretName(String kubeconfigImagePullSecretName) {
        this.kubeconfigImagePullSecretName = kubeconfigImagePullSecretName;
    }

    @JsonProperty("KUBECONFIG_PULL_SECRET_NAME")
    public String getKubeconfigPullSecretName() {
        return kubeconfigPullSecretName;
    }

    @JsonProperty("KUBECONFIG_PULL_SECRET_NAME")
    public void setKubeconfigPullSecretName(String kubeconfigPullSecretName) {
        this.kubeconfigPullSecretName = kubeconfigPullSecretName;
    }

    @JsonProperty("KUBECONFIG_PULL_SECRET_CONTENT")
    public String getKubeconfigPullSecretContent() {
        return kubeconfigPullSecretContent;
    }

    @JsonProperty("KUBECONFIG_PULL_SECRET_CONTENT")
    public void setKubeconfigPullSecretContent(String kubeconfigPullSecretContent) {
        this.kubeconfigPullSecretContent = kubeconfigPullSecretContent;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Config.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("kubeconfigProvider");
        sb.append('=');
        sb.append(((this.kubeconfigProvider == null)?"<null>":this.kubeconfigProvider));
        sb.append(',');
        sb.append("kubeconfigServiceAccount");
        sb.append('=');
        sb.append(((this.kubeconfigServiceAccount == null)?"<null>":this.kubeconfigServiceAccount));
        sb.append(',');
        sb.append("kubeconfigImageRegistry");
        sb.append('=');
        sb.append(((this.kubeconfigImageRegistry == null)?"<null>":this.kubeconfigImageRegistry));
        sb.append(',');
        sb.append("kubePodAddressTemplate");
        sb.append('=');
        sb.append(((this.kubePodAddressTemplate == null)?"<null>":this.kubePodAddressTemplate));
        sb.append(',');
        sb.append("kubeconfigImagePullSecretName");
        sb.append('=');
        sb.append(((this.kubeconfigImagePullSecretName == null)?"<null>":this.kubeconfigImagePullSecretName));
        sb.append(',');
        sb.append("kubeconfigPullSecretName");
        sb.append('=');
        sb.append(((this.kubeconfigPullSecretName == null)?"<null>":this.kubeconfigPullSecretName));
        sb.append(',');
        sb.append("kubeconfigPullSecretContent");
        sb.append('=');
        sb.append(((this.kubeconfigPullSecretContent == null)?"<null>":this.kubeconfigPullSecretContent));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
