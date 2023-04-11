package br.com.alura.bytebank.models

class Cliente(
    val nome: String,
    val cpf: String,
    var endereco: Endereco,
    private val senha: Int
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha != senha) {
            return false
        }
        return true;
    }
}