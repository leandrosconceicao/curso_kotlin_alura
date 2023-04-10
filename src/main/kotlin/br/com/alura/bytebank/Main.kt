package br.com.alura.bytebank

import br.com.alura.bytebank.models.Diretor

fun main() {
    val dir = Diretor(name =  "", cpf = "", salario = 0.0, senha = 1234, plr = 1)

    dir.autentica(1234)
}