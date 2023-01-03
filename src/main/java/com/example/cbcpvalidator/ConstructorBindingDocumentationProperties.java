package com.example.cbcpvalidator;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.net.URL;

@ConfigurationProperties("documentation")
@ConstructorBinding
public class ConstructorBindingDocumentationProperties implements Validator {

    private Boolean validated = false;

    private final URL url;

    public ConstructorBindingDocumentationProperties(URL url) {
        this.url = url;
    }

    public URL getUrl() {
        return url;
    }

    public Boolean isValidated() {
        return validated;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(this.getClass());
    }

    @Override
    public void validate(Object target, Errors errors) {
        validated = true;
    }
}
