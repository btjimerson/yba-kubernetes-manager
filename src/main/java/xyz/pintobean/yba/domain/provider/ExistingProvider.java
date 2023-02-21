
package xyz.pintobean.yba.domain.provider;

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
    "uuid",
    "code",
    "name",
    "active",
    "customerUUID",
    "regions",
    "airGapInstall",
    "sshPort",
    "customHostCidrs",
    "overrideKeyValidate",
    "setUpChrony",
    "ntpServers",
    "showSetUpChrony",
    "config"
})
@Generated("jsonschema2pojo")
public class ExistingProvider {

    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("code")
    private String code;
    @JsonProperty("name")
    private String name;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("customerUUID")
    private String customerUUID;
    @JsonProperty("regions")
    private List<Object> regions;
    @JsonProperty("airGapInstall")
    private Boolean airGapInstall;
    @JsonProperty("sshPort")
    private Integer sshPort;
    @JsonProperty("customHostCidrs")
    private List<Object> customHostCidrs;
    @JsonProperty("overrideKeyValidate")
    private Boolean overrideKeyValidate;
    @JsonProperty("setUpChrony")
    private Boolean setUpChrony;
    @JsonProperty("ntpServers")
    private List<Object> ntpServers;
    @JsonProperty("showSetUpChrony")
    private Boolean showSetUpChrony;
    @JsonProperty("config")
    private Config config;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExistingProvider() {
    }

    /**
     * 
     * @param sshPort
     * @param code
     * @param regions
     * @param customHostCidrs
     * @param active
     * @param uuid
     * @param customerUUID
     * @param setUpChrony
     * @param overrideKeyValidate
     * @param ntpServers
     * @param name
     * @param showSetUpChrony
     * @param config
     * @param airGapInstall
     */
    public ExistingProvider(String uuid, String code, String name, Boolean active, String customerUUID, List<Object> regions, Boolean airGapInstall, Integer sshPort, List<Object> customHostCidrs, Boolean overrideKeyValidate, Boolean setUpChrony, List<Object> ntpServers, Boolean showSetUpChrony, Config config) {
        super();
        this.uuid = uuid;
        this.code = code;
        this.name = name;
        this.active = active;
        this.customerUUID = customerUUID;
        this.regions = regions;
        this.airGapInstall = airGapInstall;
        this.sshPort = sshPort;
        this.customHostCidrs = customHostCidrs;
        this.overrideKeyValidate = overrideKeyValidate;
        this.setUpChrony = setUpChrony;
        this.ntpServers = ntpServers;
        this.showSetUpChrony = showSetUpChrony;
        this.config = config;
    }

    @JsonProperty("uuid")
    public String getUuid() {
        return uuid;
    }

    @JsonProperty("uuid")
    public void setUuid(String uuid) {
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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("customerUUID")
    public String getCustomerUUID() {
        return customerUUID;
    }

    @JsonProperty("customerUUID")
    public void setCustomerUUID(String customerUUID) {
        this.customerUUID = customerUUID;
    }

    @JsonProperty("regions")
    public List<Object> getRegions() {
        return regions;
    }

    @JsonProperty("regions")
    public void setRegions(List<Object> regions) {
        this.regions = regions;
    }

    @JsonProperty("airGapInstall")
    public Boolean getAirGapInstall() {
        return airGapInstall;
    }

    @JsonProperty("airGapInstall")
    public void setAirGapInstall(Boolean airGapInstall) {
        this.airGapInstall = airGapInstall;
    }

    @JsonProperty("sshPort")
    public Integer getSshPort() {
        return sshPort;
    }

    @JsonProperty("sshPort")
    public void setSshPort(Integer sshPort) {
        this.sshPort = sshPort;
    }

    @JsonProperty("customHostCidrs")
    public List<Object> getCustomHostCidrs() {
        return customHostCidrs;
    }

    @JsonProperty("customHostCidrs")
    public void setCustomHostCidrs(List<Object> customHostCidrs) {
        this.customHostCidrs = customHostCidrs;
    }

    @JsonProperty("overrideKeyValidate")
    public Boolean getOverrideKeyValidate() {
        return overrideKeyValidate;
    }

    @JsonProperty("overrideKeyValidate")
    public void setOverrideKeyValidate(Boolean overrideKeyValidate) {
        this.overrideKeyValidate = overrideKeyValidate;
    }

    @JsonProperty("setUpChrony")
    public Boolean getSetUpChrony() {
        return setUpChrony;
    }

    @JsonProperty("setUpChrony")
    public void setSetUpChrony(Boolean setUpChrony) {
        this.setUpChrony = setUpChrony;
    }

    @JsonProperty("ntpServers")
    public List<Object> getNtpServers() {
        return ntpServers;
    }

    @JsonProperty("ntpServers")
    public void setNtpServers(List<Object> ntpServers) {
        this.ntpServers = ntpServers;
    }

    @JsonProperty("showSetUpChrony")
    public Boolean getShowSetUpChrony() {
        return showSetUpChrony;
    }

    @JsonProperty("showSetUpChrony")
    public void setShowSetUpChrony(Boolean showSetUpChrony) {
        this.showSetUpChrony = showSetUpChrony;
    }

    @JsonProperty("config")
    public Config getConfig() {
        return config;
    }

    @JsonProperty("config")
    public void setConfig(Config config) {
        this.config = config;
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
        sb.append(ExistingProvider.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uuid");
        sb.append('=');
        sb.append(((this.uuid == null)?"<null>":this.uuid));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("active");
        sb.append('=');
        sb.append(((this.active == null)?"<null>":this.active));
        sb.append(',');
        sb.append("customerUUID");
        sb.append('=');
        sb.append(((this.customerUUID == null)?"<null>":this.customerUUID));
        sb.append(',');
        sb.append("regions");
        sb.append('=');
        sb.append(((this.regions == null)?"<null>":this.regions));
        sb.append(',');
        sb.append("airGapInstall");
        sb.append('=');
        sb.append(((this.airGapInstall == null)?"<null>":this.airGapInstall));
        sb.append(',');
        sb.append("sshPort");
        sb.append('=');
        sb.append(((this.sshPort == null)?"<null>":this.sshPort));
        sb.append(',');
        sb.append("customHostCidrs");
        sb.append('=');
        sb.append(((this.customHostCidrs == null)?"<null>":this.customHostCidrs));
        sb.append(',');
        sb.append("overrideKeyValidate");
        sb.append('=');
        sb.append(((this.overrideKeyValidate == null)?"<null>":this.overrideKeyValidate));
        sb.append(',');
        sb.append("setUpChrony");
        sb.append('=');
        sb.append(((this.setUpChrony == null)?"<null>":this.setUpChrony));
        sb.append(',');
        sb.append("ntpServers");
        sb.append('=');
        sb.append(((this.ntpServers == null)?"<null>":this.ntpServers));
        sb.append(',');
        sb.append("showSetUpChrony");
        sb.append('=');
        sb.append(((this.showSetUpChrony == null)?"<null>":this.showSetUpChrony));
        sb.append(',');
        sb.append("config");
        sb.append('=');
        sb.append(((this.config == null)?"<null>":this.config));
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
