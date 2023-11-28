package activitat4

import checkInt
import java.util.*

/*
Escriu una funció anomenada “IncrementarNumero” que donat un número i
una quantitat, retorni el número que se li ha passat com a paràmetre en la
quantitat indicada.
 */

fun main() {
    val sc = Scanner(System.`in`)
    println("Benvingut al programa per incrementar un número")
    val userNum = checkInt(sc)
    val userIncrement = checkInt(sc)
    println("Resultat: " + incrementarNumero(userNum, userIncrement))
    // println(incrementarNumero(1, 10))
}

//Rep un número i una quantitat i retorna el número incrementat en la quantitat indicada
fun incrementarNumero(num: Int, increment: Int): Int {
    var num = num
    for (i in 1..increment) {
        num++
    }
    return num
}