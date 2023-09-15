package com.example;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class FormFormatTest {

    private static final LocalDate DATE = LocalDate.of(2023, 9, 8);
    private static final String EXPECTED_DATE = "2023/09/08";

    @Inject
    private FormFormatClient client;

    @Test
    void testQueryParameter() {
        var response = client.sendFormattedQueryParameter(DATE, "body");
        assertEquals(EXPECTED_DATE, response.body());
    }
    @Test
    void testFormParameter() {
        var response = client.sendFormattedFormParameter(DATE);
        assertEquals(EXPECTED_DATE, response.body());
    }

}
