package com.andres.routes

import com.andres.data.model.Question
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL = "http://localhost:8080"

private val questions = listOf(
    Question(
        "¿Cuál es el río más largo del mundo?",
        "Río Nilo",
        "Río Misisipi",
        "Río Amazonas",
        "C"
    ),
    Question(
        "¿Cuál es el país con más habitantes del mundo?",
        "Rusia",
        "China",
        "Estados unidos",
        "B"
    ),
    Question(
        "¿Cuál es el edificio más alto del mundo?",
        "Torre de Shanghái",
        "Goldin Finance",
        "Burj Khalifa",
        "C"
    )
)

fun Route.easyQuestions() {
    get("/easy-questions") {
        call.respond(
            HttpStatusCode.OK,
            questions
        )
    }
}