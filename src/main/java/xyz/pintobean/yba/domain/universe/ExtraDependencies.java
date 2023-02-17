
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
    "installNodeExporter"
})
@Generated("jsonschema2pojo")
public class ExtraDependencies {

    @JsonProperty("installNodeExporter")
    private Boolean installNodeExporter;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExtraDependencies() {
    }

    /**
     * 
     * @param installNodeExporter
     */
    public ExtraDependencies(Boolean installNodeExporter) {
        super();
        this.installNodeExporter = installNodeExporter;
    }

    @JsonProperty("installNodeExporter")
    public Boolean getInstallNodeExporter() {
        return installNodeExporter;
    }

    @JsonProperty("installNodeExporter")
    public void setInstallNodeExporter(Boolean installNodeExporter) {
        this.installNodeExporter = installNodeExporter;
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
        sb.append(ExtraDependencies.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("installNodeExporter");
        sb.append('=');
        sb.append(((this.installNodeExporter == null)?"<null>":this.installNodeExporter));
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
