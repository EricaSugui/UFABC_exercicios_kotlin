package org.example.Carro

class Carro(val marca: String, val modelo: String, val ano: Int) {
    fun exibirDetalhes() {
        println("Marca: $marca, Modelo: $modelo, Ano: $ano")
    }
}
fun main() {
    println("Classe Carro")
    val meuCarro = Carro("Ford", "Focus", 2017)
    val carroMarido = Carro("Ford", "Fusion", 2018)
    meuCarro.exibirDetalhes()
    carroMarido.exibirDetalhes()
}