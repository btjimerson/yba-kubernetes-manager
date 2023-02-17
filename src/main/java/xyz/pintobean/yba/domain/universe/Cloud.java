
package xyz.pintobean.yba.domain.universe;

import java.util.LinkedHashMap;
import java.util.List;
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
    "code",
    "defaultRegion",
    "regionList",
    "uuid"
})
@Generated("jsonschema2pojo")
public class Cloud {

    @JsonProperty("code")
    private String code;
    @JsonProperty("defaultRegion")
    private String defaultRegion;
    @JsonProperty("regionList")
    private List<Region> regionList;
    @JsonProperty("uuid")
    private String uuid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cloud() {
    }

    /**
     * 
     * @param code
     * @param regionList
     * @param defaultRegion
     * @param uuid
     */
    public Cloud(String code, String defaultRegion, List<Region> regionList, String uuid) {
        super();
        this.code = code;
        this.defaultRegion = defaultRegion;
        this.regionList = regionList;
        this.uuid = uuid;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("defaultRegion")
    public String getDefaultRegion() {
        return defaultRegion;
    }

    @JsonProperty("defaultRegion")
    public void setDefaultRegion(String defaultRegion) {
        this.defaultRegion = defaultRegion;
    }

    @JsonProperty("regionList")
    public List<Region> getRegionList() {
        return regionList;
    }

    @JsonProperty("regionList")
    public void setRegionList(List<Region> regionList) {
        this.regionList = regionList;
    }

    @JsonProperty("uuid")
    public String getUuid() {
        return uuid;
    }

    @JsonProperty("uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
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
        sb.append(Cloud.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("defaultRegion");
        sb.append('=');
        sb.append(((this.defaultRegion == null)?"<null>":this.defaultRegion));
        sb.append(',');
        sb.append("regionList");
        sb.append('=');
        sb.append(((this.regionList == null)?"<null>":this.regionList));
        sb.append(',');
        sb.append("uuid");
        sb.append('=');
        sb.append(((this.uuid == null)?"<null>":this.uuid));
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
