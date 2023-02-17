
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
    "diskIops",
    "mountPoints",
    "numVolumes",
    "storageClass",
    "storageType",
    "throughput",
    "volumeSize"
})
@Generated("jsonschema2pojo")
public class MasterDeviceInfo {

    @JsonProperty("diskIops")
    private Integer diskIops;
    @JsonProperty("mountPoints")
    private String mountPoints;
    @JsonProperty("numVolumes")
    private Integer numVolumes;
    @JsonProperty("storageClass")
    private String storageClass;
    @JsonProperty("storageType")
    private String storageType;
    @JsonProperty("throughput")
    private Integer throughput;
    @JsonProperty("volumeSize")
    private Integer volumeSize;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public MasterDeviceInfo() {
    }

    /**
     * 
     * @param diskIops
     * @param storageClass
     * @param numVolumes
     * @param mountPoints
     * @param storageType
     * @param throughput
     * @param volumeSize
     */
    public MasterDeviceInfo(Integer diskIops, String mountPoints, Integer numVolumes, String storageClass, String storageType, Integer throughput, Integer volumeSize) {
        super();
        this.diskIops = diskIops;
        this.mountPoints = mountPoints;
        this.numVolumes = numVolumes;
        this.storageClass = storageClass;
        this.storageType = storageType;
        this.throughput = throughput;
        this.volumeSize = volumeSize;
    }

    @JsonProperty("diskIops")
    public Integer getDiskIops() {
        return diskIops;
    }

    @JsonProperty("diskIops")
    public void setDiskIops(Integer diskIops) {
        this.diskIops = diskIops;
    }

    @JsonProperty("mountPoints")
    public String getMountPoints() {
        return mountPoints;
    }

    @JsonProperty("mountPoints")
    public void setMountPoints(String mountPoints) {
        this.mountPoints = mountPoints;
    }

    @JsonProperty("numVolumes")
    public Integer getNumVolumes() {
        return numVolumes;
    }

    @JsonProperty("numVolumes")
    public void setNumVolumes(Integer numVolumes) {
        this.numVolumes = numVolumes;
    }

    @JsonProperty("storageClass")
    public String getStorageClass() {
        return storageClass;
    }

    @JsonProperty("storageClass")
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    @JsonProperty("storageType")
    public String getStorageType() {
        return storageType;
    }

    @JsonProperty("storageType")
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    @JsonProperty("throughput")
    public Integer getThroughput() {
        return throughput;
    }

    @JsonProperty("throughput")
    public void setThroughput(Integer throughput) {
        this.throughput = throughput;
    }

    @JsonProperty("volumeSize")
    public Integer getVolumeSize() {
        return volumeSize;
    }

    @JsonProperty("volumeSize")
    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
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
        sb.append(MasterDeviceInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("diskIops");
        sb.append('=');
        sb.append(((this.diskIops == null)?"<null>":this.diskIops));
        sb.append(',');
        sb.append("mountPoints");
        sb.append('=');
        sb.append(((this.mountPoints == null)?"<null>":this.mountPoints));
        sb.append(',');
        sb.append("numVolumes");
        sb.append('=');
        sb.append(((this.numVolumes == null)?"<null>":this.numVolumes));
        sb.append(',');
        sb.append("storageClass");
        sb.append('=');
        sb.append(((this.storageClass == null)?"<null>":this.storageClass));
        sb.append(',');
        sb.append("storageType");
        sb.append('=');
        sb.append(((this.storageType == null)?"<null>":this.storageType));
        sb.append(',');
        sb.append("throughput");
        sb.append('=');
        sb.append(((this.throughput == null)?"<null>":this.throughput));
        sb.append(',');
        sb.append("volumeSize");
        sb.append('=');
        sb.append(((this.volumeSize == null)?"<null>":this.volumeSize));
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
