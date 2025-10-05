package org.example.Calculadora

import java.util.Scanner

fun calculadora() {
    val leitura = Scanner(System.`in`)
    println("Calculadora Simples")
    print("Digite o primeiro número: ")
    val num1: Int = leitura.nextInt()
    print("Digite o segundo número: ")
    val num2: Int = leitura.nextInt()
    println("Escolha a operação matemática:")
    println("1 - Soma (+)")
    println("2 - Subtração (-)")
    println("3 - Multiplicação (*)")
    println("4 - Divisão (/)")
    print("Opção: ")
    val operacao = leitura.next()
    if(operacao !in listOf("1", "2", "3", "4")) {
        println("Operação inválida")
        return
    }
    val resultado: Double = when (operacao) {
        "1" -> (num1 + num2).toDouble()
        "2" -> (num1 - num2).toDouble()
        "3" -> (num1 * num2).toDouble()
        "4" -> {
            if (num2 == 0) {
                println("Erro: Divisão por zero não é permitida.")
                return
            } else {
                num1.toDouble() / num2.toDouble()
            }
        }
        else -> {
            println("Operação inválida")
            return
        }
    }
    val operacaoString = when (operacao) {
        "1" -> "soma"
        "2" -> "subtração"
        "3" -> "multiplicação"
        "4" -> "divisão"
        else -> ""
    }
    println("A $operacaoString entre $num1 e $num2 é: $resultado")
}