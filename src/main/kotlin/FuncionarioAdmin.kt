abstract class FuncionarioAdmin(
    name: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
) : Funcionario(name, cpf, salario), Autenticavel {
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}