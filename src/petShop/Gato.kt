package petShop

class Gato: Animal("Gato") {
    fun cadastrarGato(){
        cadastrarAnimal()
    }

    override fun movimentar(): String {
        return "- $nomeAnimal está andando e saltando em 4 patas..."
    }

    override fun comer(): String {
        return "- $nomeAnimal está comendo whiskas sachê..."
    }

    override fun dormir(): String {
        return "- $nomeAnimal está dormindo na caixa..."
    }
}