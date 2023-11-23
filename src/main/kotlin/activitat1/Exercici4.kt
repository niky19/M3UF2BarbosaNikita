import java.util.Scanner

/*  4. Crea un programa que demani dos números per pantalla, seguidament
    presenti el menú i demani quina operació es vol fer (Suma, Resta, Multiplicació
    o Divisió) i, a continuació, faci l’operació i la mostri per pantalla.  */

fun main() {
    //Declaración del Scanner y toma de inputs
    val sc = Scanner(System.`in`)
    println("Escriu 2 numeros")
    val userNum1 = sc.nextDouble()
    val userNum2 = sc.nextDouble()
    //Mostrar menú y tomar input de opciones para la calculadora
    showMenu()
    val userChoice = sc.nextInt()
    simpleCalculator(userNum1, userNum2, userChoice)
}


//Muestra un menú con las opciones de la calculadora
fun showMenu() {
    print(
        """
        Escull quina operació vols fer:
        1. Suma
        2. Resta
        3. Multiplicació
        4. Divisió
        
    """.trimIndent()
    )
}

//Llama a la función correspondiente según la opción elegida por el usuario
fun simpleCalculator(num1: Double, num2: Double, userChoice: Int) {
    when (userChoice) {
        1 -> println("$num1 + $num2 = ${add(num1, num2)}")
        2 -> println("$num1 - $num2 = ${subtract(num1, num2)}")
        3 -> println("$num1 * $num2 = ${multiplication(num1, num2)}")
        4 -> println("$num1 / $num2 = ${division(num1, num2)}")
    }
}

//Suma de dos números
fun add(num1: Double, num2: Double): Double {
    return num1 + num2
}

//Resta de dos números
fun subtract(num1: Double, num2: Double): Double {
    return num1 - num2
}

//Multiplicación de dos números
fun multiplication(num1: Double, num2: Double): Double {
    return num1 * num2
}

//División de dos números
fun division(num1: Double, num2: Double): Double {
    return num1 / num2
}






