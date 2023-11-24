package activitat3

import java.util.*

/* 3. Escriu una funció anomenada “LlegirNumeroEnter” que torni un número enter
que hagi introduït l’usuari per teclat. */
fun main() {
    //Fem un print per veure el return de la funció
    println(llegirNumeroEnter())
}

//Llegeix un número enter i el retorna
fun llegirNumeroEnter(): Int {
    //Declaració del Scanner a dins de la funció per tal de no haver de passar-lo com a paràmetre
    val sc = Scanner(System.`in`)
    var validInput = false
    var userInput = 0
    //Mentre l'input no sigui un int, demanem un nou input
    do {
        println("Escriu un enter:")
        if (sc.hasNextInt()) {
            userInput = sc.nextInt()
            validInput = true
        } else {
            println("No és un enter. Torna-ho a provar:")
            sc.nextLine()
        }
    } while (!validInput)
    return userInput
}