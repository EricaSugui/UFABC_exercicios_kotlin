package org.example.ParOuImpar

fun parOuImpar(num: Int): String {

    if (num % 2 == 0) {
        return "O número $num é Par."
    } else {
        return "O número $num é Ímpar."
    }
}
fun main() {
    println("Verificador de Par ou Ímpar")

    println(parOuImpar(0))
    println(parOuImpar(1))
    println(parOuImpar(2))
    println(parOuImpar(33))
    println(parOuImpar(456))
    println(parOuImpar(-7890))
}