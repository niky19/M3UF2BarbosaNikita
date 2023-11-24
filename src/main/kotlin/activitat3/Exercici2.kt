package activitat3

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/* Escriu una funció anomenada “Avui” que torni la data d’avui formatada a
DD/MM/YYYY. */

fun main() {
    avui()
}

//Canvia la data d'avui al format DD/MM/YYYY
fun avui() : Unit{
    //Es pren la data d'avui
    val date = LocalDateTime.now()
    //S'indica el format que volem que tingui la data amb la funció de kotlin DateTimeFormatter i ofPattern
    val dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    //S'aplica el format a la data d'avui
    val formattedDate = date.format(dateFormatter)
    val dateResult = "La data d'avui és $formattedDate"
    return println(dateResult)
}