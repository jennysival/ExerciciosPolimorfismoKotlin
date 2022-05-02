package iCarros

import kotlin.system.exitProcess

open class Carro(private var marca: String = "") {
    private var ano = 0
    private var valor = 0.0
    private var cor = ""
    private var portas = 0
    protected var velocidade = 0

    protected open fun iniciarMotor(): String{
        return "Iniciando motor"
    }

    protected open fun frear(): String{
        return "Freando carro"
    }

    protected open fun acelerar(): String{
        return "Acelerando carro"
    }

    protected fun comandos(){
        println("-------------------------")
        println("O que deseja fazer agora?")
        println("[1] Iniciar $marca")
        println("[2] Acelerar $marca")
        println("[3] Frear $marca")
        println("[4] Testar outro carro")
        println("[5] Sair")
        print("Digite o nº da opção desejada: ")
        when(readln().toInt()){
            1 -> {
                println(iniciarMotor())
                comandos()
            }
            2 -> {
                println(acelerar())
                comandos()
            }
            3 -> {
                println(frear())
                comandos()
            }
            4 -> {
                val menu = Menu()
                menu.primeiroMenu()
            }
            5 -> exitProcess(0)
            else -> {
                println("Inválido")
                comandos()
            }
        }
    }
}