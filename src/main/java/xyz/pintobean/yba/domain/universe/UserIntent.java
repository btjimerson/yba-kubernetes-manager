
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
    "accessKeyCode",
    "assignPublicIP",
    "assignStaticPublicIP",
    "awsArnString",
    "azOverrides",
    "dedicatedNodes",
    "deviceInfo",
    "enableClientToNodeEncrypt",
    "enableExposingService",
    "enableIPV6",
    "enableLB",
    "enableNodeToNodeEncrypt",
    "enableVolumeEncryption",
    "enableYCQL",
    "enableYCQLAuth",
    "enableYEDIS",
    "enableYSQL",
    "enableYSQLAuth",
    "instanceTags",
    "instanceType",
    "masterDeviceInfo",
    "masterGFlags",
    "masterInstanceType",
    "numNodes",
    "preferredRegion",
    "provider",
    "providerType",
    "regionList",
    "replicationFactor",
    "tserverGFlags",
    "universeName",
    "universeOverrides",
    "useHostname",
    "useSystemd",
    "useTimeSync",
    "ybSoftwareVersion",
    "ybcFlags",
    "ycqlPassword",
    "ysqlPassword"
})
@Generated("jsonschema2pojo")
public class UserIntent {

    @JsonProperty("accessKeyCode")
    private String accessKeyCode;
    @JsonProperty("assignPublicIP")
    private Boolean assignPublicIP;
    @JsonProperty("assignStaticPublicIP")
    private Boolean assignStaticPublicIP;
    @JsonProperty("awsArnString")
    private String awsArnString;
    @JsonProperty("azOverrides")
    private AzOverrides azOverrides;
    @JsonProperty("dedicatedNodes")
    private Boolean dedicatedNodes;
    @JsonProperty("deviceInfo")
    private DeviceInfo deviceInfo;
    @JsonProperty("enableClientToNodeEncrypt")
    private Boolean enableClientToNodeEncrypt;
    @JsonProperty("enableExposingService")
    private String enableExposingService;
    @JsonProperty("enableIPV6")
    private Boolean enableIPV6;
    @JsonProperty("enableLB")
    private Boolean enableLB;
    @JsonProperty("enableNodeToNodeEncrypt")
    private Boolean enableNodeToNodeEncrypt;
    @JsonProperty("enableVolumeEncryption")
    private Boolean enableVolumeEncryption;
    @JsonProperty("enableYCQL")
    private Boolean enableYCQL;
    @JsonProperty("enableYCQLAuth")
    private Boolean enableYCQLAuth;
    @JsonProperty("enableYEDIS")
    private Boolean enableYEDIS;
    @JsonProperty("enableYSQL")
    private Boolean enableYSQL;
    @JsonProperty("enableYSQLAuth")
    private Boolean enableYSQLAuth;
    @JsonProperty("instanceTags")
    private InstanceTags instanceTags;
    @JsonProperty("instanceType")
    private String instanceType;
    @JsonProperty("masterDeviceInfo")
    private MasterDeviceInfo masterDeviceInfo;
    @JsonProperty("masterGFlags")
    private MasterGFlags masterGFlags;
    @JsonProperty("masterInstanceType")
    private String masterInstanceType;
    @JsonProperty("numNodes")
    private Integer numNodes;
    @JsonProperty("preferredRegion")
    private String preferredRegion;
    @JsonProperty("provider")
    private String provider;
    @JsonProperty("providerType")
    private String providerType;
    @JsonProperty("regionList")
    private List<String> regionList;
    @JsonProperty("replicationFactor")
    private Integer replicationFactor;
    @JsonProperty("tserverGFlags")
    private TserverGFlags tserverGFlags;
    @JsonProperty("universeName")
    private String universeName;
    @JsonProperty("universeOverrides")
    private String universeOverrides;
    @JsonProperty("useHostname")
    private Boolean useHostname;
    @JsonProperty("useSystemd")
    private Boolean useSystemd;
    @JsonProperty("useTimeSync")
    private Boolean useTimeSync;
    @JsonProperty("ybSoftwareVersion")
    private String ybSoftwareVersion;
    @JsonProperty("ybcFlags")
    private YbcFlags ybcFlags;
    @JsonProperty("ycqlPassword")
    private String ycqlPassword;
    @JsonProperty("ysqlPassword")
    private String ysqlPassword;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public UserIntent() {
    }

    /**
     * 
     * @param replicationFactor
     * @param useSystemd
     * @param enableNodeToNodeEncrypt
     * @param preferredRegion
     * @param enableYCQLAuth
     * @param azOverrides
     * @param instanceTags
     * @param providerType
     * @param tserverGFlags
     * @param ysqlPassword
     * @param enableYEDIS
     * @param enableVolumeEncryption
     * @param provider
     * @param accessKeyCode
     * @param enableLB
     * @param enableIPV6
     * @param enableYSQLAuth
     * @param dedicatedNodes
     * @param universeName
     * @param ybcFlags
     * @param assignStaticPublicIP
     * @param enableYSQL
     * @param useTimeSync
     * @param regionList
     * @param useHostname
     * @param instanceType
     * @param universeOverrides
     * @param masterInstanceType
     * @param ybSoftwareVersion
     * @param deviceInfo
     * @param masterDeviceInfo
     * @param enableYCQL
     * @param numNodes
     * @param assignPublicIP
     * @param ycqlPassword
     * @param enableClientToNodeEncrypt
     * @param awsArnString
     * @param enableExposingService
     * @param masterGFlags
     */
    public UserIntent(String accessKeyCode, Boolean assignPublicIP, Boolean assignStaticPublicIP, String awsArnString, AzOverrides azOverrides, Boolean dedicatedNodes, DeviceInfo deviceInfo, Boolean enableClientToNodeEncrypt, String enableExposingService, Boolean enableIPV6, Boolean enableLB, Boolean enableNodeToNodeEncrypt, Boolean enableVolumeEncryption, Boolean enableYCQL, Boolean enableYCQLAuth, Boolean enableYEDIS, Boolean enableYSQL, Boolean enableYSQLAuth, InstanceTags instanceTags, String instanceType, MasterDeviceInfo masterDeviceInfo, MasterGFlags masterGFlags, String masterInstanceType, Integer numNodes, String preferredRegion, String provider, String providerType, List<String> regionList, Integer replicationFactor, TserverGFlags tserverGFlags, String universeName, String universeOverrides, Boolean useHostname, Boolean useSystemd, Boolean useTimeSync, String ybSoftwareVersion, YbcFlags ybcFlags, String ycqlPassword, String ysqlPassword) {
        super();
        this.accessKeyCode = accessKeyCode;
        this.assignPublicIP = assignPublicIP;
        this.assignStaticPublicIP = assignStaticPublicIP;
        this.awsArnString = awsArnString;
        this.azOverrides = azOverrides;
        this.dedicatedNodes = dedicatedNodes;
        this.deviceInfo = deviceInfo;
        this.enableClientToNodeEncrypt = enableClientToNodeEncrypt;
        this.enableExposingService = enableExposingService;
        this.enableIPV6 = enableIPV6;
        this.enableLB = enableLB;
        this.enableNodeToNodeEncrypt = enableNodeToNodeEncrypt;
        this.enableVolumeEncryption = enableVolumeEncryption;
        this.enableYCQL = enableYCQL;
        this.enableYCQLAuth = enableYCQLAuth;
        this.enableYEDIS = enableYEDIS;
        this.enableYSQL = enableYSQL;
        this.enableYSQLAuth = enableYSQLAuth;
        this.instanceTags = instanceTags;
        this.instanceType = instanceType;
        this.masterDeviceInfo = masterDeviceInfo;
        this.masterGFlags = masterGFlags;
        this.masterInstanceType = masterInstanceType;
        this.numNodes = numNodes;
        this.preferredRegion = preferredRegion;
        this.provider = provider;
        this.providerType = providerType;
        this.regionList = regionList;
        this.replicationFactor = replicationFactor;
        this.tserverGFlags = tserverGFlags;
        this.universeName = universeName;
        this.universeOverrides = universeOverrides;
        this.useHostname = useHostname;
        this.useSystemd = useSystemd;
        this.useTimeSync = useTimeSync;
        this.ybSoftwareVersion = ybSoftwareVersion;
        this.ybcFlags = ybcFlags;
        this.ycqlPassword = ycqlPassword;
        this.ysqlPassword = ysqlPassword;
    }

    @JsonProperty("accessKeyCode")
    public String getAccessKeyCode() {
        return accessKeyCode;
    }

    @JsonProperty("accessKeyCode")
    public void setAccessKeyCode(String accessKeyCode) {
        this.accessKeyCode = accessKeyCode;
    }

    @JsonProperty("assignPublicIP")
    public Boolean getAssignPublicIP() {
        return assignPublicIP;
    }

    @JsonProperty("assignPublicIP")
    public void setAssignPublicIP(Boolean assignPublicIP) {
        this.assignPublicIP = assignPublicIP;
    }

    @JsonProperty("assignStaticPublicIP")
    public Boolean getAssignStaticPublicIP() {
        return assignStaticPublicIP;
    }

    @JsonProperty("assignStaticPublicIP")
    public void setAssignStaticPublicIP(Boolean assignStaticPublicIP) {
        this.assignStaticPublicIP = assignStaticPublicIP;
    }

    @JsonProperty("awsArnString")
    public String getAwsArnString() {
        return awsArnString;
    }

    @JsonProperty("awsArnString")
    public void setAwsArnString(String awsArnString) {
        this.awsArnString = awsArnString;
    }

    @JsonProperty("azOverrides")
    public AzOverrides getAzOverrides() {
        return azOverrides;
    }

    @JsonProperty("azOverrides")
    public void setAzOverrides(AzOverrides azOverrides) {
        this.azOverrides = azOverrides;
    }

    @JsonProperty("dedicatedNodes")
    public Boolean getDedicatedNodes() {
        return dedicatedNodes;
    }

    @JsonProperty("dedicatedNodes")
    public void setDedicatedNodes(Boolean dedicatedNodes) {
        this.dedicatedNodes = dedicatedNodes;
    }

    @JsonProperty("deviceInfo")
    public DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    @JsonProperty("deviceInfo")
    public void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    @JsonProperty("enableClientToNodeEncrypt")
    public Boolean getEnableClientToNodeEncrypt() {
        return enableClientToNodeEncrypt;
    }

    @JsonProperty("enableClientToNodeEncrypt")
    public void setEnableClientToNodeEncrypt(Boolean enableClientToNodeEncrypt) {
        this.enableClientToNodeEncrypt = enableClientToNodeEncrypt;
    }

    @JsonProperty("enableExposingService")
    public String getEnableExposingService() {
        return enableExposingService;
    }

    @JsonProperty("enableExposingService")
    public void setEnableExposingService(String enableExposingService) {
        this.enableExposingService = enableExposingService;
    }

    @JsonProperty("enableIPV6")
    public Boolean getEnableIPV6() {
        return enableIPV6;
    }

    @JsonProperty("enableIPV6")
    public void setEnableIPV6(Boolean enableIPV6) {
        this.enableIPV6 = enableIPV6;
    }

    @JsonProperty("enableLB")
    public Boolean getEnableLB() {
        return enableLB;
    }

    @JsonProperty("enableLB")
    public void setEnableLB(Boolean enableLB) {
        this.enableLB = enableLB;
    }

    @JsonProperty("enableNodeToNodeEncrypt")
    public Boolean getEnableNodeToNodeEncrypt() {
        return enableNodeToNodeEncrypt;
    }

    @JsonProperty("enableNodeToNodeEncrypt")
    public void setEnableNodeToNodeEncrypt(Boolean enableNodeToNodeEncrypt) {
        this.enableNodeToNodeEncrypt = enableNodeToNodeEncrypt;
    }

    @JsonProperty("enableVolumeEncryption")
    public Boolean getEnableVolumeEncryption() {
        return enableVolumeEncryption;
    }

    @JsonProperty("enableVolumeEncryption")
    public void setEnableVolumeEncryption(Boolean enableVolumeEncryption) {
        this.enableVolumeEncryption = enableVolumeEncryption;
    }

    @JsonProperty("enableYCQL")
    public Boolean getEnableYCQL() {
        return enableYCQL;
    }

    @JsonProperty("enableYCQL")
    public void setEnableYCQL(Boolean enableYCQL) {
        this.enableYCQL = enableYCQL;
    }

    @JsonProperty("enableYCQLAuth")
    public Boolean getEnableYCQLAuth() {
        return enableYCQLAuth;
    }

    @JsonProperty("enableYCQLAuth")
    public void setEnableYCQLAuth(Boolean enableYCQLAuth) {
        this.enableYCQLAuth = enableYCQLAuth;
    }

    @JsonProperty("enableYEDIS")
    public Boolean getEnableYEDIS() {
        return enableYEDIS;
    }

    @JsonProperty("enableYEDIS")
    public void setEnableYEDIS(Boolean enableYEDIS) {
        this.enableYEDIS = enableYEDIS;
    }

    @JsonProperty("enableYSQL")
    public Boolean getEnableYSQL() {
        return enableYSQL;
    }

    @JsonProperty("enableYSQL")
    public void setEnableYSQL(Boolean enableYSQL) {
        this.enableYSQL = enableYSQL;
    }

    @JsonProperty("enableYSQLAuth")
    public Boolean getEnableYSQLAuth() {
        return enableYSQLAuth;
    }

    @JsonProperty("enableYSQLAuth")
    public void setEnableYSQLAuth(Boolean enableYSQLAuth) {
        this.enableYSQLAuth = enableYSQLAuth;
    }

    @JsonProperty("instanceTags")
    public InstanceTags getInstanceTags() {
        return instanceTags;
    }

    @JsonProperty("instanceTags")
    public void setInstanceTags(InstanceTags instanceTags) {
        this.instanceTags = instanceTags;
    }

    @JsonProperty("instanceType")
    public String getInstanceType() {
        return instanceType;
    }

    @JsonProperty("instanceType")
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    @JsonProperty("masterDeviceInfo")
    public MasterDeviceInfo getMasterDeviceInfo() {
        return masterDeviceInfo;
    }

    @JsonProperty("masterDeviceInfo")
    public void setMasterDeviceInfo(MasterDeviceInfo masterDeviceInfo) {
        this.masterDeviceInfo = masterDeviceInfo;
    }

    @JsonProperty("masterGFlags")
    public MasterGFlags getMasterGFlags() {
        return masterGFlags;
    }

    @JsonProperty("masterGFlags")
    public void setMasterGFlags(MasterGFlags masterGFlags) {
        this.masterGFlags = masterGFlags;
    }

    @JsonProperty("masterInstanceType")
    public String getMasterInstanceType() {
        return masterInstanceType;
    }

    @JsonProperty("masterInstanceType")
    public void setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
    }

    @JsonProperty("numNodes")
    public Integer getNumNodes() {
        return numNodes;
    }

    @JsonProperty("numNodes")
    public void setNumNodes(Integer numNodes) {
        this.numNodes = numNodes;
    }

    @JsonProperty("preferredRegion")
    public String getPreferredRegion() {
        return preferredRegion;
    }

    @JsonProperty("preferredRegion")
    public void setPreferredRegion(String preferredRegion) {
        this.preferredRegion = preferredRegion;
    }

    @JsonProperty("provider")
    public String getProvider() {
        return provider;
    }

    @JsonProperty("provider")
    public void setProvider(String provider) {
        this.provider = provider;
    }

    @JsonProperty("providerType")
    public String getProviderType() {
        return providerType;
    }

    @JsonProperty("providerType")
    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    @JsonProperty("regionList")
    public List<String> getRegionList() {
        return regionList;
    }

    @JsonProperty("regionList")
    public void setRegionList(List<String> regionList) {
        this.regionList = regionList;
    }

    @JsonProperty("replicationFactor")
    public Integer getReplicationFactor() {
        return replicationFactor;
    }

    @JsonProperty("replicationFactor")
    public void setReplicationFactor(Integer replicationFactor) {
        this.replicationFactor = replicationFactor;
    }

    @JsonProperty("tserverGFlags")
    public TserverGFlags getTserverGFlags() {
        return tserverGFlags;
    }

    @JsonProperty("tserverGFlags")
    public void setTserverGFlags(TserverGFlags tserverGFlags) {
        this.tserverGFlags = tserverGFlags;
    }

    @JsonProperty("universeName")
    public String getUniverseName() {
        return universeName;
    }

    @JsonProperty("universeName")
    public void setUniverseName(String universeName) {
        this.universeName = universeName;
    }

    @JsonProperty("universeOverrides")
    public String getUniverseOverrides() {
        return universeOverrides;
    }

    @JsonProperty("universeOverrides")
    public void setUniverseOverrides(String universeOverrides) {
        this.universeOverrides = universeOverrides;
    }

    @JsonProperty("useHostname")
    public Boolean getUseHostname() {
        return useHostname;
    }

    @JsonProperty("useHostname")
    public void setUseHostname(Boolean useHostname) {
        this.useHostname = useHostname;
    }

    @JsonProperty("useSystemd")
    public Boolean getUseSystemd() {
        return useSystemd;
    }

    @JsonProperty("useSystemd")
    public void setUseSystemd(Boolean useSystemd) {
        this.useSystemd = useSystemd;
    }

    @JsonProperty("useTimeSync")
    public Boolean getUseTimeSync() {
        return useTimeSync;
    }

    @JsonProperty("useTimeSync")
    public void setUseTimeSync(Boolean useTimeSync) {
        this.useTimeSync = useTimeSync;
    }

    @JsonProperty("ybSoftwareVersion")
    public String getYbSoftwareVersion() {
        return ybSoftwareVersion;
    }

    @JsonProperty("ybSoftwareVersion")
    public void setYbSoftwareVersion(String ybSoftwareVersion) {
        this.ybSoftwareVersion = ybSoftwareVersion;
    }

    @JsonProperty("ybcFlags")
    public YbcFlags getYbcFlags() {
        return ybcFlags;
    }

    @JsonProperty("ybcFlags")
    public void setYbcFlags(YbcFlags ybcFlags) {
        this.ybcFlags = ybcFlags;
    }

    @JsonProperty("ycqlPassword")
    public String getYcqlPassword() {
        return ycqlPassword;
    }

    @JsonProperty("ycqlPassword")
    public void setYcqlPassword(String ycqlPassword) {
        this.ycqlPassword = ycqlPassword;
    }

    @JsonProperty("ysqlPassword")
    public String getYsqlPassword() {
        return ysqlPassword;
    }

    @JsonProperty("ysqlPassword")
    public void setYsqlPassword(String ysqlPassword) {
        this.ysqlPassword = ysqlPassword;
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
        sb.append(UserIntent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accessKeyCode");
        sb.append('=');
        sb.append(((this.accessKeyCode == null)?"<null>":this.accessKeyCode));
        sb.append(',');
        sb.append("assignPublicIP");
        sb.append('=');
        sb.append(((this.assignPublicIP == null)?"<null>":this.assignPublicIP));
        sb.append(',');
        sb.append("assignStaticPublicIP");
        sb.append('=');
        sb.append(((this.assignStaticPublicIP == null)?"<null>":this.assignStaticPublicIP));
        sb.append(',');
        sb.append("awsArnString");
        sb.append('=');
        sb.append(((this.awsArnString == null)?"<null>":this.awsArnString));
        sb.append(',');
        sb.append("azOverrides");
        sb.append('=');
        sb.append(((this.azOverrides == null)?"<null>":this.azOverrides));
        sb.append(',');
        sb.append("dedicatedNodes");
        sb.append('=');
        sb.append(((this.dedicatedNodes == null)?"<null>":this.dedicatedNodes));
        sb.append(',');
        sb.append("deviceInfo");
        sb.append('=');
        sb.append(((this.deviceInfo == null)?"<null>":this.deviceInfo));
        sb.append(',');
        sb.append("enableClientToNodeEncrypt");
        sb.append('=');
        sb.append(((this.enableClientToNodeEncrypt == null)?"<null>":this.enableClientToNodeEncrypt));
        sb.append(',');
        sb.append("enableExposingService");
        sb.append('=');
        sb.append(((this.enableExposingService == null)?"<null>":this.enableExposingService));
        sb.append(',');
        sb.append("enableIPV6");
        sb.append('=');
        sb.append(((this.enableIPV6 == null)?"<null>":this.enableIPV6));
        sb.append(',');
        sb.append("enableLB");
        sb.append('=');
        sb.append(((this.enableLB == null)?"<null>":this.enableLB));
        sb.append(',');
        sb.append("enableNodeToNodeEncrypt");
        sb.append('=');
        sb.append(((this.enableNodeToNodeEncrypt == null)?"<null>":this.enableNodeToNodeEncrypt));
        sb.append(',');
        sb.append("enableVolumeEncryption");
        sb.append('=');
        sb.append(((this.enableVolumeEncryption == null)?"<null>":this.enableVolumeEncryption));
        sb.append(',');
        sb.append("enableYCQL");
        sb.append('=');
        sb.append(((this.enableYCQL == null)?"<null>":this.enableYCQL));
        sb.append(',');
        sb.append("enableYCQLAuth");
        sb.append('=');
        sb.append(((this.enableYCQLAuth == null)?"<null>":this.enableYCQLAuth));
        sb.append(',');
        sb.append("enableYEDIS");
        sb.append('=');
        sb.append(((this.enableYEDIS == null)?"<null>":this.enableYEDIS));
        sb.append(',');
        sb.append("enableYSQL");
        sb.append('=');
        sb.append(((this.enableYSQL == null)?"<null>":this.enableYSQL));
        sb.append(',');
        sb.append("enableYSQLAuth");
        sb.append('=');
        sb.append(((this.enableYSQLAuth == null)?"<null>":this.enableYSQLAuth));
        sb.append(',');
        sb.append("instanceTags");
        sb.append('=');
        sb.append(((this.instanceTags == null)?"<null>":this.instanceTags));
        sb.append(',');
        sb.append("instanceType");
        sb.append('=');
        sb.append(((this.instanceType == null)?"<null>":this.instanceType));
        sb.append(',');
        sb.append("masterDeviceInfo");
        sb.append('=');
        sb.append(((this.masterDeviceInfo == null)?"<null>":this.masterDeviceInfo));
        sb.append(',');
        sb.append("masterGFlags");
        sb.append('=');
        sb.append(((this.masterGFlags == null)?"<null>":this.masterGFlags));
        sb.append(',');
        sb.append("masterInstanceType");
        sb.append('=');
        sb.append(((this.masterInstanceType == null)?"<null>":this.masterInstanceType));
        sb.append(',');
        sb.append("numNodes");
        sb.append('=');
        sb.append(((this.numNodes == null)?"<null>":this.numNodes));
        sb.append(',');
        sb.append("preferredRegion");
        sb.append('=');
        sb.append(((this.preferredRegion == null)?"<null>":this.preferredRegion));
        sb.append(',');
        sb.append("provider");
        sb.append('=');
        sb.append(((this.provider == null)?"<null>":this.provider));
        sb.append(',');
        sb.append("providerType");
        sb.append('=');
        sb.append(((this.providerType == null)?"<null>":this.providerType));
        sb.append(',');
        sb.append("regionList");
        sb.append('=');
        sb.append(((this.regionList == null)?"<null>":this.regionList));
        sb.append(',');
        sb.append("replicationFactor");
        sb.append('=');
        sb.append(((this.replicationFactor == null)?"<null>":this.replicationFactor));
        sb.append(',');
        sb.append("tserverGFlags");
        sb.append('=');
        sb.append(((this.tserverGFlags == null)?"<null>":this.tserverGFlags));
        sb.append(',');
        sb.append("universeName");
        sb.append('=');
        sb.append(((this.universeName == null)?"<null>":this.universeName));
        sb.append(',');
        sb.append("universeOverrides");
        sb.append('=');
        sb.append(((this.universeOverrides == null)?"<null>":this.universeOverrides));
        sb.append(',');
        sb.append("useHostname");
        sb.append('=');
        sb.append(((this.useHostname == null)?"<null>":this.useHostname));
        sb.append(',');
        sb.append("useSystemd");
        sb.append('=');
        sb.append(((this.useSystemd == null)?"<null>":this.useSystemd));
        sb.append(',');
        sb.append("useTimeSync");
        sb.append('=');
        sb.append(((this.useTimeSync == null)?"<null>":this.useTimeSync));
        sb.append(',');
        sb.append("ybSoftwareVersion");
        sb.append('=');
        sb.append(((this.ybSoftwareVersion == null)?"<null>":this.ybSoftwareVersion));
        sb.append(',');
        sb.append("ybcFlags");
        sb.append('=');
        sb.append(((this.ybcFlags == null)?"<null>":this.ybcFlags));
        sb.append(',');
        sb.append("ycqlPassword");
        sb.append('=');
        sb.append(((this.ycqlPassword == null)?"<null>":this.ycqlPassword));
        sb.append(',');
        sb.append("ysqlPassword");
        sb.append('=');
        sb.append(((this.ysqlPassword == null)?"<null>":this.ysqlPassword));
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
