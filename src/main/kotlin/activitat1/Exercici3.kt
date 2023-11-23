import java.util.*
import kotlin.math.PI
import kotlin.math.pow

/*  3. Crea un programa que llegeixi el valor del radi d’una esfera. Seguidament ha
    de calcular el seu volum i mostrar-lo per pantalla.
    Recorda que el volum d’una esfera es calcula com 4/3 π r3   */


fun main() {
    //Declaración del Scanner y toma de input
    val sc  = Scanner(System.`in`)
    val radius = checkDouble(sc)
    val result = sphereVolume(radius)
    print(result)

}

//Calcula el volumen de una esfera
fun sphereVolume(radius: Double) : Double {
    var volume : Double
    volume = (4/3) * PI * radius.pow(3)
    return volume
}