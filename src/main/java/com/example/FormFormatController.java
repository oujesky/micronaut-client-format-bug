package com.example;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.annotation.QueryValue;

@Controller
public class FormFormatController {


    @Post("/form/query")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    HttpResponse<String> fromQuery(@QueryValue("queryDate") String queryDate) {
        return HttpResponse.ok(queryDate);
    }

    @Post("/form/body")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    HttpResponse<String> fromFormBody(String bodyDate) {
        return HttpResponse.ok(bodyDate);
    }

}
