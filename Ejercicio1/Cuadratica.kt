package Ejercicio1
class Cuadratica(var A:Int,var B:Int,var C:Int, var potencia:Double,var x1:Double,var x2:Double) {

    constructor():this(0,0,0,0.0,0.0,0.0)

    fun carga (){
        println("igrese el valor de A")
        A= readLine()!!.toInt()
        println("igrese el valor de B")
        B= readLine()!!.toInt()
        println("igrese el valor de C")
        C= readLine()!!.toInt()

    }

    fun validacionPotencia(){

        potencia= Math.pow(B.toDouble(),2.0) - (4*A*C)

        if (potencia>0){

            x1= ((-1)*B + Math.sqrt(potencia))/(2*A)
            x2= ((-1)*B - Math.sqrt(potencia))/(2*A)

        }else{
            println(" No se puede realizar la operacion por el metodo ecuacion cuadratica")
        }


    }

    fun imprimir (){
        println("La respuesta es x1=$x1, x2=$x2")

    }

}





