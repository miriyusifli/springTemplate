package com.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class AppIntegrationTest {

    @Autowired
    private ApplicationContext context;

    @DisplayName("Integration test example")
    @Test
    public void testGet() {
        assertNotNull(context);
    }
}
