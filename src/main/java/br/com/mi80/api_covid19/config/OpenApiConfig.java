package br.com.mi80.api_covid19.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean

    public OpenAPI customApi(){
        return new OpenAPI().info(new Info()
                .title("API-Covid19")
                .version("v1")
                .description("This a learning api, about data of covid 19")
                .contact(new Contact()
                        .name("Guilherme Gonçalves Cherpinski")
                        .email("cherpinskiguilherme@gmail.com"))

        );
    }
}
