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
fun main() {
    val sc = Scanner(System.`in`)
    llegirNumeroEnter()
}