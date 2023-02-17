
package xyz.pintobean.yba.domain.universe;

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
    "sourceRootCertDirPath"
})
@Generated("jsonschema2pojo")
public class XclusterInfo {

    @JsonProperty("sourceRootCertDirPath")
    private String sourceRootCertDirPath;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public XclusterInfo() {
    }

    /**
     * 
     * @param sourceRootCertDirPath
     */
    public XclusterInfo(String sourceRootCertDirPath) {
        super();
        this.sourceRootCertDirPath = sourceRootCertDirPath;
    }

    @JsonProperty("sourceRootCertDirPath")
    public String getSourceRootCertDirPath() {
        return sourceRootCertDirPath;
    }

    @JsonProperty("sourceRootCertDirPath")
    public void setSourceRootCertDirPath(String sourceRootCertDirPath) {
        this.sourceRootCertDirPath = sourceRootCertDirPath;
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
        sb.append(XclusterInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sourceRootCertDirPath");
        sb.append('=');
        sb.append(((this.sourceRootCertDirPath == null)?"<null>":this.sourceRootCertDirPath));
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
