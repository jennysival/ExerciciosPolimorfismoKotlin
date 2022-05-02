package petShop

open class Animal(private var tipoAnimal: String = "",
                  protected var nomeAnimal: String = "",
                  private var racaAnimal: String = "",
                  private var tutorAnimal: String = "") {

    protected fun cadastrarAnimal(){
        print("Digite seu nome: ")
        tutorAnimal = readln()
        print("Digite o nome de seu $tipoAnimal: ")
        nomeAnimal = readln()
        print("Digite a raça de $nomeAnimal: ")
        racaAnimal = readln()
        println("----------------------------------")
    }

    open fun movimentar(): String{
        return "$nomeAnimal está se movimentando"
    }

    open fun comer(): String{
        return "$nomeAnimal está comendo"
    }

    open fun dormir(): String{
        return "$nomeAnimal está dormindo"
    }
}