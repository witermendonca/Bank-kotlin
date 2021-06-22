abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val cargo: String
) {
//    open fun bonificacao(): Double {
//        return salario * 0.1
//    }

    abstract fun bonificacao(): Double

    abstract fun salarioTotal(): Double
}