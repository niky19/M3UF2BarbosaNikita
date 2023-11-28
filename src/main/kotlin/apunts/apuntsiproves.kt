package apunts

import activitat3.llegirNumeroEnter
import java.util.*


/*
Clean code M03:
 - Documentació
 - Interactuar amb l'usuari: mostrar missatges, demanar input, etc.
 - Funcions consices i fàcils de llegir, només fan una cosa
 - Desenvolupar funcions que ja existeixen a Kotlin (ex. .reversed() de A2-E3)
 - Les funcions han de retornar una variable previament declarada.
 */

//Funció: fa una tasca concreta i retorna un valor
//Funció sense paràmetres: no té paràmetres, però retorna un valor
//Procediment: és una funció que pot tenir paràmetres, però no retorna res.


/*
Debug: Clic derecho para condiciones
hacer un braek point (cuando x vale a y y vale b cuanto valdra z? justificar respuesta y captura de pantalla
(añadir breakpoints)

 */

fun main() {
    var x:Int=0  // Variable local a la funció main
    while (x <= 10) {
        println("El sumatori de 1 a $x és ${sumatori(1,x)}")
        x++
    }
}
fun sumatori(inici:Int, final:Int) : Int {
    var resultat:Int = 0
    var x:Int = inici	//Variable local a la funció sumatori
    while (x <= final) {
        resultat +=x
        x++
    }
    return resultat
}
