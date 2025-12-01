package client;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Slf4j
@Component
public class TokenGeneration {

    private final RestTemplate restTemplate;

    @Value("${token-api.token-url}")
    private String tokenUrl;
    @Value("${token-api.authorization}")
    private String tokenAuthorization;
    @Value("${token-api.grant_type}")
    private String tokenGrantType;

    public TokenGeneration(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @SneakyThrows
    public String getToken() {
        String apiUrl = tokenUrl;
        HttpHeaders headers = new HttpHeaders();
//        headers.set("access_token", tokenGenerationConfiguration.getAccess_token());
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        headers.set("Content-Type", MediaType.APPLICATION_FORM_URLENCODED_VALUE);
        headers.set("Authorization", tokenAuthorization);
        String requestBody = tokenGrantType;
        String accessToken = null;
        try {
            RequestEntity<String> requestEntity = new RequestEntity<>(requestBody, headers, HttpMethod.POST, new URI(apiUrl));
            ResponseEntity<String> responseEntity = restTemplate.exchange(requestEntity, String.class);
            log.info("HTTP Status Code: {}", responseEntity.getStatusCode());
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode responseJson = objectMapper.readTree(responseEntity.getBody());
            accessToken = responseJson.get("access_token").asText();
            log.info("Response Body for access_token: {}", accessToken);



        } catch (Exception e) {
            throw new RestClientException(e.getLocalizedMessage());
        }
        return accessToken;
    }

    public HttpHeaders getHttpHeaders(String bearerToken) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + bearerToken);
//        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

}
