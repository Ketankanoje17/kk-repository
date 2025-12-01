package auth.fakeauth;



import com.mahindrafinance.entitymaster.config.CorsConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer {
    private final CorsConfig corsConfig;
    @Autowired
    public WebConfig(CorsConfig corsConfig) {
        this.corsConfig = corsConfig;
    }
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(corsConfig.getAllowedOrigins().toArray(new String[0]));
    }
}