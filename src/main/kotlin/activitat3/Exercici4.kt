package activitat3

/*4. Escriu un procediment anomenat “Pausa” que s’esperi a que l’usuari premi
una única tecla. Aquesta tecla no pot ser la tecla Intro i ha de funcionar amb la
consola, és a dir: sense fer servir cap entorn gràfic.*/

/*
No es pot fer perquè no es pot detectar una tecla individual sense un entorn gràfic.
 */



//Retorna la tecla que ha premut l'usuari. No detecta tecles especials perquè es necessita un entorn gràfic.
/*fun pausa(){
    //Demana a l'usuari que premi una tecla
    println("Prem qualsevol tecla:")
    //Llegeix la tecla que ha premut l'usuari amb readln. No fem servir Scanner perquè no detecta tecles individuals.
    val input = readlnOrNull()
    while (input == null) {
        if (input != null) {
            println("Has premut la tecla $input")
        } else {
            println("No has premut cap tecla. torna a intentar-ho.")
        }
    }
}*/