package activitat6


data class Punt(
    var x: Float,
    var y: Float,
) {
    fun mostrarPunt() {
        print("(${String.format("%.6f", x)},${String.format("%.6f", y)})")
    }


    /*
    1.2. L’operació de translació permet desplaçar un punt de coordenades (x, y) a
    (x+a, y+b), sent el desplaçament (a, b) un altre punt. Implementa un
    procediment que rebi dos paràmetres del tipus Punt i modifiqui el primer de
    forma que es traslladi el que indica el desplaçament. Recorda que els
    procediments no han de retornar cap valor.
     */
    fun translacio(punt1: Punt, punt2: Punt) {
        punt1.x += punt2.x
        punt2.y += punt2.y
    }

    fun main() {
        val punt = Punt(2.0F, 0.2F)

        punt.mostrarPunt()
    }
}
