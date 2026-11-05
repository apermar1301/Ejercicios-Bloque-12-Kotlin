package com.github.apermar1301.Ejercicio1

import java.util.Locale.getDefault

private fun padString(s: String, length: Int): String = s.padEnd(length, ' ')

fun formatTitle(title: String): String = padString(title, 20).uppercase(getDefault())

