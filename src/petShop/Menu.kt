package petShop

import kotlin.system.exitProcess

class Menu {

    val cachorro = Cachorro()
    val gato = Gato()
    val peixe = Peixe()

    fun menu(){
        println("Escolha a espécie a ser cadastrada: ")
        println("[1] Cachorro")
        println("[2] Gato")
        println("[3] Peixe")
        print("Digite a opção desejada: ")
        when(readln().toInt()){
            1 -> {
                cachorro.cadastrarCachorro()
                println(cachorro.movimentar())
                println(cachorro.comer())
                println(cachorro.dormir())
                segundoMenu()
            }
            2 -> {
                gato.cadastrarGato()
                println(gato.movimentar())
                println(gato.comer())
                println(gato.dormir())
                segundoMenu()
            }
            3 -> {
                peixe.cadastrarPeixe()
                println(peixe.movimentar())
                println(peixe.comer())
                println(peixe.dormir())
                segundoMenu()
            }
            else -> {
                println("Inválido")
                menu()
            }
        }
    }

    fun segundoMenu(){
        println("--------------------------------")
        println("Deseja cadastrar mais um animal?")
        println("[Digite Sim ou Não]")
        when(readln().uppercase()){
            "SIM" -> menu()
            "NÃO" -> exitProcess(0)
            "NAO" -> exitProcess(0)
            else ->{
                println("Inválido")
                segundoMenu()
            }
        }
    }
}