package com.github.apermar1301.Ejercicio4

fun testBoth(n1: Int, n2: Int, condition: (Int) -> Boolean): Boolean = condition(n1) && condition(n2)

fun main() {
    println(testBoth(1, 3) { it > 1 })
    println(testBoth(3, 4) { it > 2 })
}