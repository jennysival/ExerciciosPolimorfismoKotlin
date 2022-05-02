package sistemaBancario

open class Conta(private var tipoDeConta: String = "", protected var saldo: Double = 0.0) {

    protected open fun deposito(){
        println("--------------- D E P Ó S I T O ----------------")
        print("Digite a quantidade de dinheiro a ser depositada: ")
        val deposito = readln().toDouble()
        saldo += deposito
        comandos()
    }

    protected open fun saque(){
        println("------------------ S A Q U E -------------------")
        print("Digite a quantidade de dinheiro a ser sacada: ")
        val saque = readln().toDouble()
        saldo -= saque
        comandos()

    }

    protected open fun mostrarSaldo(){
        println("------------------ S A L D O -------------------")
        println(tipoDeConta)
        println("R$$saldo")
        comandos()
    }

    open fun comandos(){
        println("------------------------------------------------")
        println(tipoDeConta)
        println("[1] Verificar Saldo")
        println("[2] Depositar")
        println("[3] Sacar")
        println("[4] Escolher outro tipo de conta")
        println("[5] Sair")
        print("Digite o nº da opção escolhida: ")
        when(readln().toInt()){
            1 -> mostrarSaldo()
            2 -> deposito()
            3 -> saque()
            4 -> main()
        }
    }
}