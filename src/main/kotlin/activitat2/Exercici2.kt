package activitat2

import checkInt
import java.util.Scanner


/*Fes un programa que mostri per pantalla tots els números perfectes que hi
han entre zero i un número demanat a l’usuari per pantalla.*/

fun main() {
    //Declaració del Scanner i toma d'input mitjançant la funció checkInt
    val sc = Scanner(System.`in`)
    println("Quins números són perfectes?")
    val userNum = checkInt(sc)
    showPerfects(userNum)
}

//Mostra tots els nombres perfectes entre 0 i un número
fun showPerfects(num: Int) {
    //Fa referència a l'últim número que comprovarem
    val lastNumber = 0
    //Comprovem si el número és perfecte amb la funció isPerfect i el printem
    for (i in num downTo lastNumber) {
        if (isPerfect(i)) {
            println(i)
        }
    }
}