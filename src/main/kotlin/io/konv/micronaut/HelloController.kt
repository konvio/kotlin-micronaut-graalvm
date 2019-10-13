package io.konv.micronaut

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable

@Controller("/hello")
class HelloController {

    @Get(value = "/{name}", produces = [MediaType.TEXT_PLAIN])
    fun hello(@PathVariable name: String) = "Hello $name!"
}