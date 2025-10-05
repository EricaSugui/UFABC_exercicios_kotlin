package org.example.OlaMundo

import java.util.Scanner

fun olaMundo() {
    val leitura = Scanner(System.`in`)
    print("Qual o seu nome? ")
    val nome: String = leitura.nextLine()
    print("Qual a sua formação? ")
    val graduacao: String = leitura.nextLine()
    print("Qual a faculdade? ")
    val faculdade: String = leitura.nextLine()

    println("Olá, mundo!")
    println("Meu nome é $nome")
    println("Sou formada em $graduacao pela $faculdade")

}