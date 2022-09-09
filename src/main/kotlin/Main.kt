/*
main para ejercicio 2 del empleado
*/

fun main(){
    val empleado1= Empleado()
    var x=0

    while(x !=2) {
        empleado1.solicitar()
        empleado1.deducciones()
        empleado1.imprimir()

        print("Si desea continuar escriba 1 y si desea salir escriba 2")
        x= readLine()!!.toInt()
    }
}


/*
main para ejercicio 3 el cual se piden 3 valores
*/
/*fun main(){



        val digito1 = Ejercicio3()

        digito1.solicitud()

        digito1.verificacion()
        digito1.mayorMenor()
        digito1.impresion()
        digito1.sumar()
        digito1.restar()

    }
*/