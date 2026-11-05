package com.github.apermar1301.Ejercicio2

var sessionCount: Int = 0

fun startNewSession() = sessionCount++
fun getSessionReport(): String = "Total sessions started: $sessionCount"


fun main() {
    repeat(3) { startNewSession() }
    println(getSessionReport())
    startNewSession()
    println(getSessionReport())
}