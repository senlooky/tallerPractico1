class Ejercicio3 {
    var val1: Int = 0
    var val2: Int = 0
    var val3: Int = 0
    var mayor: Int = 0
    var menor: Int = 0


    fun solicitud() {

        println("Ingrese el primer valor")
        val1 = readln()!!.toInt()
        println("Ingrese el segundo valor")
        val2 = readln()!!.toInt()
        println("Ingrese el tercer valor")
        val3 = readln()!!.toInt()
    }

    fun verificacion() {
        var igual = true

        while (igual) {
            if (val1 === 0 || val2 === 0 || val3 === 0) {
                igual = true
                println("uno o varios de los valores ingresados son iguales a cero, ingrese los numeros nuevamente")
                println(solicitud())

            } else if (val1 < 0 || val2 < 0 || val3 < 0) {
                igual = true
                println("uno o varios de los valores ingresados son negativos, ingrese los numeros nuevamente")
                println(solicitud())

            } else if (val1 == val2 || val1 == val3 || val2 == val3) {
                igual = true
                println("algunos valores son iguales entre si, ingrese los numeros nuevamente")
                println(solicitud())

            } else {
                igual = false

            }
        }


    }
    //if (!(val1 <= 0 && val2 <= 0 && val3 <= 0) && !(val1 == val2 || val1 == val3 || val2 == val3)) {

    /*  }else{
            println("******************************************")
            println("Debido a que al menos uno de los valores no cumple con las condiciones:")
            println("No ser igual a cero, no ser un numero negativo o ser numeros iguales")
            println("Por favor, dijite de nuevo los valores tomando en cuenta las condiciones")
            println(solicitud());
        };*/

    fun mayorMenor() {
        mayor = if (val1 > val2 && val1 > val3) val1 else if (val2 > val3) val2 else val3
        menor = if (val1 < val2 && val1 < val3) val1 else if (val2 < val3) val2 else val3

    }

    fun sumar() {
        if (menor > 5) {
            val suma = mayor + 10
            println("Debido a que el numero menor es mayor a 5, al valor mayor le sumamos 10 teniendo como resultado $suma")
        } else
            println()
    }

    fun restar() {
        if (mayor < 100) {
            val resta = menor - 5
            println("Ya que el valor mayor es menor a 100, se le restan 5 al valor menor teniendo como resultado $resta")
        } else
            println()
    }

    fun impresion() {
        println("Los valores ingresados son $val1, $val2 y $val3")
        println("El valor mayor es $mayor y el valor menor es $menor")
    }
}

