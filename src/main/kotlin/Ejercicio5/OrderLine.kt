package com.github.apermar1301.Ejercicio5

data class OrderLine(
    val productName: String,
    val price: Double,
)

fun main() {
    val shoppingCart: List<OrderLine> = listOf(
        OrderLine("ProductOne", 9.99),
        OrderLine("ProductTwo", 19.9),
        OrderLine("ProductThree", 59.99),
    )

    // Print every product name (foreach)
    shoppingCart.forEach { println(it.productName) }

    // Filter by price >50 and print it
    val productGreaterThan50 : List<String> = shoppingCart.filter { (_, price) -> price >= 50.0 }.map { it.productName }
    println("Products greater than 50$: $productGreaterThan50")


    // Print the sum of all the prices
    println(shoppingCart.sumOf { it.price })
}