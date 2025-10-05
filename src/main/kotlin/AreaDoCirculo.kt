package org.example.AreaDoCirculo

fun areaDoCirculo(raio: Double): String {
    println("Cálculo da área do círculo")

    val area = Math.PI * raio * raio
    val areaFormatada = String.format("%.2f", area)
    return "A área do círculo de raio $raio é: $areaFormatada"
}
fun main() {
    println(areaDoCirculo(5.0))
}