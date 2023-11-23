package activitat2

import checkInt
import java.util.Scanner

/*1. Implementa una funció que retorni si un número és o no perfecte. Si el número
és perfecte tornarà cert, sinó tornarà fals. Un número és perfecte si és igual a
la suma de tots els seus divisors, excepte ell mateix. */

fun main() {

    //Declaració del Scanner i toma d'input mitjançant la funció checkInt
    val sc = Scanner(System.`in`)
    println("Vols saber si un número es perfecte?")
    val userNum = checkInt(sc)

    //Printa fals si no és perfecte i true si ho és
    println("És $userNum perfecte? " + isPerfect(userNum))
}

//Retorna true si un número és perfecte i fals i no és
fun isPerfect(num : Int): Boolean{

    //Suma tots els divisors del número
    var sum = 0

    //Recorre tots els números entre 1 i el número
    for (i in 1..< num) {
        //Si el número és divisible per i, afegeix i a la suma
        if (num % i == 0) {
            sum += i
        }
    }

    //Compara la suma amb el número
    val isNumEqualToSum = num == sum
    return isNumEqualToSum
}