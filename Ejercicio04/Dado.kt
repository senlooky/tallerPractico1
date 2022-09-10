package Ejercicio04

open class Dado(var valor:Int) {

    constructor():this(0)

    open fun tirar(){
        valor = ((Math.random() * 100) + 1).toInt()

    }

    fun unidades(){

        if (valor>0 && valor<=9){


            when (valor) {

                1 -> print("uno")
                2 -> print("dos")
                3 -> print("tres")
                4 -> print("cuatro")
                5 -> print("cinco")
                6 -> print("seis")
                7 -> print("siete")
                8 -> print("ocho")
                9 -> print("Nueve")

            }
        }
    }

    fun Decenas () {

        if (valor % 10 == 0) {


            when (valor) {

                10 -> print("Diez")
                20 -> print("veinte")
                30 -> print("treinta")
                40 -> print("cuarenta")
                50 -> print("cincuenta")
                60 -> print("sesenta")
                70 -> print("setenta")
                80 -> print("ochenta")
                90 -> print("Noventa")
            }
        }
    }

    fun UnidadesDecenas() {
        if (valor / 10 == 1) {
            when (valor) {

                11 -> print("once")
                12 -> print("Doce")
                13 -> print("trece")
                14 -> print("catorce")
                15 -> print("quince")
                16 -> print("Dieciseis")
                17 -> print("Diecisiete")
                18 -> print("Dieciocho")
                19 -> print("Diecinueve")

            }
        }
    }

    fun centenas (){

        if (valor==100){
            when(valor){
                100 -> print("Cien") }
        }
    }

    fun imprimir(){
        println("valor del dado $valor")
    }
}

fun main (){
    val prueba = Dado ()
    prueba.tirar()
    prueba.imprimir()
    prueba.unidades()
    prueba.Decenas()
    prueba.centenas()
    prueba.UnidadesDecenas()


  val prueba2 = DadoRecuadro()
    prueba2.tirar()
}