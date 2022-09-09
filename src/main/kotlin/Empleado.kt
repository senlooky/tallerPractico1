class Empleado {
    var nombre:String =""
    var base:Double = 0.0
    var dedu:Double = 0.0
    var neto:Double =0.0


   fun solicitar(){
        println("Ingrese el nombre del empleado")
       nombre= readln()!!.toString()
       println("Ingrese el salario base del empleado")
       base= readln()!!.toDouble()

   }

    fun deducciones() {
        if (base < 500) {
            dedu = base * 0.07
            neto = base - dedu

        }else
             if (base >= 500)
            dedu = base * 0.12
            neto = base - dedu

    }
    fun imprimir(){

        println("El empleado $nombre tiene un salario base de $base")
        println("****************************************************")
        println("El salario neto de $nombre es de $neto")

    }
}
