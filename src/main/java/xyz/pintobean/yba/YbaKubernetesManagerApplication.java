package xyz.pintobean.yba;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	private YbaArguments ybaArguments;

	public static void main(String[] args) {
		SpringApplication.run(YbaKubernetesManagerApplication.class, args).close();
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

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

}
