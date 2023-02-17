
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
    "isAffinitized",
    "lbName",
    "name",
    "numNodesInAZ",
    "replicationFactor",
    "secondarySubnet",
    "subnet",
    "uuid"
})
@Generated("jsonschema2pojo")
public class Az {

    @JsonProperty("isAffinitized")
    private Boolean isAffinitized;
    @JsonProperty("lbName")
    private String lbName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("numNodesInAZ")
    private Integer numNodesInAZ;
    @JsonProperty("replicationFactor")
    private Integer replicationFactor;
    @JsonProperty("secondarySubnet")
    private String secondarySubnet;
    @JsonProperty("subnet")
    private String subnet;
    @JsonProperty("uuid")
    private String uuid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Az() {
    }

    /**
     * 
     * @param replicationFactor
     * @param subnet
     * @param lbName
     * @param numNodesInAZ
     * @param name
     * @param isAffinitized
     * @param uuid
     * @param secondarySubnet
     */
    public Az(Boolean isAffinitized, String lbName, String name, Integer numNodesInAZ, Integer replicationFactor, String secondarySubnet, String subnet, String uuid) {
        super();
        this.isAffinitized = isAffinitized;
        this.lbName = lbName;
        this.name = name;
        this.numNodesInAZ = numNodesInAZ;
        this.replicationFactor = replicationFactor;
        this.secondarySubnet = secondarySubnet;
        this.subnet = subnet;
        this.uuid = uuid;
    }

    @JsonProperty("isAffinitized")
    public Boolean getIsAffinitized() {
        return isAffinitized;
    }

    @JsonProperty("isAffinitized")
    public void setIsAffinitized(Boolean isAffinitized) {
        this.isAffinitized = isAffinitized;
    }

    @JsonProperty("lbName")
    public String getLbName() {
        return lbName;
    }

    @JsonProperty("lbName")
    public void setLbName(String lbName) {
        this.lbName = lbName;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("numNodesInAZ")
    public Integer getNumNodesInAZ() {
        return numNodesInAZ;
    }

    @JsonProperty("numNodesInAZ")
    public void setNumNodesInAZ(Integer numNodesInAZ) {
        this.numNodesInAZ = numNodesInAZ;
    }

    @JsonProperty("replicationFactor")
    public Integer getReplicationFactor() {
        return replicationFactor;
    }

    @JsonProperty("replicationFactor")
    public void setReplicationFactor(Integer replicationFactor) {
        this.replicationFactor = replicationFactor;
    }

    @JsonProperty("secondarySubnet")
    public String getSecondarySubnet() {
        return secondarySubnet;
    }

    @JsonProperty("secondarySubnet")
    public void setSecondarySubnet(String secondarySubnet) {
        this.secondarySubnet = secondarySubnet;
    }

    @JsonProperty("subnet")
    public String getSubnet() {
        return subnet;
    }

    @JsonProperty("subnet")
    public void setSubnet(String subnet) {
        this.subnet = subnet;
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
        sb.append(Az.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isAffinitized");
        sb.append('=');
        sb.append(((this.isAffinitized == null)?"<null>":this.isAffinitized));
        sb.append(',');
        sb.append("lbName");
        sb.append('=');
        sb.append(((this.lbName == null)?"<null>":this.lbName));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("numNodesInAZ");
        sb.append('=');
        sb.append(((this.numNodesInAZ == null)?"<null>":this.numNodesInAZ));
        sb.append(',');
        sb.append("replicationFactor");
        sb.append('=');
        sb.append(((this.replicationFactor == null)?"<null>":this.replicationFactor));
        sb.append(',');
        sb.append("secondarySubnet");
        sb.append('=');
        sb.append(((this.secondarySubnet == null)?"<null>":this.secondarySubnet));
        sb.append(',');
        sb.append("subnet");
        sb.append('=');
        sb.append(((this.subnet == null)?"<null>":this.subnet));
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
