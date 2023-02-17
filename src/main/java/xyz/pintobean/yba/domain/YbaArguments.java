package xyz.pintobean.yba.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="yba")
public class YbaArguments {

    private String adminPassword; 
    private String email;
    private String environment;
    private String fullName; 
    private String hostname;
    private String kubeconfigPath; 
    private String namespace;
    private String providerName; 
    private String pullSecretName; 
    private String pullSecretPath; 
    private String region; 
    private Integer regionLatitude;
    private Integer regionLongitude;
    private Integer replicationFactor;
    private String serviceAccount;
    private String storageClass; 
    private String universeName;
    private Integer volumeSize; 
    private String ybSoftwareVersion;
    private String ycqlPassword; 
    private String ysqlPassword;
    private String zone;

    public String getAdminPassword() {
        return adminPassword;
    }
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEnvironment() {
        return environment;
    }
    public void setEnvironment(String environment) {
        this.environment = environment;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getHostname() {
        return hostname;
    }
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
    public String getKubeconfigPath() {
        return kubeconfigPath;
    }
    public void setKubeconfigPath(String kubeconfigPath) {
        this.kubeconfigPath = kubeconfigPath;
    }
    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    public String getProviderName() {
        return providerName;
    }
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
    public String getPullSecretName() {
        return pullSecretName;
    }
    public void setPullSecretName(String pullSecretName) {
        this.pullSecretName = pullSecretName;
    }
    public String getPullSecretPath() {
        return pullSecretPath;
    }
    public void setPullSecretPath(String pullSecretPath) {
        this.pullSecretPath = pullSecretPath;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public Integer getRegionLatitude() {
        return regionLatitude;
    }
    public void setRegionLatitude(Integer regionLatitude) {
        this.regionLatitude = regionLatitude;
    }
    public Integer getRegionLongitude() {
        return regionLongitude;
    }
    public void setRegionLongitude(Integer regionLongitude) {
        this.regionLongitude = regionLongitude;
    }
    public Integer getReplicationFactor() {
        return replicationFactor;
    }
    public void setReplicationFactor(Integer replicationFactor) {
        this.replicationFactor = replicationFactor;
    }
    public String getServiceAccount() {
        return serviceAccount;
    }
    public void setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }
    public String getUniverseName() {
        return universeName;
    }
    public void setUniverseName(String universeName) {
        this.universeName = universeName;
    }
    public Integer getVolumeSize() {
        return volumeSize;
    }
    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }
    public String getYbSoftwareVersion() {
        return ybSoftwareVersion;
    }
    public void setYbSoftwareVersion(String ybSoftwareVersion) {
        this.ybSoftwareVersion = ybSoftwareVersion;
    }
    public String getYcqlPassword() {
        return ycqlPassword;
    }
    public void setYcqlPassword(String ycqlPassword) {
        this.ycqlPassword = ycqlPassword;
    }
    public String getYsqlPassword() {
        return ysqlPassword;
    }
    public void setYsqlPassword(String ysqlPassword) {
        this.ysqlPassword = ysqlPassword;
    }
    public String getZone() {
        return zone;
    }
    public void setZone(String zone) {
        this.zone = zone;
    }
    public String getStorageClass() {
        return storageClass;
    }
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

}
