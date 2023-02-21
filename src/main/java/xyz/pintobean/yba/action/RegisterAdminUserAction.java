package xyz.pintobean.yba.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import xyz.pintobean.yba.domain.user.AdminUser;
import xyz.pintobean.yba.domain.user.Customer;

/**
 * Registers the admin user
 */
public class RegisterAdminUserAction extends YbaClientAction {

    private static final Log LOG = LogFactory.getLog(RegisterAdminUserAction.class);

    /**
     * Implements <code>YbaClientAction.runAction()</code>
     */
    @Override
    public Map<String, Object> runAction() {

        Map<String, Object> result = new HashMap<String, Object>();
        StringBuilder url = new StringBuilder();
        RestTemplate restTemplate = new RestTemplate();

        //Check to see if user exists
        if (args.getApiToken() != null && !args.getApiToken().isEmpty()) {
            //Build request URL
            url.append(normalizeHostname(args.getHostname()));
            url.append("/api/v1/customers");
            LOG.debug(String.format("URL created = [%s]", url.toString()));

            //API call
            HttpEntity<Object> httpEntity = this.getHttpEntity(args.getApiToken());
            LOG.info(String.format("Sending list customers request to %s", url.toString()));
            ResponseEntity<Customer[]> customersResponseEntity = restTemplate.exchange(
                url.toString(),
                HttpMethod.GET, 
                httpEntity,
                Customer[].class
            );
            Customer[] existingCustomers = customersResponseEntity.getBody();
            if (existingCustomers.length > 0) {
                LOG.info(
                    String.format(
                        "Admin user already exists with uuid [%s]. Returning existing user.",
                        existingCustomers[0].getUuid()));
                result.put("result", "admin user already exists");
                result.put("customerUuid", existingCustomers[0].getUuid());
                return result;
            }
        }
        //End check for existing user
        
        //Admin user
        AdminUser adminUser = new AdminUser();
        adminUser.setConfirmEULA(Boolean.TRUE);
        adminUser.setName(args.getFullName());
        adminUser.setPassword(args.getAdminPassword());
        adminUser.setConfirmPassword(args.getAdminPassword());
        adminUser.setEmail(args.getEmail());
        adminUser.setCode(args.getEnvironment());
        
        //Build request URL
        url = new StringBuilder();
        url.append(normalizeHostname(args.getHostname()));
        url.append("/api/v1/register?generateApiToken=true");
        LOG.debug(String.format("URL created = [%s]", url.toString()));

        //API call
        LOG.info(String.format("Sending Register Admin request to %s", url.toString()));
        String response = restTemplate.postForObject(
            url.toString(), 
            adminUser, 
            String.class
        );
        LOG.debug(String.format("Response for register admin = [%s]", response));

        //Return values
        JSONObject jsonObject = new JSONObject(response);
        result.put("result", "success");
        result.put("apiToken", jsonObject.getString("apiToken"));
        result.put("customerUuid", jsonObject.getString("customerUUID"));
        result.put("userUuid", jsonObject.getString("userUUID"));
        return result;

    }

}
