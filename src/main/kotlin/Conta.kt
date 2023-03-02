class Conta {
    var titular = ""
    var numero = 0
    private var saldo = 0.0

    fun depositar(valor: Double) {
        saldo += valor
    }

    fun mostrarSaldo(): Double {
        return saldo
    }

    fun retirar(valor: Double) {
        if (podeRetirar(valor)) {
            saldo -= valor
            println("Seu saldo é de ${saldo}")
        } else {
            println("Saldo insuficiente para realizar essa operação")
        }
    }

    private fun podeRetirar(valor: Double): Boolean {
        return (saldo - valor) > 0
    }
}