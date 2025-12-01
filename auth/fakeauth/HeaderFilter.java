package auth.fakeauth;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
@ConditionalOnProperty(value = "auth.basic")
@Slf4j
public class HeaderFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        final HttpServletRequest req = (HttpServletRequest) request;

        log.info("Get Dealer details api call finished");


        final HttpServletRequestWrapper reqWrapper = new HttpServletRequestWrapper(req) {

            @Override
            public String getHeader(String name) {
                log.info("Header origin "+name);

                if (HttpHeaders.AUTHORIZATION.equals(name)) {
                    log.info("Header origin "+name);

                    if (Objects.nonNull(super.getHeader(name))) {
                        log.info("Header origin "+name);

                        return super.getHeader(name);
                    }
                    String userId = req.getHeader("userId");
                    if (Objects.isNull(userId)) {
                        return super.getHeader(name);
                    }
                    String auth = userId + ":" + userId;
                    byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(StandardCharsets.US_ASCII), false);
                    return "Basic " + new String(encodedAuth);
                }
                return super.getHeader(name);
            }
        };
        if (response instanceof HttpServletResponse) {
            ((HttpServletResponse) response).setHeader("Strict-Transport-Security", "max-age=63072000; includeSubDomains; preload");
        }
        chain.doFilter(reqWrapper, response);
    }
}
