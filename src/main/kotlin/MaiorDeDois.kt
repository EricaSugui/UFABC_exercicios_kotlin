package org.example.MaiorDeDois

import java.util.Scanner

fun maiorDeDois() {
    val leitura = Scanner(System.`in`)
    println("Maior de dois números")

    print("Digite o primeiro número: ")
    val num1: Int = leitura.nextInt()
    print("Digite o segundo número: ")
    val num2: Int = leitura.nextInt()
    val maior: Int = if (num1 > num2) num1 else num2
    println("O maior número entre $num1 e $num2 é $maior")

}