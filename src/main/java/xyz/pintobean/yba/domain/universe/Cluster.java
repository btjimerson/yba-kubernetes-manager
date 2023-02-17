
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
    "clusterType",
    "index",
    "placementInfo",
    "userIntent",
    "uuid"
})
@Generated("jsonschema2pojo")
public class Cluster {

    @JsonProperty("clusterType")
    private String clusterType;
    @JsonProperty("index")
    private Integer index;
    @JsonProperty("placementInfo")
    private PlacementInfo placementInfo;
    @JsonProperty("userIntent")
    private UserIntent userIntent;
    @JsonProperty("uuid")
    private String uuid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cluster() {
    }

    /**
     * 
     * @param clusterType
     * @param placementInfo
     * @param userIntent
     * @param index
     * @param uuid
     */
    public Cluster(String clusterType, Integer index, PlacementInfo placementInfo, UserIntent userIntent, String uuid) {
        super();
        this.clusterType = clusterType;
        this.index = index;
        this.placementInfo = placementInfo;
        this.userIntent = userIntent;
        this.uuid = uuid;
    }

    @JsonProperty("clusterType")
    public String getClusterType() {
        return clusterType;
    }

    @JsonProperty("clusterType")
    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }

    @JsonProperty("index")
    public void setIndex(Integer index) {
        this.index = index;
    }

    @JsonProperty("placementInfo")
    public PlacementInfo getPlacementInfo() {
        return placementInfo;
    }

    @JsonProperty("placementInfo")
    public void setPlacementInfo(PlacementInfo placementInfo) {
        this.placementInfo = placementInfo;
    }

    @JsonProperty("userIntent")
    public UserIntent getUserIntent() {
        return userIntent;
    }

    @JsonProperty("userIntent")
    public void setUserIntent(UserIntent userIntent) {
        this.userIntent = userIntent;
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
        sb.append(Cluster.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("clusterType");
        sb.append('=');
        sb.append(((this.clusterType == null)?"<null>":this.clusterType));
        sb.append(',');
        sb.append("index");
        sb.append('=');
        sb.append(((this.index == null)?"<null>":this.index));
        sb.append(',');
        sb.append("placementInfo");
        sb.append('=');
        sb.append(((this.placementInfo == null)?"<null>":this.placementInfo));
        sb.append(',');
        sb.append("userIntent");
        sb.append('=');
        sb.append(((this.userIntent == null)?"<null>":this.userIntent));
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
