package iCarros

class Hyundai: Carro("Hyundai") {

    override fun iniciarMotor(): String {
        velocidade = 5
        return "Iniciando o motor... minha velocidade está em ${velocidade}km/h"
    }

    override fun frear(): String {
        velocidade -= 2
        return "Freando... minha velocidade está em ${velocidade}km/h"
    }

    override fun acelerar(): String {
        velocidade += 15
        return "Acelerando... minha velocidade está em ${velocidade}km/h"
    }

    fun comandosHyundai(){
        comandos()
    }
}