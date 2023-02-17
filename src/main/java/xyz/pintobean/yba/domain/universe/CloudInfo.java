
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
    "assignPublicIP",
    "az",
    "cloud",
    "instance_type",
    "kubernetesNamespace",
    "kubernetesPodName",
    "lun_indexes",
    "mount_roots",
    "private_dns",
    "private_ip",
    "public_dns",
    "public_ip",
    "region",
    "root_volume",
    "secondary_private_ip",
    "secondary_subnet_id",
    "subnet_id",
    "useTimeSync"
})
@Generated("jsonschema2pojo")
public class CloudInfo {

    @JsonProperty("assignPublicIP")
    private Boolean assignPublicIP;
    @JsonProperty("az")
    private String az;
    @JsonProperty("cloud")
    private String cloud;
    @JsonProperty("instance_type")
    private String instanceType;
    @JsonProperty("kubernetesNamespace")
    private String kubernetesNamespace;
    @JsonProperty("kubernetesPodName")
    private String kubernetesPodName;
    @JsonProperty("lun_indexes")
    private List<Integer> lunIndexes;
    @JsonProperty("mount_roots")
    private String mountRoots;
    @JsonProperty("private_dns")
    private String privateDns;
    @JsonProperty("private_ip")
    private String privateIp;
    @JsonProperty("public_dns")
    private String publicDns;
    @JsonProperty("public_ip")
    private String publicIp;
    @JsonProperty("region")
    private String region;
    @JsonProperty("root_volume")
    private String rootVolume;
    @JsonProperty("secondary_private_ip")
    private String secondaryPrivateIp;
    @JsonProperty("secondary_subnet_id")
    private String secondarySubnetId;
    @JsonProperty("subnet_id")
    private String subnetId;
    @JsonProperty("useTimeSync")
    private Boolean useTimeSync;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CloudInfo() {
    }

    /**
     * 
     * @param subnetId
     * @param kubernetesNamespace
     * @param useTimeSync
     * @param instanceType
     * @param privateIp
     * @param secondaryPrivateIp
     * @param kubernetesPodName
     * @param mountRoots
     * @param publicIp
     * @param lunIndexes
     * @param privateDns
     * @param cloud
     * @param secondarySubnetId
     * @param assignPublicIP
     * @param az
     * @param rootVolume
     * @param region
     * @param publicDns
     */
    public CloudInfo(Boolean assignPublicIP, String az, String cloud, String instanceType, String kubernetesNamespace, String kubernetesPodName, List<Integer> lunIndexes, String mountRoots, String privateDns, String privateIp, String publicDns, String publicIp, String region, String rootVolume, String secondaryPrivateIp, String secondarySubnetId, String subnetId, Boolean useTimeSync) {
        super();
        this.assignPublicIP = assignPublicIP;
        this.az = az;
        this.cloud = cloud;
        this.instanceType = instanceType;
        this.kubernetesNamespace = kubernetesNamespace;
        this.kubernetesPodName = kubernetesPodName;
        this.lunIndexes = lunIndexes;
        this.mountRoots = mountRoots;
        this.privateDns = privateDns;
        this.privateIp = privateIp;
        this.publicDns = publicDns;
        this.publicIp = publicIp;
        this.region = region;
        this.rootVolume = rootVolume;
        this.secondaryPrivateIp = secondaryPrivateIp;
        this.secondarySubnetId = secondarySubnetId;
        this.subnetId = subnetId;
        this.useTimeSync = useTimeSync;
    }

    @JsonProperty("assignPublicIP")
    public Boolean getAssignPublicIP() {
        return assignPublicIP;
    }

    @JsonProperty("assignPublicIP")
    public void setAssignPublicIP(Boolean assignPublicIP) {
        this.assignPublicIP = assignPublicIP;
    }

    @JsonProperty("az")
    public String getAz() {
        return az;
    }

    @JsonProperty("az")
    public void setAz(String az) {
        this.az = az;
    }

    @JsonProperty("cloud")
    public String getCloud() {
        return cloud;
    }

    @JsonProperty("cloud")
    public void setCloud(String cloud) {
        this.cloud = cloud;
    }

    @JsonProperty("instance_type")
    public String getInstanceType() {
        return instanceType;
    }

    @JsonProperty("instance_type")
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    @JsonProperty("kubernetesNamespace")
    public String getKubernetesNamespace() {
        return kubernetesNamespace;
    }

    @JsonProperty("kubernetesNamespace")
    public void setKubernetesNamespace(String kubernetesNamespace) {
        this.kubernetesNamespace = kubernetesNamespace;
    }

    @JsonProperty("kubernetesPodName")
    public String getKubernetesPodName() {
        return kubernetesPodName;
    }

    @JsonProperty("kubernetesPodName")
    public void setKubernetesPodName(String kubernetesPodName) {
        this.kubernetesPodName = kubernetesPodName;
    }

    @JsonProperty("lun_indexes")
    public List<Integer> getLunIndexes() {
        return lunIndexes;
    }

    @JsonProperty("lun_indexes")
    public void setLunIndexes(List<Integer> lunIndexes) {
        this.lunIndexes = lunIndexes;
    }

    @JsonProperty("mount_roots")
    public String getMountRoots() {
        return mountRoots;
    }

    @JsonProperty("mount_roots")
    public void setMountRoots(String mountRoots) {
        this.mountRoots = mountRoots;
    }

    @JsonProperty("private_dns")
    public String getPrivateDns() {
        return privateDns;
    }

    @JsonProperty("private_dns")
    public void setPrivateDns(String privateDns) {
        this.privateDns = privateDns;
    }

    @JsonProperty("private_ip")
    public String getPrivateIp() {
        return privateIp;
    }

    @JsonProperty("private_ip")
    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    @JsonProperty("public_dns")
    public String getPublicDns() {
        return publicDns;
    }

    @JsonProperty("public_dns")
    public void setPublicDns(String publicDns) {
        this.publicDns = publicDns;
    }

    @JsonProperty("public_ip")
    public String getPublicIp() {
        return publicIp;
    }

    @JsonProperty("public_ip")
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("root_volume")
    public String getRootVolume() {
        return rootVolume;
    }

    @JsonProperty("root_volume")
    public void setRootVolume(String rootVolume) {
        this.rootVolume = rootVolume;
    }

    @JsonProperty("secondary_private_ip")
    public String getSecondaryPrivateIp() {
        return secondaryPrivateIp;
    }

    @JsonProperty("secondary_private_ip")
    public void setSecondaryPrivateIp(String secondaryPrivateIp) {
        this.secondaryPrivateIp = secondaryPrivateIp;
    }

    @JsonProperty("secondary_subnet_id")
    public String getSecondarySubnetId() {
        return secondarySubnetId;
    }

    @JsonProperty("secondary_subnet_id")
    public void setSecondarySubnetId(String secondarySubnetId) {
        this.secondarySubnetId = secondarySubnetId;
    }

    @JsonProperty("subnet_id")
    public String getSubnetId() {
        return subnetId;
    }

    @JsonProperty("subnet_id")
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    @JsonProperty("useTimeSync")
    public Boolean getUseTimeSync() {
        return useTimeSync;
    }

    @JsonProperty("useTimeSync")
    public void setUseTimeSync(Boolean useTimeSync) {
        this.useTimeSync = useTimeSync;
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
        sb.append(CloudInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("assignPublicIP");
        sb.append('=');
        sb.append(((this.assignPublicIP == null)?"<null>":this.assignPublicIP));
        sb.append(',');
        sb.append("az");
        sb.append('=');
        sb.append(((this.az == null)?"<null>":this.az));
        sb.append(',');
        sb.append("cloud");
        sb.append('=');
        sb.append(((this.cloud == null)?"<null>":this.cloud));
        sb.append(',');
        sb.append("instanceType");
        sb.append('=');
        sb.append(((this.instanceType == null)?"<null>":this.instanceType));
        sb.append(',');
        sb.append("kubernetesNamespace");
        sb.append('=');
        sb.append(((this.kubernetesNamespace == null)?"<null>":this.kubernetesNamespace));
        sb.append(',');
        sb.append("kubernetesPodName");
        sb.append('=');
        sb.append(((this.kubernetesPodName == null)?"<null>":this.kubernetesPodName));
        sb.append(',');
        sb.append("lunIndexes");
        sb.append('=');
        sb.append(((this.lunIndexes == null)?"<null>":this.lunIndexes));
        sb.append(',');
        sb.append("mountRoots");
        sb.append('=');
        sb.append(((this.mountRoots == null)?"<null>":this.mountRoots));
        sb.append(',');
        sb.append("privateDns");
        sb.append('=');
        sb.append(((this.privateDns == null)?"<null>":this.privateDns));
        sb.append(',');
        sb.append("privateIp");
        sb.append('=');
        sb.append(((this.privateIp == null)?"<null>":this.privateIp));
        sb.append(',');
        sb.append("publicDns");
        sb.append('=');
        sb.append(((this.publicDns == null)?"<null>":this.publicDns));
        sb.append(',');
        sb.append("publicIp");
        sb.append('=');
        sb.append(((this.publicIp == null)?"<null>":this.publicIp));
        sb.append(',');
        sb.append("region");
        sb.append('=');
        sb.append(((this.region == null)?"<null>":this.region));
        sb.append(',');
        sb.append("rootVolume");
        sb.append('=');
        sb.append(((this.rootVolume == null)?"<null>":this.rootVolume));
        sb.append(',');
        sb.append("secondaryPrivateIp");
        sb.append('=');
        sb.append(((this.secondaryPrivateIp == null)?"<null>":this.secondaryPrivateIp));
        sb.append(',');
        sb.append("secondarySubnetId");
        sb.append('=');
        sb.append(((this.secondarySubnetId == null)?"<null>":this.secondarySubnetId));
        sb.append(',');
        sb.append("subnetId");
        sb.append('=');
        sb.append(((this.subnetId == null)?"<null>":this.subnetId));
        sb.append(',');
        sb.append("useTimeSync");
        sb.append('=');
        sb.append(((this.useTimeSync == null)?"<null>":this.useTimeSync));
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
