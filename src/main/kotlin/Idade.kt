package org.example.Idade

import java.util.Scanner

fun idade() {
    val leitura = Scanner(System.`in`)
    println("Classificação etária")

     print("Digite sua idade: ")
    val idade: Int = leitura.nextInt()
    if(idade < 0) {
        println("Idade inválida")
        return
    }
    val classificacao: String = if (idade in 0 .. 12) {
        "Criança"
    } else if (idade in 12..17) {
        "Adolescente"
    } else if (idade in 18..59) {
        "Adulto"
    } else if (idade >= 60) {
        "Idoso"
    } else {
        "Idade inválida"
    }

    println("Você é classificado como: $classificacao")
}