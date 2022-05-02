package sistemaBancario

fun main() {
    println("------------------------------------------------")
    println("Escolha o tipo de conta: ")
    println("[1] Corrente")
    println("[2] Poupança")
    println("[3] Salário")
    print("Digite o nº da opção escolhida: ")
    when(readln().toInt()){
        1 -> {
            print("Digite o saldo inicial da sua conta: ")
            val saldo = readln().toDouble()
            val corrente = ContaCorrente(saldo)
            corrente.comandos()
        }
        2 -> {
            val poupanca = ContaPoupanca()
            poupanca.comandos()
        }
        3 -> {
            val salario = ContaSalario()
            salario.comandos()
        }
        else -> {
            println("Inválido")
            main()
        }
    }
}