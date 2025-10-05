package org.example.ContaCorrente

class ContaCorrente(private var saldo: Double) {

    fun depositar(valor: Double): String {
        if (valor <= 0) {
            return "Valor de depósito inválido."
        }
        saldo += valor
        return "Depósito de R$ $valor realizado com sucesso. Saldo atual: R$ $saldo"
    }

    fun sacar(valor: Double): String {
        if (valor <= 0) {
            return "Valor de saque inválido."
        }
        return if (valor > saldo) {
            "Saldo insuficiente para saque de R$ $valor. Saldo atual: R$ $saldo"
        } else {
            saldo -= valor
            "Saque de R$ $valor realizado com sucesso. Saldo atual: R$ $saldo"
        }
    }

    fun consultarSaldo(): String {
        return "Saldo atual: R$ $saldo"
    }

}
fun main() {
    println("Gerenciamento de Conta Corrente")

    val minhaConta = ContaCorrente(200.0)

    println(minhaConta.consultarSaldo())
    println(minhaConta.depositar(150.0))
    println(minhaConta.sacar(100.0))
    println(minhaConta.sacar(500.0))
    println(minhaConta.consultarSaldo())
}