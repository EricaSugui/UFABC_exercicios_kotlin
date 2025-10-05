package org.example.Tabuada

import java.util.Scanner

fun tabuada() {
    val leitura = Scanner(System.`in`)
    println("Tabuada de multiplicação")
    print("Digite um número para ver sua tabuada: ")
    val num: Int = leitura.nextInt()
    if(num < 1 || num > 10) {
        println("Número inválido. Por favor, digite um número entre 1 e 10.")
        return
    }
    println("Tabuada do $num:")
    var contador = 1
    while (contador <= 10) {
        val resultado = num * contador
        println("$num x $contador = $resultado")
        contador++
    }
}