package se.inyat.marketplace_backend.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for Swagger/OpenAPI.
 * This class configures the OpenAPI documentation with basic information.
 */
@Configuration
@OpenAPIDefinition(info = @Info(title = "Marketplace API", version = "0.1", description = "API Information"))
public class SwaggerConfig {

}