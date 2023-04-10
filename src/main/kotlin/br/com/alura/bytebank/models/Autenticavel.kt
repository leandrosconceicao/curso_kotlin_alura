package br.com.alura.bytebank.models

interface Autenticavel {
    fun autentica(senha: Int): Boolean
}