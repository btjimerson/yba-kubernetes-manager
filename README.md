# YugabyteDB Anywhere Kubernetes Manager

## Introduction
This repository is an application that is meant to run in Kubernetes and act as a client for YugabyteDB Anywhere (YBA) running in the same cluster.  The application performs 3 functions in YBA:

 1. Registers an Administrator
 1. Creates a Kubernetes cloud provider
 1. Creates a 1-node cluster and universe

## Running
This is a Spring Boot application with Maven. To install and run the application:

```
mvn clean package spring-boot:run
```

### Properties / environment variables
The following environment variables or Java properties are available. Make sure they're prefixed with `'yba'`. These are [Spring Boot configuration properties](https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.external-config), so make sure that you format them according to Spring rules for the source. For example, to set `pullSecretName` as an environment variable:
```
export YBA_PULL_SECRET_NAME=pullSecret
```

and to set it in a properties file:
```
yba.pullSecretName=pullSecret
```

| Argument          | Required? | Value                                              | Default Value                                   |
|-------------------|-----------|----------------------------------------------------|-------------------------------------------------|
| email             | Yes       | The email address of the administrator             |                                                 |
| environment       | No        | The environment to create for the administrator    | demo                                            |
| fullName          | Yes       | The full name of the administrator                 |                                                 |
| hostname          | No        | The hostname of YBA (defaults to                   | yugaware-yugaware-ui.yugabyte.svc.cluster.local |
| kubeconfigPath    | Yes       | The path to the kubeconfig to use                  |                                                 |
| name              | No        | The provider's name                                | gke                                             |
| namespace         | No        | The namespace to deploy Yugabyte nodes in          | yb-nodes                                        |
| password          | Yes       | The password of the administrator                  |                                                 |
| pullSecretName    | No        | The name of the pull secret for Yugabyte nodes     | yugabyte-k8s-pull-secret                        |
| pullSecretPath    | Yes       | The path to the pull secret's file contents        |                                                 |
| region            | Yes       | The name of the region for the Kubernetes provider |                                                 |
| regionLatitude    | Yes       | The latitude coordinate of the region              |                                                 |
| regionLongitude   | Yes       | The longitude coordinate of the region             |                                                 |
| replicationFactor | No        | The replication factor for the universe            | 1                                               |
| serviceAccount    | No        | The service account to use for universe creation   | yugabyte-platform-universe-management           |
| storageClass      | No        | The storage class for persistent volumes           | standard                                        |
| universeName      | Yes       | The name of the universe                           |                                                 |
| volumeSize        | No        | The size in GB to use for node volumes             | 100                                             |
| ybSoftwareVersion | Yes       | The version of Yugabyte to use for the universe    | 2.17.0.0-b24                                    |
| ycqlPassword      | Yes       | The password for the yugabyte user for YCQL        |                                                 |
| ysqlPassword      | Yes       | The password for the yugabyte user for YSQL        |                                                 |
| zone              | Yes       | The name of the zone for the Kubernetes provider   |                                                 |
