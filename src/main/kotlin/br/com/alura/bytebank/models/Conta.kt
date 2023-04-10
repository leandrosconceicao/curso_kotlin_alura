package br.com.alura.bytebank.models

open class Conta(var titular: String, val numero: Int) {
    private var saldo = 0.0


    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

    open fun retirar(valor: Double) {
        if (podeRetirar(valor)) {
            saldo -= valor
            println("Seu saldo é de ${saldo}")
        } else {
            println("Saldo insuficiente para realizar essa operação")
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        return if (validarSaldo(valor)) {
            retirar(valor)
            destino.depositar(valor)
            true
        } else {
            false
        }
    }

    private fun podeRetirar(valor: Double): Boolean {
        return (saldo - valor) > 0
    }

    private fun validarSaldo(valor: Double): Boolean {
        return saldo >= valor;
    }

    fun getSaldo(): Double {
        return saldo;
    }
}