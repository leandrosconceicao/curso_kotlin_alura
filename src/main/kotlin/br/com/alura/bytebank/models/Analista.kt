package br.com.alura.bytebank.models

class Analista(
    name: String,
    cpf: String,
    salario: Double,
) : Funcionario(name, cpf, salario) {

    override val bonificacao: Double
        get() {
            return salario * 0.1
        }
}