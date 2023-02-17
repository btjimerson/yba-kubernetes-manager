
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
    "azList",
    "code",
    "lbFQDN",
    "name",
    "uuid"
})
@Generated("jsonschema2pojo")
public class Region {

    @JsonProperty("azList")
    private List<Az> azList;
    @JsonProperty("code")
    private String code;
    @JsonProperty("lbFQDN")
    private String lbFQDN;
    @JsonProperty("name")
    private String name;
    @JsonProperty("uuid")
    private String uuid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Region() {
    }

    /**
     * 
     * @param code
     * @param azList
     * @param name
     * @param lbFQDN
     * @param uuid
     */
    public Region(List<Az> azList, String code, String lbFQDN, String name, String uuid) {
        super();
        this.azList = azList;
        this.code = code;
        this.lbFQDN = lbFQDN;
        this.name = name;
        this.uuid = uuid;
    }

    @JsonProperty("azList")
    public List<Az> getAzList() {
        return azList;
    }

    @JsonProperty("azList")
    public void setAzList(List<Az> azList) {
        this.azList = azList;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("lbFQDN")
    public String getLbFQDN() {
        return lbFQDN;
    }

    @JsonProperty("lbFQDN")
    public void setLbFQDN(String lbFQDN) {
        this.lbFQDN = lbFQDN;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
        sb.append(Region.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("azList");
        sb.append('=');
        sb.append(((this.azList == null)?"<null>":this.azList));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("lbFQDN");
        sb.append('=');
        sb.append(((this.lbFQDN == null)?"<null>":this.lbFQDN));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
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
