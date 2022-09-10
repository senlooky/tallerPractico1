import Ejercicio04.DadoRecuadro

fun main (){
    val dado1 = Dado ()
    dado1.tirar()
    dado1.imprimir()
    dado1.unidades()
    dado1.Decenas()
    dado1.centenas()
    dado1.UnidadesDecenas()


    val dado2 = DadoRecuadro()
    dado2.tirar()
}