package com.example.cbcpvalidator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({SimpleDocumentationProperties.class, ConstructorBindingDocumentationProperties.class})
public class ConfigurationPropertiesValidatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationPropertiesValidatorApplication.class, args);
    }

}
