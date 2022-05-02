package iCarros

class Menu {
    private val carroRenault = Renault()
    private val carroFiat = Fiat()
    private val carroHyundai = Hyundai()

     fun primeiroMenu(){
         println("---------------------------------")
         println("Escolha qual carro deseja testar:")
         println("[1] Renault")
         println("[2] Fiat")
         println("[3] Hyundai")
         print("Digite o nº da opção escolhida: ")
         when(readln().toInt()){
             1 -> carroRenault.comandosRenault()
             2 -> carroFiat.comandosFiat()
             3 -> carroHyundai.comandosHyundai()
             else -> {
                 println("Inválido")
                 primeiroMenu()
             }
         }
     }
}