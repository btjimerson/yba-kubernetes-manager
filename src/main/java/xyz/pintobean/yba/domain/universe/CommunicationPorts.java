
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
    "masterHttpPort",
    "masterRpcPort",
    "nodeExporterPort",
    "redisServerHttpPort",
    "redisServerRpcPort",
    "tserverHttpPort",
    "tserverRpcPort",
    "ybControllerHttpPort",
    "ybControllerrRpcPort",
    "yqlServerHttpPort",
    "yqlServerRpcPort",
    "ysqlServerHttpPort",
    "ysqlServerRpcPort"
})
@Generated("jsonschema2pojo")
public class CommunicationPorts {

    @JsonProperty("masterHttpPort")
    private Integer masterHttpPort;
    @JsonProperty("masterRpcPort")
    private Integer masterRpcPort;
    @JsonProperty("nodeExporterPort")
    private Integer nodeExporterPort;
    @JsonProperty("redisServerHttpPort")
    private Integer redisServerHttpPort;
    @JsonProperty("redisServerRpcPort")
    private Integer redisServerRpcPort;
    @JsonProperty("tserverHttpPort")
    private Integer tserverHttpPort;
    @JsonProperty("tserverRpcPort")
    private Integer tserverRpcPort;
    @JsonProperty("ybControllerHttpPort")
    private Integer ybControllerHttpPort;
    @JsonProperty("ybControllerrRpcPort")
    private Integer ybControllerrRpcPort;
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
    public CommunicationPorts() {
    }

    /**
     * 
     * @param nodeExporterPort
     * @param tserverHttpPort
     * @param ybControllerHttpPort
     * @param redisServerHttpPort
     * @param ybControllerrRpcPort
     * @param tserverRpcPort
     * @param ysqlServerHttpPort
     * @param yqlServerRpcPort
     * @param masterHttpPort
     * @param ysqlServerRpcPort
     * @param yqlServerHttpPort
     * @param masterRpcPort
     * @param redisServerRpcPort
     */
    public CommunicationPorts(Integer masterHttpPort, Integer masterRpcPort, Integer nodeExporterPort, Integer redisServerHttpPort, Integer redisServerRpcPort, Integer tserverHttpPort, Integer tserverRpcPort, Integer ybControllerHttpPort, Integer ybControllerrRpcPort, Integer yqlServerHttpPort, Integer yqlServerRpcPort, Integer ysqlServerHttpPort, Integer ysqlServerRpcPort) {
        super();
        this.masterHttpPort = masterHttpPort;
        this.masterRpcPort = masterRpcPort;
        this.nodeExporterPort = nodeExporterPort;
        this.redisServerHttpPort = redisServerHttpPort;
        this.redisServerRpcPort = redisServerRpcPort;
        this.tserverHttpPort = tserverHttpPort;
        this.tserverRpcPort = tserverRpcPort;
        this.ybControllerHttpPort = ybControllerHttpPort;
        this.ybControllerrRpcPort = ybControllerrRpcPort;
        this.yqlServerHttpPort = yqlServerHttpPort;
        this.yqlServerRpcPort = yqlServerRpcPort;
        this.ysqlServerHttpPort = ysqlServerHttpPort;
        this.ysqlServerRpcPort = ysqlServerRpcPort;
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

    @JsonProperty("nodeExporterPort")
    public Integer getNodeExporterPort() {
        return nodeExporterPort;
    }

    @JsonProperty("nodeExporterPort")
    public void setNodeExporterPort(Integer nodeExporterPort) {
        this.nodeExporterPort = nodeExporterPort;
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

    @JsonProperty("ybControllerrRpcPort")
    public Integer getYbControllerrRpcPort() {
        return ybControllerrRpcPort;
    }

    @JsonProperty("ybControllerrRpcPort")
    public void setYbControllerrRpcPort(Integer ybControllerrRpcPort) {
        this.ybControllerrRpcPort = ybControllerrRpcPort;
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
        sb.append(CommunicationPorts.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("masterHttpPort");
        sb.append('=');
        sb.append(((this.masterHttpPort == null)?"<null>":this.masterHttpPort));
        sb.append(',');
        sb.append("masterRpcPort");
        sb.append('=');
        sb.append(((this.masterRpcPort == null)?"<null>":this.masterRpcPort));
        sb.append(',');
        sb.append("nodeExporterPort");
        sb.append('=');
        sb.append(((this.nodeExporterPort == null)?"<null>":this.nodeExporterPort));
        sb.append(',');
        sb.append("redisServerHttpPort");
        sb.append('=');
        sb.append(((this.redisServerHttpPort == null)?"<null>":this.redisServerHttpPort));
        sb.append(',');
        sb.append("redisServerRpcPort");
        sb.append('=');
        sb.append(((this.redisServerRpcPort == null)?"<null>":this.redisServerRpcPort));
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
        sb.append("ybControllerrRpcPort");
        sb.append('=');
        sb.append(((this.ybControllerrRpcPort == null)?"<null>":this.ybControllerrRpcPort));
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
