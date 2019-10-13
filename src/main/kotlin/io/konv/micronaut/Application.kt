package io.konv.micronaut

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("kotlin.micronaut.graalvm")
                .mainClass(Application.javaClass)
                .start()
    }
}