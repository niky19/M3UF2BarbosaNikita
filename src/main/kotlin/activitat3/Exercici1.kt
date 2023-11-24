package activitat3

/*
1. Escriu un procediment anomenat “MostrarError” que rebi un missatge i que
mostri per pantalla el contingut del missatge rebut precedit de la paraula
“ERROR: “ i tot amb lletres vermelles.
 */

fun main() {
    printRedError("Error Successful!")
}

//Fa servir codi ANSI per printar el missatge rebut en vermell.
//Crèdits a https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
fun printRedError(msg: String) {
    // El que vagi després d'aquesta variable es printarà en vermell
    val red = "\u001b[31m"
    //El que vagi després d'aquesta variable ja no es printarà en vermell
    val reset = "\u001b[0m"
    val errorMessage = "ERROR: "
    println(red + errorMessage + msg + reset)
}