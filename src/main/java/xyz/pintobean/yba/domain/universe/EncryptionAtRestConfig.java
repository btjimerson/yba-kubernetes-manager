
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
    "encryptionAtRestEnabled",
    "kmsConfigUUID",
    "opType",
    "type"
})
@Generated("jsonschema2pojo")
public class EncryptionAtRestConfig {

    @JsonProperty("encryptionAtRestEnabled")
    private Boolean encryptionAtRestEnabled;
    @JsonProperty("kmsConfigUUID")
    private String kmsConfigUUID;
    @JsonProperty("opType")
    private String opType;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public EncryptionAtRestConfig() {
    }

    /**
     * 
     * @param encryptionAtRestEnabled
     * @param opType
     * @param kmsConfigUUID
     * @param type
     */
    public EncryptionAtRestConfig(Boolean encryptionAtRestEnabled, String kmsConfigUUID, String opType, String type) {
        super();
        this.encryptionAtRestEnabled = encryptionAtRestEnabled;
        this.kmsConfigUUID = kmsConfigUUID;
        this.opType = opType;
        this.type = type;
    }

    @JsonProperty("encryptionAtRestEnabled")
    public Boolean getEncryptionAtRestEnabled() {
        return encryptionAtRestEnabled;
    }

    @JsonProperty("encryptionAtRestEnabled")
    public void setEncryptionAtRestEnabled(Boolean encryptionAtRestEnabled) {
        this.encryptionAtRestEnabled = encryptionAtRestEnabled;
    }

    @JsonProperty("kmsConfigUUID")
    public String getKmsConfigUUID() {
        return kmsConfigUUID;
    }

    @JsonProperty("kmsConfigUUID")
    public void setKmsConfigUUID(String kmsConfigUUID) {
        this.kmsConfigUUID = kmsConfigUUID;
    }

    @JsonProperty("opType")
    public String getOpType() {
        return opType;
    }

    @JsonProperty("opType")
    public void setOpType(String opType) {
        this.opType = opType;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
        sb.append(EncryptionAtRestConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("encryptionAtRestEnabled");
        sb.append('=');
        sb.append(((this.encryptionAtRestEnabled == null)?"<null>":this.encryptionAtRestEnabled));
        sb.append(',');
        sb.append("kmsConfigUUID");
        sb.append('=');
        sb.append(((this.kmsConfigUUID == null)?"<null>":this.kmsConfigUUID));
        sb.append(',');
        sb.append("opType");
        sb.append('=');
        sb.append(((this.opType == null)?"<null>":this.opType));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
