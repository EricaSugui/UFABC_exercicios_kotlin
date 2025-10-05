package org.example.Senha

import java.util.Scanner

fun senha(){
    val leitura = Scanner(System.`in`)
    println("Acerte a senha")
    val senhaCorreta = "kotlin123"
    do {
        print("Digite a senha: ")
        val senhaDigitada = leitura.nextLine()
        if (senhaDigitada == senhaCorreta) {
            println("Senha correta - Acesso permitido")
            break
        } else {
            println("Senha incorreta. Tente novamente.")
        }
    } while (true)
}