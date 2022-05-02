package iCarros
class Fiat: Carro("Fiat") {

    override fun iniciarMotor(): String {
        velocidade = 3
        return "Iniciando o motor... minha velocidade está em ${velocidade}km/h"
    }

    override fun frear(): String {
        velocidade -= 6
        return "Freando... minha velocidade está em ${velocidade}km/h"
    }

    override fun acelerar(): String {
        velocidade += 12
        return "Acelerando... minha velocidade está em ${velocidade}km/h"
    }

    fun comandosFiat(){
        comandos()
    }
}