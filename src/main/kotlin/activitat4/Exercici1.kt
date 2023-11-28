package activitat4

import checkInt
import java.util.*
import kotlin.math.abs
import kotlin.math.sqrt

/*
1. Escriu una funció anomenada “AreaTriangle” que rebi la longitud dels tres
costats d’un triangle i torni l’àrea si els costats poden formar un triangle o -1 si
no el poden formar.
Per a determinar si tres segments poden formar un triangle, s’ha de verificar que
compleixen la desigualtat triangular: si a, b i c són les longituds dels costats d’un
triangle, llavors es compleix que ((abs(a-c) < b) i (b < (a+c))). L’àrea es pot calcular a
partir de la fórmula A= sqrt(s(s-a)(s-b)(s-c)), on a, b i c són els costats i s= (a+b+c)/2
és el semiperímetre.
 */

fun main() {
    //Declarem Scanner i tomem inputs amb control d'errors
    val sc = Scanner(System.`in`)
    println("Benvingut al programa per calcular l'àrea d'un triangle")
    val userA = checkInt(sc)
    val userB = checkInt(sc)
    val userC = checkInt(sc)
    areaTriangle(userA, userB, userC)
}

fun areaTriangle(a: Int, b: Int, c: Int): Double {
    var area: Double = 0.0
    //Comprovem desiqualtat triangular
    if ((abs(a - c) < b) && (b < (a + c))) {
        //s fa referencia a semiperímetre
        val s = (a + b + c) / 2
        //Fórmula de l'àrea
        area = sqrt((s * (s - a) * (s - b) * (s - c)).toDouble())
        println("Area: $area")
    } else {
        //Si no es compleix la desigualtat triangular, retorna -1
        area = -1.0
        println(area)
    }
    return area
}