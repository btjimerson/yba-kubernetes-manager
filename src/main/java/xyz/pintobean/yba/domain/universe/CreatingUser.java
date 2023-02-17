
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
    "email",
    "isPrimary",
    "ldapSpecifiedRole",
    "role",
    "timezone",
    "userType"
})
@Generated("jsonschema2pojo")
public class CreatingUser {

    @JsonProperty("email")
    private String email;
    @JsonProperty("isPrimary")
    private Boolean isPrimary;
    @JsonProperty("ldapSpecifiedRole")
    private Boolean ldapSpecifiedRole;
    @JsonProperty("role")
    private String role;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("userType")
    private String userType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CreatingUser() {
    }

    /**
     * 
     * @param ldapSpecifiedRole
     * @param role
     * @param isPrimary
     * @param timezone
     * @param userType
     * @param email
     */
    public CreatingUser(String email, Boolean isPrimary, Boolean ldapSpecifiedRole, String role, String timezone, String userType) {
        super();
        this.email = email;
        this.isPrimary = isPrimary;
        this.ldapSpecifiedRole = ldapSpecifiedRole;
        this.role = role;
        this.timezone = timezone;
        this.userType = userType;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("isPrimary")
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    @JsonProperty("isPrimary")
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    @JsonProperty("ldapSpecifiedRole")
    public Boolean getLdapSpecifiedRole() {
        return ldapSpecifiedRole;
    }

    @JsonProperty("ldapSpecifiedRole")
    public void setLdapSpecifiedRole(Boolean ldapSpecifiedRole) {
        this.ldapSpecifiedRole = ldapSpecifiedRole;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("userType")
    public String getUserType() {
        return userType;
    }

    @JsonProperty("userType")
    public void setUserType(String userType) {
        this.userType = userType;
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
        sb.append(CreatingUser.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("isPrimary");
        sb.append('=');
        sb.append(((this.isPrimary == null)?"<null>":this.isPrimary));
        sb.append(',');
        sb.append("ldapSpecifiedRole");
        sb.append('=');
        sb.append(((this.ldapSpecifiedRole == null)?"<null>":this.ldapSpecifiedRole));
        sb.append(',');
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null)?"<null>":this.role));
        sb.append(',');
        sb.append("timezone");
        sb.append('=');
        sb.append(((this.timezone == null)?"<null>":this.timezone));
        sb.append(',');
        sb.append("userType");
        sb.append('=');
        sb.append(((this.userType == null)?"<null>":this.userType));
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
