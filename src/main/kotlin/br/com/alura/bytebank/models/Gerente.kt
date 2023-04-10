package br.com.alura.bytebank.models

class Gerente(
    name: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(name, cpf, salario, senha), Autenticavel {

    override val bonificacao: Double
        get() {
            return salario * 0.2
        }

    override fun autentica(senha: Int): Boolean {
        return super.autentica(senha)
    }
}