
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
    "KUBENAMESPACE",
    "OVERRIDES",
    "KUBECONFIG_NAME",
    "KUBECONFIG_CONTENT"
})
@Generated("jsonschema2pojo")
public class Config__1 {

    @JsonProperty("KUBENAMESPACE")
    private String kubenamespace;
    @JsonProperty("OVERRIDES")
    private String overrides;
    @JsonProperty("KUBECONFIG_NAME")
    private String kubeconfigName;
    @JsonProperty("KUBECONFIG_CONTENT")
    private String kubeconfigContent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Config__1() {
    }

    /**
     * 
     * @param kubenamespace
     * @param kubeconfigName
     * @param kubeconfigContent
     * @param overrides
     */
    public Config__1(String kubenamespace, String overrides, String kubeconfigName, String kubeconfigContent) {
        super();
        this.kubenamespace = kubenamespace;
        this.overrides = overrides;
        this.kubeconfigName = kubeconfigName;
        this.kubeconfigContent = kubeconfigContent;
    }

    @JsonProperty("KUBENAMESPACE")
    public String getKubenamespace() {
        return kubenamespace;
    }

    @JsonProperty("KUBENAMESPACE")
    public void setKubenamespace(String kubenamespace) {
        this.kubenamespace = kubenamespace;
    }

    @JsonProperty("OVERRIDES")
    public String getOverrides() {
        return overrides;
    }

    @JsonProperty("OVERRIDES")
    public void setOverrides(String overrides) {
        this.overrides = overrides;
    }

    @JsonProperty("KUBECONFIG_NAME")
    public String getKubeconfigName() {
        return kubeconfigName;
    }

    @JsonProperty("KUBECONFIG_NAME")
    public void setKubeconfigName(String kubeconfigName) {
        this.kubeconfigName = kubeconfigName;
    }

    @JsonProperty("KUBECONFIG_CONTENT")
    public String getKubeconfigContent() {
        return kubeconfigContent;
    }

    @JsonProperty("KUBECONFIG_CONTENT")
    public void setKubeconfigContent(String kubeconfigContent) {
        this.kubeconfigContent = kubeconfigContent;
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
        sb.append(Config__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("kubenamespace");
        sb.append('=');
        sb.append(((this.kubenamespace == null)?"<null>":this.kubenamespace));
        sb.append(',');
        sb.append("overrides");
        sb.append('=');
        sb.append(((this.overrides == null)?"<null>":this.overrides));
        sb.append(',');
        sb.append("kubeconfigName");
        sb.append('=');
        sb.append(((this.kubeconfigName == null)?"<null>":this.kubeconfigName));
        sb.append(',');
        sb.append("kubeconfigContent");
        sb.append('=');
        sb.append(((this.kubeconfigContent == null)?"<null>":this.kubeconfigContent));
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
