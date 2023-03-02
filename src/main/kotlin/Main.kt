fun main() {
    val conta = Conta()
    conta.titular = "Leandro"
    conta.depositar(100.0)
    println(conta.mostrarSaldo())
    conta.depositar(100.0)
    println(conta.mostrarSaldo())
    conta.retirar(50.0)
    conta.retirar(50.0)
    conta.retirar(50.0)
    conta.retirar(50.0)
}