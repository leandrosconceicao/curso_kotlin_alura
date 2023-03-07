class Gerente(
    name: String,
    cpf: String,
    salario: Double,
    senha: Int
) : Funcionario(name, cpf, salario) {
//    fun bonificacao(): Double {
//        return salario * 0.1
//    }
}