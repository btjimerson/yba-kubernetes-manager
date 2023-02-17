package xyz.pintobean.yba.domain;

public class YbaArguments {

    private String email;
    private String environment;
    private String fullName; 
    private String hostname;
    private Integer latitude;
    private Integer longitude;
    private String kubeconfigPath; 
    private String name; 
    private String namespace;
    private String password; 
    private String pullSecretName; 
    private String pullSecretPath; 
    private String region; 
    private Integer replicationFactor;
    private String serviceAccount;
    private String storageClass; 
    private String universeName;
    private Integer volumeSize; 
    private String ybSoftwareVersion;
    private String ycqlPassword; 
    private String ysqlPassword;
    private String zone;

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
    public Integer getLatitude() {
        return latitude;
    }
    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }
    public Integer getLongitude() {
        return longitude;
    }
    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }
    public String getKubeconfigPath() {
        return kubeconfigPath;
    }
    public void setKubeconfigPath(String kubeconfigPath) {
        this.kubeconfigPath = kubeconfigPath;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
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
