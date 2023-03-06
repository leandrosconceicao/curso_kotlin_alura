fun main() {
    val conta = Conta(titular="Leandro", numero = 9999)
    conta.depositar(100.0)
    println(conta.getSaldo())
    conta.depositar(100.0)
    println(conta.getSaldo())
    conta.retirar(50.0)
    conta.retirar(50.0)
    conta.retirar(50.0)
    conta.retirar(50.0)
}