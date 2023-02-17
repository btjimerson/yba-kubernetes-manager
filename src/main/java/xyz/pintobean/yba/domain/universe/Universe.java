
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
    "allowGeoPartitioning",
    "allowInsecure",
    "capability",
    "clientRootCA",
    "clusterOperation",
    "clusters",
    "cmkArn",
    "communicationPorts",
    "creatingUser",
    "currentClusterType",
    "deviceInfo",
    "enableYbc",
    "encryptionAtRestConfig",
    "errorString",
    "expectedUniverseVersion",
    "extraDependencies",
    "firstTry",
    "importedState",
    "installYbc",
    "itestS3PackagePath",
    "mastersInDefaultRegion",
    "nextClusterIndex",
    "nodeDetailsSet",
    "nodeExporterUser",
    "nodePrefix",
    "nodesResizeAvailable",
    "platformUrl",
    "platformVersion",
    "previousTaskUUID",
    "regionsChanged",
    "remotePackagePath",
    "resetAZConfig",
    "rootAndClientRootCASame",
    "rootCA",
    "setTxnTableWaitCountFlag",
    "sleepAfterMasterRestartMillis",
    "sleepAfterTServerRestartMillis",
    "sshUserOverride",
    "universePaused",
    "universeUUID",
    "updateInProgress",
    "updateOptions",
    "updateSucceeded",
    "updatingTask",
    "updatingTaskUUID",
    "useNewHelmNamingStyle",
    "userAZSelected",
    "xclusterInfo",
    "ybPrevSoftwareVersion",
    "ybcInstalled",
    "ybcSoftwareVersion"
})
@Generated("jsonschema2pojo")
public class Universe {

    @JsonProperty("allowGeoPartitioning")
    private Boolean allowGeoPartitioning;
    @JsonProperty("allowInsecure")
    private Boolean allowInsecure;
    @JsonProperty("capability")
    private String capability;
    @JsonProperty("clientRootCA")
    private String clientRootCA;
    @JsonProperty("clusterOperation")
    private String clusterOperation;
    @JsonProperty("clusters")
    private List<Cluster> clusters;
    @JsonProperty("cmkArn")
    private String cmkArn;
    @JsonProperty("communicationPorts")
    private CommunicationPorts communicationPorts;
    @JsonProperty("creatingUser")
    private CreatingUser creatingUser;
    @JsonProperty("currentClusterType")
    private String currentClusterType;
    @JsonProperty("deviceInfo")
    private DeviceInfo__1 deviceInfo;
    @JsonProperty("enableYbc")
    private Boolean enableYbc;
    @JsonProperty("encryptionAtRestConfig")
    private EncryptionAtRestConfig encryptionAtRestConfig;
    @JsonProperty("errorString")
    private String errorString;
    @JsonProperty("expectedUniverseVersion")
    private Integer expectedUniverseVersion;
    @JsonProperty("extraDependencies")
    private ExtraDependencies extraDependencies;
    @JsonProperty("firstTry")
    private Boolean firstTry;
    @JsonProperty("importedState")
    private String importedState;
    @JsonProperty("installYbc")
    private Boolean installYbc;
    @JsonProperty("itestS3PackagePath")
    private String itestS3PackagePath;
    @JsonProperty("mastersInDefaultRegion")
    private Boolean mastersInDefaultRegion;
    @JsonProperty("nextClusterIndex")
    private Integer nextClusterIndex;
    @JsonProperty("nodeDetailsSet")
    private List<NodeDetailsSet> nodeDetailsSet;
    @JsonProperty("nodeExporterUser")
    private String nodeExporterUser;
    @JsonProperty("nodePrefix")
    private String nodePrefix;
    @JsonProperty("nodesResizeAvailable")
    private Boolean nodesResizeAvailable;
    @JsonProperty("platformUrl")
    private String platformUrl;
    @JsonProperty("platformVersion")
    private String platformVersion;
    @JsonProperty("previousTaskUUID")
    private String previousTaskUUID;
    @JsonProperty("regionsChanged")
    private Boolean regionsChanged;
    @JsonProperty("remotePackagePath")
    private String remotePackagePath;
    @JsonProperty("resetAZConfig")
    private Boolean resetAZConfig;
    @JsonProperty("rootAndClientRootCASame")
    private Boolean rootAndClientRootCASame;
    @JsonProperty("rootCA")
    private String rootCA;
    @JsonProperty("setTxnTableWaitCountFlag")
    private Boolean setTxnTableWaitCountFlag;
    @JsonProperty("sleepAfterMasterRestartMillis")
    private Integer sleepAfterMasterRestartMillis;
    @JsonProperty("sleepAfterTServerRestartMillis")
    private Integer sleepAfterTServerRestartMillis;
    @JsonProperty("sshUserOverride")
    private String sshUserOverride;
    @JsonProperty("universePaused")
    private Boolean universePaused;
    @JsonProperty("universeUUID")
    private String universeUUID;
    @JsonProperty("updateInProgress")
    private Boolean updateInProgress;
    @JsonProperty("updateOptions")
    private List<String> updateOptions;
    @JsonProperty("updateSucceeded")
    private Boolean updateSucceeded;
    @JsonProperty("updatingTask")
    private String updatingTask;
    @JsonProperty("updatingTaskUUID")
    private String updatingTaskUUID;
    @JsonProperty("useNewHelmNamingStyle")
    private Boolean useNewHelmNamingStyle;
    @JsonProperty("userAZSelected")
    private Boolean userAZSelected;
    @JsonProperty("xclusterInfo")
    private XclusterInfo xclusterInfo;
    @JsonProperty("ybPrevSoftwareVersion")
    private String ybPrevSoftwareVersion;
    @JsonProperty("ybcInstalled")
    private Boolean ybcInstalled;
    @JsonProperty("ybcSoftwareVersion")
    private String ybcSoftwareVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Universe() {
    }

    /**
     * 
     * @param expectedUniverseVersion
     * @param nodeExporterUser
     * @param rootCA
     * @param nodesResizeAvailable
     * @param updatingTaskUUID
     * @param allowInsecure
     * @param sleepAfterTServerRestartMillis
     * @param clusterOperation
     * @param universePaused
     * @param updateSucceeded
     * @param useNewHelmNamingStyle
     * @param updateInProgress
     * @param deviceInfo
     * @param enableYbc
     * @param updatingTask
     * @param nodeDetailsSet
     * @param remotePackagePath
     * @param ybcInstalled
     * @param communicationPorts
     * @param rootAndClientRootCASame
     * @param sleepAfterMasterRestartMillis
     * @param resetAZConfig
     * @param userAZSelected
     * @param encryptionAtRestConfig
     * @param updateOptions
     * @param nodePrefix
     * @param allowGeoPartitioning
     * @param itestS3PackagePath
     * @param capability
     * @param firstTry
     * @param regionsChanged
     * @param ybcSoftwareVersion
     * @param creatingUser
     * @param extraDependencies
     * @param sshUserOverride
     * @param platformVersion
     * @param clusters
     * @param mastersInDefaultRegion
     * @param platformUrl
     * @param xclusterInfo
     * @param importedState
     * @param setTxnTableWaitCountFlag
     * @param ybPrevSoftwareVersion
     * @param nextClusterIndex
     * @param universeUUID
     * @param errorString
     * @param clientRootCA
     * @param installYbc
     * @param currentClusterType
     * @param cmkArn
     * @param previousTaskUUID
     */
    public Universe(Boolean allowGeoPartitioning, Boolean allowInsecure, String capability, String clientRootCA, String clusterOperation, List<Cluster> clusters, String cmkArn, CommunicationPorts communicationPorts, CreatingUser creatingUser, String currentClusterType, DeviceInfo__1 deviceInfo, Boolean enableYbc, EncryptionAtRestConfig encryptionAtRestConfig, String errorString, Integer expectedUniverseVersion, ExtraDependencies extraDependencies, Boolean firstTry, String importedState, Boolean installYbc, String itestS3PackagePath, Boolean mastersInDefaultRegion, Integer nextClusterIndex, List<NodeDetailsSet> nodeDetailsSet, String nodeExporterUser, String nodePrefix, Boolean nodesResizeAvailable, String platformUrl, String platformVersion, String previousTaskUUID, Boolean regionsChanged, String remotePackagePath, Boolean resetAZConfig, Boolean rootAndClientRootCASame, String rootCA, Boolean setTxnTableWaitCountFlag, Integer sleepAfterMasterRestartMillis, Integer sleepAfterTServerRestartMillis, String sshUserOverride, Boolean universePaused, String universeUUID, Boolean updateInProgress, List<String> updateOptions, Boolean updateSucceeded, String updatingTask, String updatingTaskUUID, Boolean useNewHelmNamingStyle, Boolean userAZSelected, XclusterInfo xclusterInfo, String ybPrevSoftwareVersion, Boolean ybcInstalled, String ybcSoftwareVersion) {
        super();
        this.allowGeoPartitioning = allowGeoPartitioning;
        this.allowInsecure = allowInsecure;
        this.capability = capability;
        this.clientRootCA = clientRootCA;
        this.clusterOperation = clusterOperation;
        this.clusters = clusters;
        this.cmkArn = cmkArn;
        this.communicationPorts = communicationPorts;
        this.creatingUser = creatingUser;
        this.currentClusterType = currentClusterType;
        this.deviceInfo = deviceInfo;
        this.enableYbc = enableYbc;
        this.encryptionAtRestConfig = encryptionAtRestConfig;
        this.errorString = errorString;
        this.expectedUniverseVersion = expectedUniverseVersion;
        this.extraDependencies = extraDependencies;
        this.firstTry = firstTry;
        this.importedState = importedState;
        this.installYbc = installYbc;
        this.itestS3PackagePath = itestS3PackagePath;
        this.mastersInDefaultRegion = mastersInDefaultRegion;
        this.nextClusterIndex = nextClusterIndex;
        this.nodeDetailsSet = nodeDetailsSet;
        this.nodeExporterUser = nodeExporterUser;
        this.nodePrefix = nodePrefix;
        this.nodesResizeAvailable = nodesResizeAvailable;
        this.platformUrl = platformUrl;
        this.platformVersion = platformVersion;
        this.previousTaskUUID = previousTaskUUID;
        this.regionsChanged = regionsChanged;
        this.remotePackagePath = remotePackagePath;
        this.resetAZConfig = resetAZConfig;
        this.rootAndClientRootCASame = rootAndClientRootCASame;
        this.rootCA = rootCA;
        this.setTxnTableWaitCountFlag = setTxnTableWaitCountFlag;
        this.sleepAfterMasterRestartMillis = sleepAfterMasterRestartMillis;
        this.sleepAfterTServerRestartMillis = sleepAfterTServerRestartMillis;
        this.sshUserOverride = sshUserOverride;
        this.universePaused = universePaused;
        this.universeUUID = universeUUID;
        this.updateInProgress = updateInProgress;
        this.updateOptions = updateOptions;
        this.updateSucceeded = updateSucceeded;
        this.updatingTask = updatingTask;
        this.updatingTaskUUID = updatingTaskUUID;
        this.useNewHelmNamingStyle = useNewHelmNamingStyle;
        this.userAZSelected = userAZSelected;
        this.xclusterInfo = xclusterInfo;
        this.ybPrevSoftwareVersion = ybPrevSoftwareVersion;
        this.ybcInstalled = ybcInstalled;
        this.ybcSoftwareVersion = ybcSoftwareVersion;
    }

    @JsonProperty("allowGeoPartitioning")
    public Boolean getAllowGeoPartitioning() {
        return allowGeoPartitioning;
    }

    @JsonProperty("allowGeoPartitioning")
    public void setAllowGeoPartitioning(Boolean allowGeoPartitioning) {
        this.allowGeoPartitioning = allowGeoPartitioning;
    }

    @JsonProperty("allowInsecure")
    public Boolean getAllowInsecure() {
        return allowInsecure;
    }

    @JsonProperty("allowInsecure")
    public void setAllowInsecure(Boolean allowInsecure) {
        this.allowInsecure = allowInsecure;
    }

    @JsonProperty("capability")
    public String getCapability() {
        return capability;
    }

    @JsonProperty("capability")
    public void setCapability(String capability) {
        this.capability = capability;
    }

    @JsonProperty("clientRootCA")
    public String getClientRootCA() {
        return clientRootCA;
    }

    @JsonProperty("clientRootCA")
    public void setClientRootCA(String clientRootCA) {
        this.clientRootCA = clientRootCA;
    }

    @JsonProperty("clusterOperation")
    public String getClusterOperation() {
        return clusterOperation;
    }

    @JsonProperty("clusterOperation")
    public void setClusterOperation(String clusterOperation) {
        this.clusterOperation = clusterOperation;
    }

    @JsonProperty("clusters")
    public List<Cluster> getClusters() {
        return clusters;
    }

    @JsonProperty("clusters")
    public void setClusters(List<Cluster> clusters) {
        this.clusters = clusters;
    }

    @JsonProperty("cmkArn")
    public String getCmkArn() {
        return cmkArn;
    }

    @JsonProperty("cmkArn")
    public void setCmkArn(String cmkArn) {
        this.cmkArn = cmkArn;
    }

    @JsonProperty("communicationPorts")
    public CommunicationPorts getCommunicationPorts() {
        return communicationPorts;
    }

    @JsonProperty("communicationPorts")
    public void setCommunicationPorts(CommunicationPorts communicationPorts) {
        this.communicationPorts = communicationPorts;
    }

    @JsonProperty("creatingUser")
    public CreatingUser getCreatingUser() {
        return creatingUser;
    }

    @JsonProperty("creatingUser")
    public void setCreatingUser(CreatingUser creatingUser) {
        this.creatingUser = creatingUser;
    }

    @JsonProperty("currentClusterType")
    public String getCurrentClusterType() {
        return currentClusterType;
    }

    @JsonProperty("currentClusterType")
    public void setCurrentClusterType(String currentClusterType) {
        this.currentClusterType = currentClusterType;
    }

    @JsonProperty("deviceInfo")
    public DeviceInfo__1 getDeviceInfo() {
        return deviceInfo;
    }

    @JsonProperty("deviceInfo")
    public void setDeviceInfo(DeviceInfo__1 deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    @JsonProperty("enableYbc")
    public Boolean getEnableYbc() {
        return enableYbc;
    }

    @JsonProperty("enableYbc")
    public void setEnableYbc(Boolean enableYbc) {
        this.enableYbc = enableYbc;
    }

    @JsonProperty("encryptionAtRestConfig")
    public EncryptionAtRestConfig getEncryptionAtRestConfig() {
        return encryptionAtRestConfig;
    }

    @JsonProperty("encryptionAtRestConfig")
    public void setEncryptionAtRestConfig(EncryptionAtRestConfig encryptionAtRestConfig) {
        this.encryptionAtRestConfig = encryptionAtRestConfig;
    }

    @JsonProperty("errorString")
    public String getErrorString() {
        return errorString;
    }

    @JsonProperty("errorString")
    public void setErrorString(String errorString) {
        this.errorString = errorString;
    }

    @JsonProperty("expectedUniverseVersion")
    public Integer getExpectedUniverseVersion() {
        return expectedUniverseVersion;
    }

    @JsonProperty("expectedUniverseVersion")
    public void setExpectedUniverseVersion(Integer expectedUniverseVersion) {
        this.expectedUniverseVersion = expectedUniverseVersion;
    }

    @JsonProperty("extraDependencies")
    public ExtraDependencies getExtraDependencies() {
        return extraDependencies;
    }

    @JsonProperty("extraDependencies")
    public void setExtraDependencies(ExtraDependencies extraDependencies) {
        this.extraDependencies = extraDependencies;
    }

    @JsonProperty("firstTry")
    public Boolean getFirstTry() {
        return firstTry;
    }

    @JsonProperty("firstTry")
    public void setFirstTry(Boolean firstTry) {
        this.firstTry = firstTry;
    }

    @JsonProperty("importedState")
    public String getImportedState() {
        return importedState;
    }

    @JsonProperty("importedState")
    public void setImportedState(String importedState) {
        this.importedState = importedState;
    }

    @JsonProperty("installYbc")
    public Boolean getInstallYbc() {
        return installYbc;
    }

    @JsonProperty("installYbc")
    public void setInstallYbc(Boolean installYbc) {
        this.installYbc = installYbc;
    }

    @JsonProperty("itestS3PackagePath")
    public String getItestS3PackagePath() {
        return itestS3PackagePath;
    }

    @JsonProperty("itestS3PackagePath")
    public void setItestS3PackagePath(String itestS3PackagePath) {
        this.itestS3PackagePath = itestS3PackagePath;
    }

    @JsonProperty("mastersInDefaultRegion")
    public Boolean getMastersInDefaultRegion() {
        return mastersInDefaultRegion;
    }

    @JsonProperty("mastersInDefaultRegion")
    public void setMastersInDefaultRegion(Boolean mastersInDefaultRegion) {
        this.mastersInDefaultRegion = mastersInDefaultRegion;
    }

    @JsonProperty("nextClusterIndex")
    public Integer getNextClusterIndex() {
        return nextClusterIndex;
    }

    @JsonProperty("nextClusterIndex")
    public void setNextClusterIndex(Integer nextClusterIndex) {
        this.nextClusterIndex = nextClusterIndex;
    }

    @JsonProperty("nodeDetailsSet")
    public List<NodeDetailsSet> getNodeDetailsSet() {
        return nodeDetailsSet;
    }

    @JsonProperty("nodeDetailsSet")
    public void setNodeDetailsSet(List<NodeDetailsSet> nodeDetailsSet) {
        this.nodeDetailsSet = nodeDetailsSet;
    }

    @JsonProperty("nodeExporterUser")
    public String getNodeExporterUser() {
        return nodeExporterUser;
    }

    @JsonProperty("nodeExporterUser")
    public void setNodeExporterUser(String nodeExporterUser) {
        this.nodeExporterUser = nodeExporterUser;
    }

    @JsonProperty("nodePrefix")
    public String getNodePrefix() {
        return nodePrefix;
    }

    @JsonProperty("nodePrefix")
    public void setNodePrefix(String nodePrefix) {
        this.nodePrefix = nodePrefix;
    }

    @JsonProperty("nodesResizeAvailable")
    public Boolean getNodesResizeAvailable() {
        return nodesResizeAvailable;
    }

    @JsonProperty("nodesResizeAvailable")
    public void setNodesResizeAvailable(Boolean nodesResizeAvailable) {
        this.nodesResizeAvailable = nodesResizeAvailable;
    }

    @JsonProperty("platformUrl")
    public String getPlatformUrl() {
        return platformUrl;
    }

    @JsonProperty("platformUrl")
    public void setPlatformUrl(String platformUrl) {
        this.platformUrl = platformUrl;
    }

    @JsonProperty("platformVersion")
    public String getPlatformVersion() {
        return platformVersion;
    }

    @JsonProperty("platformVersion")
    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    @JsonProperty("previousTaskUUID")
    public String getPreviousTaskUUID() {
        return previousTaskUUID;
    }

    @JsonProperty("previousTaskUUID")
    public void setPreviousTaskUUID(String previousTaskUUID) {
        this.previousTaskUUID = previousTaskUUID;
    }

    @JsonProperty("regionsChanged")
    public Boolean getRegionsChanged() {
        return regionsChanged;
    }

    @JsonProperty("regionsChanged")
    public void setRegionsChanged(Boolean regionsChanged) {
        this.regionsChanged = regionsChanged;
    }

    @JsonProperty("remotePackagePath")
    public String getRemotePackagePath() {
        return remotePackagePath;
    }

    @JsonProperty("remotePackagePath")
    public void setRemotePackagePath(String remotePackagePath) {
        this.remotePackagePath = remotePackagePath;
    }

    @JsonProperty("resetAZConfig")
    public Boolean getResetAZConfig() {
        return resetAZConfig;
    }

    @JsonProperty("resetAZConfig")
    public void setResetAZConfig(Boolean resetAZConfig) {
        this.resetAZConfig = resetAZConfig;
    }

    @JsonProperty("rootAndClientRootCASame")
    public Boolean getRootAndClientRootCASame() {
        return rootAndClientRootCASame;
    }

    @JsonProperty("rootAndClientRootCASame")
    public void setRootAndClientRootCASame(Boolean rootAndClientRootCASame) {
        this.rootAndClientRootCASame = rootAndClientRootCASame;
    }

    @JsonProperty("rootCA")
    public String getRootCA() {
        return rootCA;
    }

    @JsonProperty("rootCA")
    public void setRootCA(String rootCA) {
        this.rootCA = rootCA;
    }

    @JsonProperty("setTxnTableWaitCountFlag")
    public Boolean getSetTxnTableWaitCountFlag() {
        return setTxnTableWaitCountFlag;
    }

    @JsonProperty("setTxnTableWaitCountFlag")
    public void setSetTxnTableWaitCountFlag(Boolean setTxnTableWaitCountFlag) {
        this.setTxnTableWaitCountFlag = setTxnTableWaitCountFlag;
    }

    @JsonProperty("sleepAfterMasterRestartMillis")
    public Integer getSleepAfterMasterRestartMillis() {
        return sleepAfterMasterRestartMillis;
    }

    @JsonProperty("sleepAfterMasterRestartMillis")
    public void setSleepAfterMasterRestartMillis(Integer sleepAfterMasterRestartMillis) {
        this.sleepAfterMasterRestartMillis = sleepAfterMasterRestartMillis;
    }

    @JsonProperty("sleepAfterTServerRestartMillis")
    public Integer getSleepAfterTServerRestartMillis() {
        return sleepAfterTServerRestartMillis;
    }

    @JsonProperty("sleepAfterTServerRestartMillis")
    public void setSleepAfterTServerRestartMillis(Integer sleepAfterTServerRestartMillis) {
        this.sleepAfterTServerRestartMillis = sleepAfterTServerRestartMillis;
    }

    @JsonProperty("sshUserOverride")
    public String getSshUserOverride() {
        return sshUserOverride;
    }

    @JsonProperty("sshUserOverride")
    public void setSshUserOverride(String sshUserOverride) {
        this.sshUserOverride = sshUserOverride;
    }

    @JsonProperty("universePaused")
    public Boolean getUniversePaused() {
        return universePaused;
    }

    @JsonProperty("universePaused")
    public void setUniversePaused(Boolean universePaused) {
        this.universePaused = universePaused;
    }

    @JsonProperty("universeUUID")
    public String getUniverseUUID() {
        return universeUUID;
    }

    @JsonProperty("universeUUID")
    public void setUniverseUUID(String universeUUID) {
        this.universeUUID = universeUUID;
    }

    @JsonProperty("updateInProgress")
    public Boolean getUpdateInProgress() {
        return updateInProgress;
    }

    @JsonProperty("updateInProgress")
    public void setUpdateInProgress(Boolean updateInProgress) {
        this.updateInProgress = updateInProgress;
    }

    @JsonProperty("updateOptions")
    public List<String> getUpdateOptions() {
        return updateOptions;
    }

    @JsonProperty("updateOptions")
    public void setUpdateOptions(List<String> updateOptions) {
        this.updateOptions = updateOptions;
    }

    @JsonProperty("updateSucceeded")
    public Boolean getUpdateSucceeded() {
        return updateSucceeded;
    }

    @JsonProperty("updateSucceeded")
    public void setUpdateSucceeded(Boolean updateSucceeded) {
        this.updateSucceeded = updateSucceeded;
    }

    @JsonProperty("updatingTask")
    public String getUpdatingTask() {
        return updatingTask;
    }

    @JsonProperty("updatingTask")
    public void setUpdatingTask(String updatingTask) {
        this.updatingTask = updatingTask;
    }

    @JsonProperty("updatingTaskUUID")
    public String getUpdatingTaskUUID() {
        return updatingTaskUUID;
    }

    @JsonProperty("updatingTaskUUID")
    public void setUpdatingTaskUUID(String updatingTaskUUID) {
        this.updatingTaskUUID = updatingTaskUUID;
    }

    @JsonProperty("useNewHelmNamingStyle")
    public Boolean getUseNewHelmNamingStyle() {
        return useNewHelmNamingStyle;
    }

    @JsonProperty("useNewHelmNamingStyle")
    public void setUseNewHelmNamingStyle(Boolean useNewHelmNamingStyle) {
        this.useNewHelmNamingStyle = useNewHelmNamingStyle;
    }

    @JsonProperty("userAZSelected")
    public Boolean getUserAZSelected() {
        return userAZSelected;
    }

    @JsonProperty("userAZSelected")
    public void setUserAZSelected(Boolean userAZSelected) {
        this.userAZSelected = userAZSelected;
    }

    @JsonProperty("xclusterInfo")
    public XclusterInfo getXclusterInfo() {
        return xclusterInfo;
    }

    @JsonProperty("xclusterInfo")
    public void setXclusterInfo(XclusterInfo xclusterInfo) {
        this.xclusterInfo = xclusterInfo;
    }

    @JsonProperty("ybPrevSoftwareVersion")
    public String getYbPrevSoftwareVersion() {
        return ybPrevSoftwareVersion;
    }

    @JsonProperty("ybPrevSoftwareVersion")
    public void setYbPrevSoftwareVersion(String ybPrevSoftwareVersion) {
        this.ybPrevSoftwareVersion = ybPrevSoftwareVersion;
    }

    @JsonProperty("ybcInstalled")
    public Boolean getYbcInstalled() {
        return ybcInstalled;
    }

    @JsonProperty("ybcInstalled")
    public void setYbcInstalled(Boolean ybcInstalled) {
        this.ybcInstalled = ybcInstalled;
    }

    @JsonProperty("ybcSoftwareVersion")
    public String getYbcSoftwareVersion() {
        return ybcSoftwareVersion;
    }

    @JsonProperty("ybcSoftwareVersion")
    public void setYbcSoftwareVersion(String ybcSoftwareVersion) {
        this.ybcSoftwareVersion = ybcSoftwareVersion;
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
        sb.append(Universe.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("allowGeoPartitioning");
        sb.append('=');
        sb.append(((this.allowGeoPartitioning == null)?"<null>":this.allowGeoPartitioning));
        sb.append(',');
        sb.append("allowInsecure");
        sb.append('=');
        sb.append(((this.allowInsecure == null)?"<null>":this.allowInsecure));
        sb.append(',');
        sb.append("capability");
        sb.append('=');
        sb.append(((this.capability == null)?"<null>":this.capability));
        sb.append(',');
        sb.append("clientRootCA");
        sb.append('=');
        sb.append(((this.clientRootCA == null)?"<null>":this.clientRootCA));
        sb.append(',');
        sb.append("clusterOperation");
        sb.append('=');
        sb.append(((this.clusterOperation == null)?"<null>":this.clusterOperation));
        sb.append(',');
        sb.append("clusters");
        sb.append('=');
        sb.append(((this.clusters == null)?"<null>":this.clusters));
        sb.append(',');
        sb.append("cmkArn");
        sb.append('=');
        sb.append(((this.cmkArn == null)?"<null>":this.cmkArn));
        sb.append(',');
        sb.append("communicationPorts");
        sb.append('=');
        sb.append(((this.communicationPorts == null)?"<null>":this.communicationPorts));
        sb.append(',');
        sb.append("creatingUser");
        sb.append('=');
        sb.append(((this.creatingUser == null)?"<null>":this.creatingUser));
        sb.append(',');
        sb.append("currentClusterType");
        sb.append('=');
        sb.append(((this.currentClusterType == null)?"<null>":this.currentClusterType));
        sb.append(',');
        sb.append("deviceInfo");
        sb.append('=');
        sb.append(((this.deviceInfo == null)?"<null>":this.deviceInfo));
        sb.append(',');
        sb.append("enableYbc");
        sb.append('=');
        sb.append(((this.enableYbc == null)?"<null>":this.enableYbc));
        sb.append(',');
        sb.append("encryptionAtRestConfig");
        sb.append('=');
        sb.append(((this.encryptionAtRestConfig == null)?"<null>":this.encryptionAtRestConfig));
        sb.append(',');
        sb.append("errorString");
        sb.append('=');
        sb.append(((this.errorString == null)?"<null>":this.errorString));
        sb.append(',');
        sb.append("expectedUniverseVersion");
        sb.append('=');
        sb.append(((this.expectedUniverseVersion == null)?"<null>":this.expectedUniverseVersion));
        sb.append(',');
        sb.append("extraDependencies");
        sb.append('=');
        sb.append(((this.extraDependencies == null)?"<null>":this.extraDependencies));
        sb.append(',');
        sb.append("firstTry");
        sb.append('=');
        sb.append(((this.firstTry == null)?"<null>":this.firstTry));
        sb.append(',');
        sb.append("importedState");
        sb.append('=');
        sb.append(((this.importedState == null)?"<null>":this.importedState));
        sb.append(',');
        sb.append("installYbc");
        sb.append('=');
        sb.append(((this.installYbc == null)?"<null>":this.installYbc));
        sb.append(',');
        sb.append("itestS3PackagePath");
        sb.append('=');
        sb.append(((this.itestS3PackagePath == null)?"<null>":this.itestS3PackagePath));
        sb.append(',');
        sb.append("mastersInDefaultRegion");
        sb.append('=');
        sb.append(((this.mastersInDefaultRegion == null)?"<null>":this.mastersInDefaultRegion));
        sb.append(',');
        sb.append("nextClusterIndex");
        sb.append('=');
        sb.append(((this.nextClusterIndex == null)?"<null>":this.nextClusterIndex));
        sb.append(',');
        sb.append("nodeDetailsSet");
        sb.append('=');
        sb.append(((this.nodeDetailsSet == null)?"<null>":this.nodeDetailsSet));
        sb.append(',');
        sb.append("nodeExporterUser");
        sb.append('=');
        sb.append(((this.nodeExporterUser == null)?"<null>":this.nodeExporterUser));
        sb.append(',');
        sb.append("nodePrefix");
        sb.append('=');
        sb.append(((this.nodePrefix == null)?"<null>":this.nodePrefix));
        sb.append(',');
        sb.append("nodesResizeAvailable");
        sb.append('=');
        sb.append(((this.nodesResizeAvailable == null)?"<null>":this.nodesResizeAvailable));
        sb.append(',');
        sb.append("platformUrl");
        sb.append('=');
        sb.append(((this.platformUrl == null)?"<null>":this.platformUrl));
        sb.append(',');
        sb.append("platformVersion");
        sb.append('=');
        sb.append(((this.platformVersion == null)?"<null>":this.platformVersion));
        sb.append(',');
        sb.append("previousTaskUUID");
        sb.append('=');
        sb.append(((this.previousTaskUUID == null)?"<null>":this.previousTaskUUID));
        sb.append(',');
        sb.append("regionsChanged");
        sb.append('=');
        sb.append(((this.regionsChanged == null)?"<null>":this.regionsChanged));
        sb.append(',');
        sb.append("remotePackagePath");
        sb.append('=');
        sb.append(((this.remotePackagePath == null)?"<null>":this.remotePackagePath));
        sb.append(',');
        sb.append("resetAZConfig");
        sb.append('=');
        sb.append(((this.resetAZConfig == null)?"<null>":this.resetAZConfig));
        sb.append(',');
        sb.append("rootAndClientRootCASame");
        sb.append('=');
        sb.append(((this.rootAndClientRootCASame == null)?"<null>":this.rootAndClientRootCASame));
        sb.append(',');
        sb.append("rootCA");
        sb.append('=');
        sb.append(((this.rootCA == null)?"<null>":this.rootCA));
        sb.append(',');
        sb.append("setTxnTableWaitCountFlag");
        sb.append('=');
        sb.append(((this.setTxnTableWaitCountFlag == null)?"<null>":this.setTxnTableWaitCountFlag));
        sb.append(',');
        sb.append("sleepAfterMasterRestartMillis");
        sb.append('=');
        sb.append(((this.sleepAfterMasterRestartMillis == null)?"<null>":this.sleepAfterMasterRestartMillis));
        sb.append(',');
        sb.append("sleepAfterTServerRestartMillis");
        sb.append('=');
        sb.append(((this.sleepAfterTServerRestartMillis == null)?"<null>":this.sleepAfterTServerRestartMillis));
        sb.append(',');
        sb.append("sshUserOverride");
        sb.append('=');
        sb.append(((this.sshUserOverride == null)?"<null>":this.sshUserOverride));
        sb.append(',');
        sb.append("universePaused");
        sb.append('=');
        sb.append(((this.universePaused == null)?"<null>":this.universePaused));
        sb.append(',');
        sb.append("universeUUID");
        sb.append('=');
        sb.append(((this.universeUUID == null)?"<null>":this.universeUUID));
        sb.append(',');
        sb.append("updateInProgress");
        sb.append('=');
        sb.append(((this.updateInProgress == null)?"<null>":this.updateInProgress));
        sb.append(',');
        sb.append("updateOptions");
        sb.append('=');
        sb.append(((this.updateOptions == null)?"<null>":this.updateOptions));
        sb.append(',');
        sb.append("updateSucceeded");
        sb.append('=');
        sb.append(((this.updateSucceeded == null)?"<null>":this.updateSucceeded));
        sb.append(',');
        sb.append("updatingTask");
        sb.append('=');
        sb.append(((this.updatingTask == null)?"<null>":this.updatingTask));
        sb.append(',');
        sb.append("updatingTaskUUID");
        sb.append('=');
        sb.append(((this.updatingTaskUUID == null)?"<null>":this.updatingTaskUUID));
        sb.append(',');
        sb.append("useNewHelmNamingStyle");
        sb.append('=');
        sb.append(((this.useNewHelmNamingStyle == null)?"<null>":this.useNewHelmNamingStyle));
        sb.append(',');
        sb.append("userAZSelected");
        sb.append('=');
        sb.append(((this.userAZSelected == null)?"<null>":this.userAZSelected));
        sb.append(',');
        sb.append("xclusterInfo");
        sb.append('=');
        sb.append(((this.xclusterInfo == null)?"<null>":this.xclusterInfo));
        sb.append(',');
        sb.append("ybPrevSoftwareVersion");
        sb.append('=');
        sb.append(((this.ybPrevSoftwareVersion == null)?"<null>":this.ybPrevSoftwareVersion));
        sb.append(',');
        sb.append("ybcInstalled");
        sb.append('=');
        sb.append(((this.ybcInstalled == null)?"<null>":this.ybcInstalled));
        sb.append(',');
        sb.append("ybcSoftwareVersion");
        sb.append('=');
        sb.append(((this.ybcSoftwareVersion == null)?"<null>":this.ybcSoftwareVersion));
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
