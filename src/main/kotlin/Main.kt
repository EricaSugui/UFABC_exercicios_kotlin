package org.example

import org.example.CadastroDeProdutos.cadastroDeProdutos
import org.example.Calculadora.calculadora
import org.example.CelsiusFahrenheit.celsiusFahrenheit
import org.example.Idade.idade
import org.example.MaiorDeDois.maiorDeDois
import org.example.NumerosPares.numerosPares
import org.example.OlaMundo.olaMundo
import org.example.Senha.senha
import org.example.Tabuada.tabuada
import java.util.Scanner
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Escolha o programa:")
    println("1 - Olá, Mundo!")
    println("2 - Cadastro de Produtos")
    println("3 - Conversor Celsius/Fahrenheit")
    println("4 - Maior de dois números")
    println("5 - Classificação de idade")
    println("6 - Calculadora Simples")
    println("7 - Números pares de 1 a 20")
    println("8 - Tabuada de multiplicação")
    println("9 - Acerte a senha")
    println("10 - Função de soma")
    println("11 - Verificador de Par ou Ímpar")
    println("12 - Cálculo da área do círculo")
    println("13 - Classe Carro")
    println("14 - Classe Conta Corrente")
    print("Opção: ")
    val leitura = Scanner(System.`in`)
    when (leitura.nextLine()) {
        "1" -> olaMundo()
        "2" -> cadastroDeProdutos()
        "3" -> celsiusFahrenheit()
        "4" -> maiorDeDois()
        "5" -> idade()
        "6" -> calculadora()
        "7" -> numerosPares()
        "8" -> tabuada()
        "9" -> senha()
        "10" -> org.example.FuncaoSoma.main()
        "11" -> org.example.ParOuImpar.main()
        "12" -> org.example.AreaDoCirculo.main()
        "13" -> org.example.Carro.main()
        "14" -> org.example.ContaCorrente.main()
        else -> println("Opção inválida")
    }
}