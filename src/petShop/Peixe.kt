package petShop

class Peixe: Animal("Peixe") {

    fun cadastrarPeixe(){
        cadastrarAnimal()
    }

    override fun movimentar(): String {
        return "- $nomeAnimal está nadando..."
    }

    override fun comer(): String {
        return "- $nomeAnimal está comendo ração molhada..."
    }

    override fun dormir(): String {
        return "- $nomeAnimal está dormindo de olho aberto..."
    }
}