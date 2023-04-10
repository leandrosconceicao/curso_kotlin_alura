package br.com.alura.bytebank.models

class CalculadoraBonificacao {

    private var total: Double = 0.0
    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }
//    fun registra(gerente: models.Gerente) {
//        this.total += gerente.bonificacao
//    }
//    fun registra(diretor: models.Diretor) {
//        this.total += diretor.bonificacao
//    }
}