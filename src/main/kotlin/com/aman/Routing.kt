package com.aman

import com.aman.model.Type
import com.aman.repository.FruitRepository
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.Application
import io.ktor.server.http.content.staticResources
import io.ktor.server.response.respond
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import io.ktor.server.routing.routing

fun Application.configureRouting() {
    routing {

        route("/") {
            get {
                val fruits = FruitRepository.allFruits()
                if (fruits.isEmpty()) {
                    call.respond(HttpStatusCode.NoContent)
                } else {
                    call.respond(fruits)
                }
            }

            get("/name/{fruitName}") {
                println("Fruits Name Route")
                val name = call.parameters["fruitName"]
                if(name == null){
                    call.respond(HttpStatusCode.BadRequest)
                    return@get
                }

                val fruit = FruitRepository.fruitsByName(name)
                if(fruit == null){
                    call.respond(HttpStatusCode.NotFound, "No fruit found with the name: $name")
                    return@get
                }
                call.respond(fruit)
            }

            get("/season/{fruitSeason}") {
                println("Fruits Season Route")
                val season = call.parameters["fruitSeason"]
                if(season == null){
                    call.respond(HttpStatusCode.BadRequest, "Season parameter is missing or invalid.")
                    return@get
                }

                val fruit = FruitRepository.fruitsBySeason(season)
                if(fruit == null){
                    call.respond(HttpStatusCode.NotFound,"No fruits found for the season: $season" )
                    return@get
                }
                call.respond(fruit)
            }

            get("/fruitType/{fruitType}") {
                println("Fruits Type Route")
                val type = call.parameters["type"]
                if(type == null){
                    call.respond(HttpStatusCode.BadRequest, "Type parameter is missing or invalid.")
                    return@get
                }
           try {
                val typeFruit = Type.valueOf(type)
                val fruits = FruitRepository.fruitsByType(typeFruit)

                if(fruits.isEmpty()){
                    call.respond(HttpStatusCode.NotFound,"No fruits found for the type: $type")
                    return@get
                }
                call.respond(fruits)
            }catch (ex: IllegalArgumentException){
                call.respond(HttpStatusCode.BadRequest, "Invalid fruit type: $type")

                }
            }

        }
        staticResources("/static", "static")
    }
}
