package pe.edu.cibertec.patitasfrontendb.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
/*PARTE 2 NUM 1*/
@Configuration
public class RestTemplateConfig {
@Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

}
