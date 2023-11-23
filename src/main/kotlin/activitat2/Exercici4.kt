package activitat2

import checkInt
import java.util.Scanner

/*Implementa una funció que rebi com a arguments dos enters que representen
un mes i un any, i torni com a resultat el número de dies d’aquest mes. Si el
mes és febrer s’ha de comprovar si és any de traspàs.*/

fun main() {
    //Declaració del Scanner i toma d'input mitjançant la funció checkInt
    val sc = Scanner(System.`in`)
    //TODO("set userMonth max value to 12")
    val userMonth = checkInt(sc)
    val userYear = checkInt(sc)
    println(getDayFromMonthAndYear(userMonth, userYear))
}


fun getDayFromMonthAndYear(month : Int, year : Int): Int {
    //Guardem els mesos amb 31 dies i els mesos amb 30 dies en llistes
    val thirtiones = listOf(1,3,5,7,8,10,12)
    val thirties = listOf(4,6,9,11)

    var result = 0
    //Comprovem si el número de més introduït és a la llista de mesos amb 31 dies
    if (thirtiones.contains(month)) {
        result = 31
    }

    //Comprovem si el número de més introduït és a la llista de mesos amb 30 dies
    if (thirties.contains(month)){
        result = 30
    }

    //Comprovem si el número de més introduït és febrer
    if (year % 4 == 0){result = 29}
        else result = 28

    return result
}