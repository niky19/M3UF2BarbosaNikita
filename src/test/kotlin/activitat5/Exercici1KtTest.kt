package activitat5

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Exercici1Test {

    @Test
    fun mitjanaTest() {
        val result = mitjana(arrayOf(1f, 2f, 3f, 4f, 5f))
        assertEquals(3f, result)
    }

    @Test
    fun `calculates average of negative numbers`() {
        val result = mitjana(arrayOf(-1f, -2f, -3f, -4f, -5f))
        assertEquals(-3f, result)
    }

    @Test
    fun `calculates average of mixed positive and negative numbers`() {
        val result = mitjana(arrayOf(-1f, 2f, -3f, 4f, -5f))
        assertEquals(-0.6f, result)
    }

    @Test
    fun `calculates average of single number`() {
        val result = mitjana(arrayOf(5f))
        assertEquals(5f, result)
    }

    @Test
    fun `returns zero for empty array`() {
        val result = mitjana(arrayOf())
        assertEquals(0f, result)
    }
}