package sistemaBancario

class ContaCorrente(private var saldoCC: Double): Conta("Conta Corrente", saldoCC) {

    override fun deposito() {
        println("--------------- D E P Ó S I T O ----------------")
        print("Digite a quantidade de dinheiro a ser depositada: ")
        val deposito = readln().toDouble()

        if(deposito > 5000.0){
            println("------------------------------------------------")
            println("Operação inválida, procure a sua agência")
            comandos()
        }
        else{
            saldo += deposito
            println("Novo saldo: $saldo")
            comandos()
        }
    }

    override fun saque() {
        super.saque()
    }

    override fun mostrarSaldo() {
        super.mostrarSaldo()
    }

    override fun comandos() {
        super.comandos()
    }
}