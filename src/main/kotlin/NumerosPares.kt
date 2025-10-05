package org.example.NumerosPares

fun numerosPares() {
    println("Números pares de 1 a 20")
    for (num in 1..20) {
        if (num % 2 == 0) {
            print("$num ")
        }
    }
    println()
}