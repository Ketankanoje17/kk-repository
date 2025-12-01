package client;

import com.mahindraFinance.common.autofin.exception.ExceptionCode;
import com.mahindraFinance.common.autofin.exception.UserServiceException;
import com.mahindraFinance.common.autofin.model.response.SuccessResponse;
import com.mahindraFinance.common.autofin.model.user.LMSModule;
import com.mahindraFinance.common.autofin.model.user.UserDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


@Component
public class UserClient {

    private final RestTemplate restTemplate;

    @Value("${user-service.base-url}")
    private String baseUrl;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public UserClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public UserDetails getUserDetails(String employeeCode, LMSModule module, boolean permissions, boolean branchDetails) {
        Map<String, Object> params = new HashMap<>();
        params.put("permissions", permissions);
        params.put("branchDetails", branchDetails);

        try {
            this.logger.info("Api call to user service to fetch user details");
//            String bearerToken = tokenGeneration.getBearerToken();
            HttpEntity<String> requestHeader = new HttpEntity<>(getHttpHeaders(employeeCode));


            StringBuilder urlBuilder = new StringBuilder(baseUrl + employeeCode);
            urlBuilder.append("?");
            for (Map.Entry<String, ?> entry : params.entrySet()) {
                urlBuilder.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
            }
            String url = urlBuilder.toString();
            this.logger.info("API URL: {}", url);

            ParameterizedTypeReference<SuccessResponse<UserDetails>> typeRef = new ParameterizedTypeReference<>() {};
            ResponseEntity<SuccessResponse<UserDetails>> response = restTemplate.exchange(url, HttpMethod.GET, requestHeader, typeRef);

            if (response.getStatusCode() == HttpStatus.OK) {
                SuccessResponse<UserDetails> successResponse = response.getBody();
                assert successResponse != null;
                return successResponse.getData();

            }

        } catch (HttpClientErrorException var13) {
            if (var13.getStatusCode().equals(HttpStatus.NOT_FOUND)) {
                throw new UserServiceException(ExceptionCode.USER_ACCESS_DATA_NOT_FOUND ,"User with userId: %s not found".formatted(employeeCode));
            } else if (var13.getStatusCode().equals(HttpStatus.UNAUTHORIZED)) {
                throw new UserServiceException(ExceptionCode.ACCESS_DENIED,"Unauthorized request");
            } else {
                this.logger.error("Api call to user service to fetch user details. Exception: {0}", var13);
                throw new UserServiceException(ExceptionCode.AUTH_FAILURE,"Http call to user service failed while fetching user details");
            }
        }

        return null;
    }

    public HttpHeaders getHttpHeaders(String userId) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("userId", userId);
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }


}
