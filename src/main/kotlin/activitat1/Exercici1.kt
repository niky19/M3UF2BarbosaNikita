import java.util.Scanner

/*  1. Crea un programa que llegeixi un número per teclat. Seguidament ha de cridar
    a una funció que torni el quadrat d’aquest número. El valor retornat l’ha de
    mostrar per pantalla.   */

fun main() {
    //Declaración del Scanner y toma de input
    val sc = Scanner(System.`in`)
    val num = checkInt(sc)
    val result = squaredInt(num)
    println("The square of $num is $result")
}

//Calcula el cuadrado de un Int
fun squaredInt(num: Int): Int {
    var result: Int
    result = num * num
    return result
}

