package io.konv.micronaut;

import com.google.common.hash.Hashing;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Produces;

import java.nio.charset.StandardCharsets;

@Controller("/demo")
public class DemoController {

    @Get("/hash/sha256/{text}")
    @Produces(MediaType.TEXT_PLAIN)
    public String sha256(@PathVariable("text") String text) {
        return Hashing.sha256()
                .hashString(text, StandardCharsets.UTF_8)
                .toString();
    }
}
