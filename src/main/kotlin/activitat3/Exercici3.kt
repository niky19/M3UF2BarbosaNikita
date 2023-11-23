package activitat3

import java.util.*

/* 3. Escriu una funció anomenada “LlegirNumeroEnter” que torni un número enter
que hagi introduït l’usuari per teclat. */
fun main() {
    val sc = Scanner(System.`in`)
    llegirNumeroEnter(sc)
}

//Llegeix un número enter i el retorna
fun llegirNumeroEnter(sc: Scanner): Int {
    while (true) {
        println("Enter an int:")
        if (sc.hasNextInt()) {
            return sc.nextInt()
        } else {
            println("Wrong input, try again.")
            sc.nextLine()
        }
    }
}