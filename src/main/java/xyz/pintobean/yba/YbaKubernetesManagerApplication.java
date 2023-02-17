package xyz.pintobean.yba;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import xyz.pintobean.yba.action.CreateProviderAction;
import xyz.pintobean.yba.action.CreateUniverseAction;
import xyz.pintobean.yba.action.RegisterAdminUserAction;
import xyz.pintobean.yba.domain.YbaArguments;

@SpringBootApplication
public class YbaKubernetesManagerApplication implements ApplicationRunner {

	private static final Log LOG = LogFactory.getLog(YbaKubernetesManagerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(YbaKubernetesManagerApplication.class, args).close();
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

		YbaArguments ybaArguments = this.buildArguments(args);

		RegisterAdminUserAction registerAdminUserAction = new RegisterAdminUserAction();
		registerAdminUserAction.setArgs(ybaArguments);
		Map<String, Object> results = registerAdminUserAction.runAction();
		LOG.info(String.format("Results from Register Admin user action = [%s]", results.toString()));

		String apiToken = results.get("apiToken").toString();
		String customerUuid = results.get("customerUuid").toString();
		CreateProviderAction createProviderAction = new CreateProviderAction();
		createProviderAction.setApiToken(apiToken);
		createProviderAction.setCustomerUuid(customerUuid);
		createProviderAction.setArgs(ybaArguments);
		results = createProviderAction.runAction();
		LOG.info(String.format("Results from Create Provider action = [%s]", results.toString()));

		CreateUniverseAction createUniverseAction = new CreateUniverseAction();
		String providerUuid = results.get("providerUuid").toString();
		createUniverseAction.setArgs(ybaArguments);
		createUniverseAction.setApiToken(apiToken);
		createUniverseAction.setCustomerUuid(customerUuid);
		createUniverseAction.setProviderUuid(providerUuid);
		results = createUniverseAction.runAction();
		LOG.info(String.format("Results from Create Universe action = [%s]", results.toString()));

	}

	/**
	 * Builds a YbaArguments object from the application's arguments
	 * @param applicationArguments The application's arguments
	 * @return A YbaArguments object created from the application's arguments
	 */
	private YbaArguments buildArguments(ApplicationArguments applicationArguments) {
		
		YbaArguments ybaArguments = new YbaArguments();

		ybaArguments.setEmail(this.getArgumentValue(applicationArguments, "email", null));
		ybaArguments.setEnvironment(this.getArgumentValue(applicationArguments, "environment", "demo"));
		ybaArguments.setFullName(this.getArgumentValue(applicationArguments, "fullName", null));
		ybaArguments.setHostname(this.getArgumentValue(applicationArguments, "hostname", "yugaware-yugaware-ui.yugabyte.svc.cluster.local"));
		ybaArguments.setLatitude(Integer.valueOf(this.getArgumentValue(applicationArguments, "latitude", "41")));
		ybaArguments.setLongitude(Integer.valueOf(this.getArgumentValue(applicationArguments, "longitude", "-95")));
		ybaArguments.setKubeconfigPath(this.getArgumentValue(applicationArguments, "kubeconfigPath", null));
		ybaArguments.setName(this.getArgumentValue(applicationArguments, "name", "gke"));
		ybaArguments.setNamespace(this.getArgumentValue(applicationArguments, "namespace", "yb-nodes"));
		ybaArguments.setPassword(this.getArgumentValue(applicationArguments, "password", null));
		ybaArguments.setPullSecretName(this.getArgumentValue(applicationArguments, "pullSecretName", "yugabyte-k8s-pull-secret"));
		ybaArguments.setPullSecretPath(this.getArgumentValue(applicationArguments, "pullSecretPath", null));
		ybaArguments.setRegion(this.getArgumentValue(applicationArguments, "region", "us-central1"));
		ybaArguments.setReplicationFactor(Integer.valueOf(this.getArgumentValue(applicationArguments, "replicationFactor", "1")));
		ybaArguments.setServiceAccount(this.getArgumentValue(applicationArguments, "serviceAccount", "yugabyte-platform-universe-management"));
		ybaArguments.setStorageClass(this.getArgumentValue(applicationArguments, "storageClass", "standard"));
		ybaArguments.setUniverseName(this.getArgumentValue(applicationArguments, "universeName", null));
		ybaArguments.setVolumeSize(Integer.valueOf(this.getArgumentValue(applicationArguments, "volumeSize", "100")));
		ybaArguments.setYbSoftwareVersion(this.getArgumentValue(applicationArguments, "ybSoftwareVersion", "2.17.0.0-b24"));
		ybaArguments.setYcqlPassword(this.getArgumentValue(applicationArguments, "ycqlPassword", null));
		ybaArguments.setYsqlPassword(this.getArgumentValue(applicationArguments, "ysqlPassword", null));
		ybaArguments.setZone(this.getArgumentValue(applicationArguments, "zone", "us-central1-a"));
		
		return ybaArguments;
	}

	/**
	 * Gets the value of an application argument, or optionally returns the default value. 
	 * @param args The application's arguments
	 * @param argName The name of the argument to get the value for
	 * @param defaultValue Optionally the default value to use
	 * @return The argument's value, or the default value if the argument doesn't exist
	 */
    private String getArgumentValue(ApplicationArguments args, String argName, String defaultValue) {

		List<String> argValues = args.getOptionValues(argName);
		if ((argValues == null || argValues.isEmpty()) && defaultValue == null) {
            throw new RuntimeException(String.format("%s requires a non-empty value.", argName));
		} else if (argValues != null && !argValues.isEmpty()) {
			return argValues.get(0);
		} else if (defaultValue != null) {
			return defaultValue;
		} else {
            throw new RuntimeException(String.format("%s doesn't exist and no default value was specified", argName));
		}
    }
}
