package br.com.alura.bytebank.models

class ContaCorrente(titular: Cliente, numero: Int) : Conta(titular, numero) {
    override fun retirar(valor: Double) {
        val valorComTaxa = valor + 0.1
        super.retirar(valorComTaxa)
    }
}