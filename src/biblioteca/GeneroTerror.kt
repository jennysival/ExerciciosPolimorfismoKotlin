package biblioteca

//classe filha de Livro

class GeneroTerror: Livro() {
    override fun registrarLivro(ISBN: Int) {
        super.registrarLivro(ISBN)
    }

    override fun registrarLivro(ISBN: Int, nomeDoLivro: String) {
        super.registrarLivro(ISBN, nomeDoLivro)
    }

    override fun registrarLivro(ISBN: Int, nomeDoLivro: String, genero: String) {
        super.registrarLivro(ISBN, nomeDoLivro, genero)
    }

    override fun registrarLivro(ISBN: Int, nomeDoLivro: String, genero: String, pessoaAutora: String) {
        super.registrarLivro(ISBN, nomeDoLivro, genero, pessoaAutora)
    }
}