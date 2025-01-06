package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloCICDTest {

    private final TestRestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void testHelloEndpoint() {
        ResponseEntity<String> response = restTemplate.getForEntity("/", String.class);
        assertEquals("Hello CI/CD", response.getBody());
    }
}

