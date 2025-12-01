package config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Setter
@Getter
@ConfigurationProperties("no-auth-url")
public class NoAuthUrlConfiguration {

    private List<String> urls;

}
