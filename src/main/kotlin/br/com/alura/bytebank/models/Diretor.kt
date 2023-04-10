package br.com.alura.bytebank.models

class Diretor(
    name: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Int
) : FuncionarioAdmin(name, cpf, salario, senha), Autenticavel {
    override val bonificacao: Double get() = salario * 0.1
}