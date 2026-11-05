package com.github.apermar1301.Ejercicio3

class AppService {

    lateinit var configName: String
    fun initializeConfig(configName: String) = configName.also { this.configName = it }

    fun runService() = println("Running service $configName...")
}

fun main() {
    val service = AppService()
    service.initializeConfig("Production_Env")
    service.runService()
    val faultyService = AppService()
    try {
        faultyService.runService()
    } catch (e: UninitializedPropertyAccessException) {
        println("${e.message}\nIt fault because we tried to access 'configName' variable before it was initialized.")
    }
}