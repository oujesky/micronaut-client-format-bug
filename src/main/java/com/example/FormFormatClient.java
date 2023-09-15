package com.example;

import io.micronaut.core.convert.format.Format;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.http.client.annotation.Client;

import java.time.LocalDate;

@Client("/")
public interface FormFormatClient {

    @Post("/form/query")
    @Produces(MediaType.APPLICATION_FORM_URLENCODED)
    @Consumes(MediaType.TEXT_PLAIN)
    HttpResponse<String> sendFormattedQueryParameter(@QueryValue @Format("yyyy/MM/dd") LocalDate queryDate, String body);

    @Post("/form/body")
    @Produces(MediaType.APPLICATION_FORM_URLENCODED)
    @Consumes(MediaType.TEXT_PLAIN)
    HttpResponse<String> sendFormattedFormParameter(@Format("yyyy/MM/dd") LocalDate bodyDate);
}
