package com.example.cbcpvalidator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SimpleDocumentationPropertiesTest {

    @Autowired
    private SimpleDocumentationProperties documentation;

    @Test
    void validator_should_be_called_during_application_startup() {
        assertThat(documentation.getUrl().getHost()).isEqualTo("docs.spring.io");
        assertThat(documentation.isValidated()).isTrue();
    }
}
