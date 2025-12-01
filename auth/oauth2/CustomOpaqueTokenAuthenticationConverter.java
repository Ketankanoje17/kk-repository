package auth.oauth2;


import com.mahindraFinance.common.autofin.model.auth.UserInfoAuthResponse;
import com.mahindrafinance.entitymaster.auth.MyUserDetailsService;
import com.nimbusds.jose.shaded.gson.FieldNamingPolicy;
import com.nimbusds.jose.shaded.gson.Gson;
import com.nimbusds.jose.shaded.gson.GsonBuilder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.core.OAuth2AuthenticatedPrincipal;
import org.springframework.security.oauth2.server.resource.introspection.OpaqueTokenAuthenticationConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Objects;

@Component
@ConditionalOnProperty(value = "auth.oauth2.enabled")
public class CustomOpaqueTokenAuthenticationConverter implements OpaqueTokenAuthenticationConverter {

    private final MyUserDetailsService userDetailsService;
    private final RestTemplate restTemplate;
    private final OAuth2ClientProperties oAuth2ClientProperties;
    private static final String CLIENT_NAME_FOR_REGISTRATION = "LMS";
    private final String taClientProvider;
    private boolean authenticated;

    public CustomOpaqueTokenAuthenticationConverter(MyUserDetailsService userDetailsService,
                                                    RestTemplate restTemplate,
                                                    OAuth2ClientProperties oAuth2ClientProperties) {
        this.userDetailsService = userDetailsService;
        this.restTemplate = restTemplate;
        this.oAuth2ClientProperties = oAuth2ClientProperties;
        taClientProvider = oAuth2ClientProperties.getRegistration().get(CLIENT_NAME_FOR_REGISTRATION).getProvider();
    }

    @Override
    public Authentication convert(String introspectedToken, OAuth2AuthenticatedPrincipal authenticatedPrincipal) {
        authenticated = Objects.requireNonNull(authenticatedPrincipal.getAttribute("active")).equals(true);

        UserDetails userDetails = getUserDetails(introspectedToken);
        return new Authentication() {
            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                return userDetails.getAuthorities();
            }

            @Override
            public Object getCredentials() {
                return null;
            }

            @Override
            public Object getDetails() {
                return null;
            }

            @Override
            public Object getPrincipal() {
                return userDetails;
            }

            @Override
            public boolean isAuthenticated() {
                return authenticated;
            }

            @Override
            public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
                authenticated = isAuthenticated;
            }

            @Override
            public String getName() {
                return userDetails.getUsername();
            }
        };
    }

    public UserDetails getUserDetails(String introspectedToken) {
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.AUTHORIZATION, "Bearer " + introspectedToken);
        HttpEntity<String> requestEntity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(oAuth2ClientProperties.getProvider().get(taClientProvider).getUserInfoUri(),
                HttpMethod.GET, requestEntity, String.class, new HashMap<>());
        String responseStr = response.getBody();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        UserInfoAuthResponse userInfoAuthResponse = gson.fromJson(responseStr, UserInfoAuthResponse.class);

        return userDetailsService.loadUserByUsername(userInfoAuthResponse.getSub());
    }
}
