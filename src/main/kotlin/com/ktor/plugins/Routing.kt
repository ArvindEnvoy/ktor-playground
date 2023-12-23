package com.ktor.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            val myAtt = call.parameters.get("myAtt")
            myAtt?.let {
                call.respondText("myAtt was $myAtt")
            }
            call.respondText("Hello World!")
        }
    }
}
