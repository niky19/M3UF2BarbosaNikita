import java.util.Scanner


/*  2. Crea un programa que llegeixi dos números per teclat. Seguidament ha de
    cridar a una funció que compari els números i que torni un booleà indicant si
    el primer és major que el segon. El programa ha de mostrar per pantalla si el
    primer és major que el segon o no.  */

fun main() {
    //Declaración del Scanner y toma de inputs
    val sc = Scanner(System.`in`)
    val num1 = checkInt(sc)
    val num2 = checkInt(sc)
    val result = isBigger(num1, num2)
    println("Is the first int bigger? $result")

}

//Compara dos Int y devuelve True si el primero es más grande que el segundo
fun isBigger(num1 : Int, num2 : Int): Boolean {
    return num1 > num2
}

