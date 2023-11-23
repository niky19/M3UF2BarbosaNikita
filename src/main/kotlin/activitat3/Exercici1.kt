package activitat3

/*
1. Escriu un procediment anomenat “MostrarError” que rebi un missatge i que
mostri per pantalla el contingut del missatge rebut precedit de la paraula
“ERROR: “ i tot amb lletres vermelles.
 */

fun main() {
    printRedError("Lorem Ipsum")
}

fun printRedError(msg: String) {
    // Everything after this is in red
    val red = "\u001b[31m"
    // Resets previous color codes
    val reset = "\u001b[0m"
    val error = "ERROR: "
    println(red + error + msg + reset)
}