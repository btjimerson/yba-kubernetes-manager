package xyz.pintobean.yba.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

import xyz.pintobean.yba.domain.user.AdminUser;

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
        
        //Admin user
        AdminUser adminUser = new AdminUser();
        adminUser.setConfirmEULA(Boolean.TRUE);
        adminUser.setName(args.getFullName());
        adminUser.setPassword(args.getAdminPassword());
        adminUser.setConfirmPassword(args.getAdminPassword());
        adminUser.setEmail(args.getEmail());
        adminUser.setCode(args.getEnvironment());
        
        //Build request URL
        StringBuilder url = new StringBuilder();
        url.append(normalizeHostname(args.getHostname()));
        url.append("/api/v1/register?generateApiToken=true");
        LOG.debug(String.format("URL created = [%s]", url.toString()));

        //API call
        RestTemplate restTemplate = new RestTemplate();
        LOG.info(String.format("Sending Register Admin request to %s", url.toString()));
        String response = restTemplate.postForObject(
            url.toString(), 
            adminUser, 
            String.class
        );
        LOG.debug(String.format("Response for register admin = [%s]", response));

        //Return values
        JSONObject jsonObject = new JSONObject(response);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("result", "success");
        result.put("apiToken", jsonObject.getString("apiToken"));
        result.put("customerUuid", jsonObject.getString("customerUUID"));
        result.put("userUuid", jsonObject.getString("userUUID"));
        return result;

    }

}
