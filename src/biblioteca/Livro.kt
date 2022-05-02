package biblioteca

//Essa é uma classe mãe

open class Livro(private var genero: String = "",
                 private var nomeDoLivro: String = "",
                 private var ISBN: Int = 0,
                 private var pessoaAutora: String = "")
{
    open fun registrarLivro(ISBN: Int){
        println("-------------------------------------------------------------------")
        println("O livro foi registrado com o ISBN: $ISBN")
    }

    open fun registrarLivro(ISBN: Int, nomeDoLivro: String){
        println("-------------------------------------------------------------------")
        println("O livro foi registrado com o ISBN $ISBN, e o nome $nomeDoLivro")
    }

    open fun registrarLivro(ISBN: Int, nomeDoLivro: String, genero: String){
        println("-------------------------------------------------------------------")
        println("O livro foi registrado com o ISBN $ISBN, o nome $nomeDoLivro, e o gênero $genero")
    }

    open fun registrarLivro(ISBN: Int, nomeDoLivro: String, genero: String, pessoaAutora: String){
        println("-------------------------------------------------------------------")
        println("O livro foi registrado com todos os atributos!")
        println("ISBN: $ISBN")
        println("Gênero: $genero")
        println("Nome: $nomeDoLivro")
        println("Pessoa Autora: $pessoaAutora")
        println("-------------------------------------------------------------------")
    }


}