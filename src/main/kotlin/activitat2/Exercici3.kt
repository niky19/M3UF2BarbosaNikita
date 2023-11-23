package activitat2

import checkInt
import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val userNum = checkInt(sc)
    isCapicua(userNum)
}

fun isCapicua(num: Int): Boolean {
    //Declarem la variable que retornarem
    var result = true

    //Convertim el numero a string per poder accedir als seus caracters. Això és perquè els strings actuen com a una llista de caràcters
    val stringNum = num.toString()

    //Primer comprovem el primer i l'últim caràcter, després el segon i el penúltim, etc.
    var start = 0
    var end = stringNum.length - 1

    //Si el primer i l'últim caràcter són iguals, comprovem el segon i el penúltim, etc.
    while (start < end && result) {
        if (stringNum[start] != stringNum[end]) {
            result = false
        }
        start++
        end--
    }
    return result
}

//Verifica si un enter és capicua mitjançant la funció reversed
fun isCapicuaByReversed(num: Int) {
    val stringNum = num.toString()
    if (stringNum == stringNum.reversed()) {
        println("Sí, és capicua")
    } else
        println("No, no és capicua")
}