package client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component
public class AutofinClient {

    private final RestTemplate restTemplate;
    private final TokenGeneration tokenGeneration;

    @Value("${autofin.dedupe.submission-verification-url}")
    private String dedupeSubmVerfStatus;

    public AutofinClient(RestTemplate restTemplate, TokenGeneration tokenGeneration) {
        this.restTemplate = restTemplate;
        this.tokenGeneration = tokenGeneration;
    }


    public String getDedupeSubmissionVerficationStatus(String requestId) {
        try {
            String bearerToken = tokenGeneration.getToken();
            HttpHeaders headers = tokenGeneration.getHttpHeaders(bearerToken);
            HttpEntity<String> entity = new HttpEntity<>(headers);
            String count = null;

            ResponseEntity<String> response = restTemplate.exchange(dedupeSubmVerfStatus + requestId, HttpMethod.GET, entity, String.class);
            log.info("response.getBody(): " + response);
//            ObjectMapper objectMapper = new ObjectMapper();
//            JsonNode responseJson = objectMapper.readTree(response.getBody());
//            count = responseJson.has("cnt") ? responseJson.get("cnt").asText(): null;
            return response.getBody();
        } catch (Exception ex) {
            log.error("Get dedupe Status failed: " + ex);
            throw new RuntimeException("Failed to fetch Dedupe Status.");
        }
    }
}
