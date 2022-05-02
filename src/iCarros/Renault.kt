package iCarros

import kotlin.system.exitProcess

class Renault: Carro("Renault") {

    override fun iniciarMotor(): String {
        velocidade = 0
        return "Iniciando o motor... minha velocidade está em ${velocidade}km/h"
    }

    override fun frear(): String {
        velocidade -= 5
        return "Freando... minha velocidade está em ${velocidade}km/h"
    }

    override fun acelerar(): String {
        velocidade += 10
        return "Acelerando... minha velocidade está em ${velocidade}km/h"
    }

    fun comandosRenault(){
        comandos()
    }

   }