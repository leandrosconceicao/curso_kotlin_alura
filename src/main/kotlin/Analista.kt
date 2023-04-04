class Analista(
    name: String,
    cpf: String,
    salario: Double,
) : Funcionario(name, cpf, salario) {

    override val bonificacao: Double
        get() {
            return super.bonificacao + salario * 0.1
        }
}