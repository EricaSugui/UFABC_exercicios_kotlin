package org.example.CelsiusFahrenheit

import java.util.Scanner

fun celsiusFahrenheit() {
    val leitura = Scanner(System.`in`)
    println("Conversor Celsius/Fahrenheit")

    print("Digite a temperatura em graus Celsius: ")
    val celsius: String = leitura.nextLine()
    val fahrenheit: Double = (celsius.toDouble() * 9/5) + 32
    println("Temperatura em Fahrenheit: $fahrenheit °F")
}