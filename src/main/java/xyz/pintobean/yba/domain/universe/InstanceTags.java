
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
    "property1",
    "property2"
})
@Generated("jsonschema2pojo")
public class InstanceTags {

    @JsonProperty("property1")
    private String property1;
    @JsonProperty("property2")
    private String property2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public InstanceTags() {
    }

    /**
     * 
     * @param property2
     * @param property1
     */
    public InstanceTags(String property1, String property2) {
        super();
        this.property1 = property1;
        this.property2 = property2;
    }

    @JsonProperty("property1")
    public String getProperty1() {
        return property1;
    }

    @JsonProperty("property1")
    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    @JsonProperty("property2")
    public String getProperty2() {
        return property2;
    }

    @JsonProperty("property2")
    public void setProperty2(String property2) {
        this.property2 = property2;
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
        sb.append(InstanceTags.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("property1");
        sb.append('=');
        sb.append(((this.property1 == null)?"<null>":this.property1));
        sb.append(',');
        sb.append("property2");
        sb.append('=');
        sb.append(((this.property2 == null)?"<null>":this.property2));
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
