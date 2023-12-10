package activitat5

/*
Implementa una funció que calculi la mitjana dels elements d’un vector de
floats que se li passa com a paràmetre. La funció haurà de tenir la següent
capçalera:
 */

fun main() {
    mitjana(arrayOf(1f, 2f, 3f, 4f, 5f))
}

fun mitjana(nums: Array<Float>): Float {
    var sum = 0f
    for (i in nums) {
        sum += i
    }
    return sum / nums.size
}