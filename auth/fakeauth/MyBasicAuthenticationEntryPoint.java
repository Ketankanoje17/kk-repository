package auth.fakeauth;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mahindraFinance.common.autofin.exception.ExceptionCode;
import com.mahindraFinance.common.autofin.model.response.ErrorResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.core.annotation.Order;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
@Order(2)
@ConditionalOnProperty(value = "auth.basic")
public class MyBasicAuthenticationEntryPoint extends BasicAuthenticationEntryPoint {

    private final ObjectMapper objectMapper;

    public MyBasicAuthenticationEntryPoint(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authEx) throws IOException {
        Error error = new Error(ExceptionCode.AUTH_FAILURE.getValue(), List.of(authEx.getMessage()));
        response.setHeader("Strict-Transport-Security", "max-age=31536000; includeSubDomains");
        response.addHeader("WWW-Authenticate", "Basic realm=\"" + getRealmName() + "\"");
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.setContentType("application/json");
        response.getWriter().println(objectMapper.writeValueAsString(new ErrorResponse(error)));
    }

    @Override
    public void afterPropertiesSet() {
        setRealmName("AuthRealm");
        super.afterPropertiesSet();
    }
}
