package biblioteca

fun main() {

    val livroRomance = GeneroRomance()
    val livroSuspense = GeneroSuspense()
    val livroTerror = GeneroTerror()

    println("   Seja bem-vinde ao sistema de cadastro de livros    ")
    println("------------------------------------------------------")
    print("Digite o ISBN do livro: ")
    val isbn = readln().toInt()

    print("Digite o nome do livro: ")
    val nomeDoLivro = readln()

    print("Digite o nome da pessoa autora do Livro $nomeDoLivro: ")
    val pessoaAutora = readln()

    println("------------------------------------------------------")
    println("Escolha qual o gênero literário de $nomeDoLivro:")
    println("[1] Romance")
    println("[2] Suspense")
    println("[3] Terror")
    print("Digite o nº da opção escolhida: ")
    when(readln().toInt()){
        1 -> {
            livroRomance.registrarLivro(isbn)
            livroRomance.registrarLivro(isbn, nomeDoLivro)
            livroRomance.registrarLivro(isbn, nomeDoLivro, "Romance")
            livroRomance.registrarLivro(isbn, nomeDoLivro, "Romance", pessoaAutora)
        }
        2 -> {
            livroSuspense.registrarLivro(isbn)
            livroSuspense.registrarLivro(isbn, nomeDoLivro)
            livroSuspense.registrarLivro(isbn, nomeDoLivro, "Suspense")
            livroSuspense.registrarLivro(isbn, nomeDoLivro, "Suspense", pessoaAutora)

        }
        3 -> {
            livroTerror.registrarLivro(isbn)
            livroTerror.registrarLivro(isbn, nomeDoLivro)
            livroTerror.registrarLivro(isbn, nomeDoLivro, "Terror")
            livroTerror.registrarLivro(isbn, nomeDoLivro, "Terror", pessoaAutora)
        }
        else -> {
            println("Inválido")
        }
    }

}