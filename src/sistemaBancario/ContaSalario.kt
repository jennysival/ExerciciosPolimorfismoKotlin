package sistemaBancario

class ContaSalario: Conta("Conta Salário", 1212.0) {

    override fun deposito() {
        println("------------------------------------------------")
        println("O Depósito será feito por: ")
        println("[1] EMPREGADOR")
        println("[2] TITULAR")
        println("[3] OUTRO")
        print("Digite o nº da opção escolhida: ")
        when(readln().toInt()){
            1 -> {
                println("--------------- D E P Ó S I T O ----------------")
                print("Digite a quantidade de dinheiro a ser depositada: ")
                val deposito = readln().toDouble()
                saldo += deposito
                comandos()
            }
            2 -> {
                println("Conta Salário só pode receber depósito do empregador")
                comandos()
            }
        }
    }

    override fun saque() {
        println("------------------ S A Q U E -------------------")
        print("Digite a quantidade de dinheiro a ser sacada: ")
        val saque = readln().toDouble()
        val verificasaque = saldo - saque

        if(verificasaque < 0.0){
            println("Saldo insuficiente")
            comandos()
        }
        else{
            saldo -= saque
            comandos()
        }
    }

    override fun mostrarSaldo() {
        super.mostrarSaldo()
    }

    override fun comandos() {
        super.comandos()
    }

}