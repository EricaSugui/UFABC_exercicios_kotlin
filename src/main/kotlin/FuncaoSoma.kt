package org.example.FuncaoSoma

fun funcaoSoma( num1: Int,  num2: Int): String {
    println("Função de soma")

    val resultado = num1 + num2
    val resultadoString = "A soma de $num1 e $num2 é: $resultado"

    return resultadoString
}
fun main() {
    println(funcaoSoma(2, 4))
}