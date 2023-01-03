package com.example.cbcpvalidator;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.net.URL;

@ConfigurationProperties("documentation")
public class SimpleDocumentationProperties implements Validator {

    private Boolean validated = false;

    private URL url;

    public void setUrl(URL url) {
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
        ((SimpleDocumentationProperties)target).validated = true;
    }
}
