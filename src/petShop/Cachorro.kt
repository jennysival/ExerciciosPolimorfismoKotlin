package petShop

class Cachorro: Animal("Cachorro") {

    fun cadastrarCachorro(){
        cadastrarAnimal()
    }

    override fun movimentar(): String {
        return "- $nomeAnimal está andando em 4 patas..."
    }

    override fun comer(): String {
        return "- $nomeAnimal está Comendo bife..."
    }

    override fun dormir(): String {
        return "- $nomeAnimal está dormindo na cama da Jéssica..."
    }

}