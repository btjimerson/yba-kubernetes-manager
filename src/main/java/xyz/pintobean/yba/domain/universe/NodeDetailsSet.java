
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
    "azUuid",
    "cloudInfo",
    "cronsActive",
    "dedicatedTo",
    "disksAreMountedByUUID",
    "isMaster",
    "isRedisServer",
    "isTserver",
    "isYqlServer",
    "isYsqlServer",
    "machineImage",
    "masterHttpPort",
    "masterRpcPort",
    "masterState",
    "nodeExporterPort",
    "nodeIdx",
    "nodeName",
    "nodeUuid",
    "placementUuid",
    "redisServerHttpPort",
    "redisServerRpcPort",
    "sshUserOverride",
    "state",
    "tserverHttpPort",
    "tserverRpcPort",
    "ybControllerHttpPort",
    "ybControllerRpcPort",
    "ybPrebuiltAmi",
    "yqlServerHttpPort",
    "yqlServerRpcPort",
    "ysqlServerHttpPort",
    "ysqlServerRpcPort"
})
@Generated("jsonschema2pojo")
public class NodeDetailsSet {

    @JsonProperty("azUuid")
    private String azUuid;
    @JsonProperty("cloudInfo")
    private CloudInfo cloudInfo;
    @JsonProperty("cronsActive")
    private Boolean cronsActive;
    @JsonProperty("dedicatedTo")
    private String dedicatedTo;
    @JsonProperty("disksAreMountedByUUID")
    private Boolean disksAreMountedByUUID;
    @JsonProperty("isMaster")
    private Boolean isMaster;
    @JsonProperty("isRedisServer")
    private Boolean isRedisServer;
    @JsonProperty("isTserver")
    private Boolean isTserver;
    @JsonProperty("isYqlServer")
    private Boolean isYqlServer;
    @JsonProperty("isYsqlServer")
    private Boolean isYsqlServer;
    @JsonProperty("machineImage")
    private String machineImage;
    @JsonProperty("masterHttpPort")
    private Integer masterHttpPort;
    @JsonProperty("masterRpcPort")
    private Integer masterRpcPort;
    @JsonProperty("masterState")
    private String masterState;
    @JsonProperty("nodeExporterPort")
    private Integer nodeExporterPort;
    @JsonProperty("nodeIdx")
    private Integer nodeIdx;
    @JsonProperty("nodeName")
    private String nodeName;
    @JsonProperty("nodeUuid")
    private String nodeUuid;
    @JsonProperty("placementUuid")
    private String placementUuid;
    @JsonProperty("redisServerHttpPort")
    private Integer redisServerHttpPort;
    @JsonProperty("redisServerRpcPort")
    private Integer redisServerRpcPort;
    @JsonProperty("sshUserOverride")
    private String sshUserOverride;
    @JsonProperty("state")
    private String state;
    @JsonProperty("tserverHttpPort")
    private Integer tserverHttpPort;
    @JsonProperty("tserverRpcPort")
    private Integer tserverRpcPort;
    @JsonProperty("ybControllerHttpPort")
    private Integer ybControllerHttpPort;
    @JsonProperty("ybControllerRpcPort")
    private Integer ybControllerRpcPort;
    @JsonProperty("ybPrebuiltAmi")
    private Boolean ybPrebuiltAmi;
    @JsonProperty("yqlServerHttpPort")
    private Integer yqlServerHttpPort;
    @JsonProperty("yqlServerRpcPort")
    private Integer yqlServerRpcPort;
    @JsonProperty("ysqlServerHttpPort")
    private Integer ysqlServerHttpPort;
    @JsonProperty("ysqlServerRpcPort")
    private Integer ysqlServerRpcPort;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public NodeDetailsSet() {
    }

    /**
     * 
     * @param nodeName
     * @param nodeExporterPort
     * @param placementUuid
     * @param ybControllerHttpPort
     * @param dedicatedTo
     * @param machineImage
     * @param redisServerHttpPort
     * @param masterState
     * @param tserverRpcPort
     * @param ysqlServerHttpPort
     * @param yqlServerRpcPort
     * @param isMaster
     * @param sshUserOverride
     * @param cloudInfo
     * @param cronsActive
     * @param state
     * @param nodeIdx
     * @param masterRpcPort
     * @param redisServerRpcPort
     * @param tserverHttpPort
     * @param disksAreMountedByUUID
     * @param isRedisServer
     * @param ybPrebuiltAmi
     * @param isTserver
     * @param nodeUuid
     * @param isYsqlServer
     * @param ybControllerRpcPort
     * @param isYqlServer
     * @param azUuid
     * @param masterHttpPort
     * @param ysqlServerRpcPort
     * @param yqlServerHttpPort
     */
    public NodeDetailsSet(String azUuid, CloudInfo cloudInfo, Boolean cronsActive, String dedicatedTo, Boolean disksAreMountedByUUID, Boolean isMaster, Boolean isRedisServer, Boolean isTserver, Boolean isYqlServer, Boolean isYsqlServer, String machineImage, Integer masterHttpPort, Integer masterRpcPort, String masterState, Integer nodeExporterPort, Integer nodeIdx, String nodeName, String nodeUuid, String placementUuid, Integer redisServerHttpPort, Integer redisServerRpcPort, String sshUserOverride, String state, Integer tserverHttpPort, Integer tserverRpcPort, Integer ybControllerHttpPort, Integer ybControllerRpcPort, Boolean ybPrebuiltAmi, Integer yqlServerHttpPort, Integer yqlServerRpcPort, Integer ysqlServerHttpPort, Integer ysqlServerRpcPort) {
        super();
        this.azUuid = azUuid;
        this.cloudInfo = cloudInfo;
        this.cronsActive = cronsActive;
        this.dedicatedTo = dedicatedTo;
        this.disksAreMountedByUUID = disksAreMountedByUUID;
        this.isMaster = isMaster;
        this.isRedisServer = isRedisServer;
        this.isTserver = isTserver;
        this.isYqlServer = isYqlServer;
        this.isYsqlServer = isYsqlServer;
        this.machineImage = machineImage;
        this.masterHttpPort = masterHttpPort;
        this.masterRpcPort = masterRpcPort;
        this.masterState = masterState;
        this.nodeExporterPort = nodeExporterPort;
        this.nodeIdx = nodeIdx;
        this.nodeName = nodeName;
        this.nodeUuid = nodeUuid;
        this.placementUuid = placementUuid;
        this.redisServerHttpPort = redisServerHttpPort;
        this.redisServerRpcPort = redisServerRpcPort;
        this.sshUserOverride = sshUserOverride;
        this.state = state;
        this.tserverHttpPort = tserverHttpPort;
        this.tserverRpcPort = tserverRpcPort;
        this.ybControllerHttpPort = ybControllerHttpPort;
        this.ybControllerRpcPort = ybControllerRpcPort;
        this.ybPrebuiltAmi = ybPrebuiltAmi;
        this.yqlServerHttpPort = yqlServerHttpPort;
        this.yqlServerRpcPort = yqlServerRpcPort;
        this.ysqlServerHttpPort = ysqlServerHttpPort;
        this.ysqlServerRpcPort = ysqlServerRpcPort;
    }

    @JsonProperty("azUuid")
    public String getAzUuid() {
        return azUuid;
    }

    @JsonProperty("azUuid")
    public void setAzUuid(String azUuid) {
        this.azUuid = azUuid;
    }

    @JsonProperty("cloudInfo")
    public CloudInfo getCloudInfo() {
        return cloudInfo;
    }

    @JsonProperty("cloudInfo")
    public void setCloudInfo(CloudInfo cloudInfo) {
        this.cloudInfo = cloudInfo;
    }

    @JsonProperty("cronsActive")
    public Boolean getCronsActive() {
        return cronsActive;
    }

    @JsonProperty("cronsActive")
    public void setCronsActive(Boolean cronsActive) {
        this.cronsActive = cronsActive;
    }

    @JsonProperty("dedicatedTo")
    public String getDedicatedTo() {
        return dedicatedTo;
    }

    @JsonProperty("dedicatedTo")
    public void setDedicatedTo(String dedicatedTo) {
        this.dedicatedTo = dedicatedTo;
    }

    @JsonProperty("disksAreMountedByUUID")
    public Boolean getDisksAreMountedByUUID() {
        return disksAreMountedByUUID;
    }

    @JsonProperty("disksAreMountedByUUID")
    public void setDisksAreMountedByUUID(Boolean disksAreMountedByUUID) {
        this.disksAreMountedByUUID = disksAreMountedByUUID;
    }

    @JsonProperty("isMaster")
    public Boolean getIsMaster() {
        return isMaster;
    }

    @JsonProperty("isMaster")
    public void setIsMaster(Boolean isMaster) {
        this.isMaster = isMaster;
    }

    @JsonProperty("isRedisServer")
    public Boolean getIsRedisServer() {
        return isRedisServer;
    }

    @JsonProperty("isRedisServer")
    public void setIsRedisServer(Boolean isRedisServer) {
        this.isRedisServer = isRedisServer;
    }

    @JsonProperty("isTserver")
    public Boolean getIsTserver() {
        return isTserver;
    }

    @JsonProperty("isTserver")
    public void setIsTserver(Boolean isTserver) {
        this.isTserver = isTserver;
    }

    @JsonProperty("isYqlServer")
    public Boolean getIsYqlServer() {
        return isYqlServer;
    }

    @JsonProperty("isYqlServer")
    public void setIsYqlServer(Boolean isYqlServer) {
        this.isYqlServer = isYqlServer;
    }

    @JsonProperty("isYsqlServer")
    public Boolean getIsYsqlServer() {
        return isYsqlServer;
    }

    @JsonProperty("isYsqlServer")
    public void setIsYsqlServer(Boolean isYsqlServer) {
        this.isYsqlServer = isYsqlServer;
    }

    @JsonProperty("machineImage")
    public String getMachineImage() {
        return machineImage;
    }

    @JsonProperty("machineImage")
    public void setMachineImage(String machineImage) {
        this.machineImage = machineImage;
    }

    @JsonProperty("masterHttpPort")
    public Integer getMasterHttpPort() {
        return masterHttpPort;
    }

    @JsonProperty("masterHttpPort")
    public void setMasterHttpPort(Integer masterHttpPort) {
        this.masterHttpPort = masterHttpPort;
    }

    @JsonProperty("masterRpcPort")
    public Integer getMasterRpcPort() {
        return masterRpcPort;
    }

    @JsonProperty("masterRpcPort")
    public void setMasterRpcPort(Integer masterRpcPort) {
        this.masterRpcPort = masterRpcPort;
    }

    @JsonProperty("masterState")
    public String getMasterState() {
        return masterState;
    }

    @JsonProperty("masterState")
    public void setMasterState(String masterState) {
        this.masterState = masterState;
    }

    @JsonProperty("nodeExporterPort")
    public Integer getNodeExporterPort() {
        return nodeExporterPort;
    }

    @JsonProperty("nodeExporterPort")
    public void setNodeExporterPort(Integer nodeExporterPort) {
        this.nodeExporterPort = nodeExporterPort;
    }

    @JsonProperty("nodeIdx")
    public Integer getNodeIdx() {
        return nodeIdx;
    }

    @JsonProperty("nodeIdx")
    public void setNodeIdx(Integer nodeIdx) {
        this.nodeIdx = nodeIdx;
    }

    @JsonProperty("nodeName")
    public String getNodeName() {
        return nodeName;
    }

    @JsonProperty("nodeName")
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    @JsonProperty("nodeUuid")
    public String getNodeUuid() {
        return nodeUuid;
    }

    @JsonProperty("nodeUuid")
    public void setNodeUuid(String nodeUuid) {
        this.nodeUuid = nodeUuid;
    }

    @JsonProperty("placementUuid")
    public String getPlacementUuid() {
        return placementUuid;
    }

    @JsonProperty("placementUuid")
    public void setPlacementUuid(String placementUuid) {
        this.placementUuid = placementUuid;
    }

    @JsonProperty("redisServerHttpPort")
    public Integer getRedisServerHttpPort() {
        return redisServerHttpPort;
    }

    @JsonProperty("redisServerHttpPort")
    public void setRedisServerHttpPort(Integer redisServerHttpPort) {
        this.redisServerHttpPort = redisServerHttpPort;
    }

    @JsonProperty("redisServerRpcPort")
    public Integer getRedisServerRpcPort() {
        return redisServerRpcPort;
    }

    @JsonProperty("redisServerRpcPort")
    public void setRedisServerRpcPort(Integer redisServerRpcPort) {
        this.redisServerRpcPort = redisServerRpcPort;
    }

    @JsonProperty("sshUserOverride")
    public String getSshUserOverride() {
        return sshUserOverride;
    }

    @JsonProperty("sshUserOverride")
    public void setSshUserOverride(String sshUserOverride) {
        this.sshUserOverride = sshUserOverride;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("tserverHttpPort")
    public Integer getTserverHttpPort() {
        return tserverHttpPort;
    }

    @JsonProperty("tserverHttpPort")
    public void setTserverHttpPort(Integer tserverHttpPort) {
        this.tserverHttpPort = tserverHttpPort;
    }

    @JsonProperty("tserverRpcPort")
    public Integer getTserverRpcPort() {
        return tserverRpcPort;
    }

    @JsonProperty("tserverRpcPort")
    public void setTserverRpcPort(Integer tserverRpcPort) {
        this.tserverRpcPort = tserverRpcPort;
    }

    @JsonProperty("ybControllerHttpPort")
    public Integer getYbControllerHttpPort() {
        return ybControllerHttpPort;
    }

    @JsonProperty("ybControllerHttpPort")
    public void setYbControllerHttpPort(Integer ybControllerHttpPort) {
        this.ybControllerHttpPort = ybControllerHttpPort;
    }

    @JsonProperty("ybControllerRpcPort")
    public Integer getYbControllerRpcPort() {
        return ybControllerRpcPort;
    }

    @JsonProperty("ybControllerRpcPort")
    public void setYbControllerRpcPort(Integer ybControllerRpcPort) {
        this.ybControllerRpcPort = ybControllerRpcPort;
    }

    @JsonProperty("ybPrebuiltAmi")
    public Boolean getYbPrebuiltAmi() {
        return ybPrebuiltAmi;
    }

    @JsonProperty("ybPrebuiltAmi")
    public void setYbPrebuiltAmi(Boolean ybPrebuiltAmi) {
        this.ybPrebuiltAmi = ybPrebuiltAmi;
    }

    @JsonProperty("yqlServerHttpPort")
    public Integer getYqlServerHttpPort() {
        return yqlServerHttpPort;
    }

    @JsonProperty("yqlServerHttpPort")
    public void setYqlServerHttpPort(Integer yqlServerHttpPort) {
        this.yqlServerHttpPort = yqlServerHttpPort;
    }

    @JsonProperty("yqlServerRpcPort")
    public Integer getYqlServerRpcPort() {
        return yqlServerRpcPort;
    }

    @JsonProperty("yqlServerRpcPort")
    public void setYqlServerRpcPort(Integer yqlServerRpcPort) {
        this.yqlServerRpcPort = yqlServerRpcPort;
    }

    @JsonProperty("ysqlServerHttpPort")
    public Integer getYsqlServerHttpPort() {
        return ysqlServerHttpPort;
    }

    @JsonProperty("ysqlServerHttpPort")
    public void setYsqlServerHttpPort(Integer ysqlServerHttpPort) {
        this.ysqlServerHttpPort = ysqlServerHttpPort;
    }

    @JsonProperty("ysqlServerRpcPort")
    public Integer getYsqlServerRpcPort() {
        return ysqlServerRpcPort;
    }

    @JsonProperty("ysqlServerRpcPort")
    public void setYsqlServerRpcPort(Integer ysqlServerRpcPort) {
        this.ysqlServerRpcPort = ysqlServerRpcPort;
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
        sb.append(NodeDetailsSet.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("azUuid");
        sb.append('=');
        sb.append(((this.azUuid == null)?"<null>":this.azUuid));
        sb.append(',');
        sb.append("cloudInfo");
        sb.append('=');
        sb.append(((this.cloudInfo == null)?"<null>":this.cloudInfo));
        sb.append(',');
        sb.append("cronsActive");
        sb.append('=');
        sb.append(((this.cronsActive == null)?"<null>":this.cronsActive));
        sb.append(',');
        sb.append("dedicatedTo");
        sb.append('=');
        sb.append(((this.dedicatedTo == null)?"<null>":this.dedicatedTo));
        sb.append(',');
        sb.append("disksAreMountedByUUID");
        sb.append('=');
        sb.append(((this.disksAreMountedByUUID == null)?"<null>":this.disksAreMountedByUUID));
        sb.append(',');
        sb.append("isMaster");
        sb.append('=');
        sb.append(((this.isMaster == null)?"<null>":this.isMaster));
        sb.append(',');
        sb.append("isRedisServer");
        sb.append('=');
        sb.append(((this.isRedisServer == null)?"<null>":this.isRedisServer));
        sb.append(',');
        sb.append("isTserver");
        sb.append('=');
        sb.append(((this.isTserver == null)?"<null>":this.isTserver));
        sb.append(',');
        sb.append("isYqlServer");
        sb.append('=');
        sb.append(((this.isYqlServer == null)?"<null>":this.isYqlServer));
        sb.append(',');
        sb.append("isYsqlServer");
        sb.append('=');
        sb.append(((this.isYsqlServer == null)?"<null>":this.isYsqlServer));
        sb.append(',');
        sb.append("machineImage");
        sb.append('=');
        sb.append(((this.machineImage == null)?"<null>":this.machineImage));
        sb.append(',');
        sb.append("masterHttpPort");
        sb.append('=');
        sb.append(((this.masterHttpPort == null)?"<null>":this.masterHttpPort));
        sb.append(',');
        sb.append("masterRpcPort");
        sb.append('=');
        sb.append(((this.masterRpcPort == null)?"<null>":this.masterRpcPort));
        sb.append(',');
        sb.append("masterState");
        sb.append('=');
        sb.append(((this.masterState == null)?"<null>":this.masterState));
        sb.append(',');
        sb.append("nodeExporterPort");
        sb.append('=');
        sb.append(((this.nodeExporterPort == null)?"<null>":this.nodeExporterPort));
        sb.append(',');
        sb.append("nodeIdx");
        sb.append('=');
        sb.append(((this.nodeIdx == null)?"<null>":this.nodeIdx));
        sb.append(',');
        sb.append("nodeName");
        sb.append('=');
        sb.append(((this.nodeName == null)?"<null>":this.nodeName));
        sb.append(',');
        sb.append("nodeUuid");
        sb.append('=');
        sb.append(((this.nodeUuid == null)?"<null>":this.nodeUuid));
        sb.append(',');
        sb.append("placementUuid");
        sb.append('=');
        sb.append(((this.placementUuid == null)?"<null>":this.placementUuid));
        sb.append(',');
        sb.append("redisServerHttpPort");
        sb.append('=');
        sb.append(((this.redisServerHttpPort == null)?"<null>":this.redisServerHttpPort));
        sb.append(',');
        sb.append("redisServerRpcPort");
        sb.append('=');
        sb.append(((this.redisServerRpcPort == null)?"<null>":this.redisServerRpcPort));
        sb.append(',');
        sb.append("sshUserOverride");
        sb.append('=');
        sb.append(((this.sshUserOverride == null)?"<null>":this.sshUserOverride));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("tserverHttpPort");
        sb.append('=');
        sb.append(((this.tserverHttpPort == null)?"<null>":this.tserverHttpPort));
        sb.append(',');
        sb.append("tserverRpcPort");
        sb.append('=');
        sb.append(((this.tserverRpcPort == null)?"<null>":this.tserverRpcPort));
        sb.append(',');
        sb.append("ybControllerHttpPort");
        sb.append('=');
        sb.append(((this.ybControllerHttpPort == null)?"<null>":this.ybControllerHttpPort));
        sb.append(',');
        sb.append("ybControllerRpcPort");
        sb.append('=');
        sb.append(((this.ybControllerRpcPort == null)?"<null>":this.ybControllerRpcPort));
        sb.append(',');
        sb.append("ybPrebuiltAmi");
        sb.append('=');
        sb.append(((this.ybPrebuiltAmi == null)?"<null>":this.ybPrebuiltAmi));
        sb.append(',');
        sb.append("yqlServerHttpPort");
        sb.append('=');
        sb.append(((this.yqlServerHttpPort == null)?"<null>":this.yqlServerHttpPort));
        sb.append(',');
        sb.append("yqlServerRpcPort");
        sb.append('=');
        sb.append(((this.yqlServerRpcPort == null)?"<null>":this.yqlServerRpcPort));
        sb.append(',');
        sb.append("ysqlServerHttpPort");
        sb.append('=');
        sb.append(((this.ysqlServerHttpPort == null)?"<null>":this.ysqlServerHttpPort));
        sb.append(',');
        sb.append("ysqlServerRpcPort");
        sb.append('=');
        sb.append(((this.ysqlServerRpcPort == null)?"<null>":this.ysqlServerRpcPort));
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
