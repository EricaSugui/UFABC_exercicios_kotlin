package org.example.CadastroDeProdutos

import java.util.Scanner

fun cadastroDeProdutos() {
    val leitura = Scanner(System.`in`)
    println("SUPERMERCADO KOTLIN - CADASTRO DE PRODUTOS")

    print("Insira o nome do produto: ")
    val produto: String = leitura.nextLine()
    print("Qual o preço? ")
    val preco: String = leitura.nextLine()
    print("Qual cód. de barras? ")
    val codBarras: String = leitura.nextLine()
    print("Item promocional? (S/N) ")
    val promoInput: String = leitura.nextLine()
    val promo: Boolean = if (promoInput.equals("S", ignoreCase = true)) {
        true
    } else {
        false
    }

    println("Produto: $produto")
    println("Preço: R$ $preco")
    println("Cód. Barras: $codBarras")
    println("Item promocional: $promo")
    println("O produto $produto foi cadastrado com sucesso!")
}