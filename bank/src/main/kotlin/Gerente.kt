class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    cargo: String = "Gerente"
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario,
    cargo = cargo
) {
    override fun bonificacao(): Double = salario * 0.2

    override fun salarioTotal(): Double = this.salario + bonificacao()
}