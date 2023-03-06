package transpose_matrix


import kotlin.test.Test
import kotlin.test.assertContentEquals

class SolutionTest{
    private val testInstance = Solution()

    @Test
    fun `Simple test`(){
        val input = arrayOf(intArrayOf(1,2,3),intArrayOf(4,5,6),intArrayOf(7,8,9))
        val output = arrayOf(intArrayOf(1,2,3),intArrayOf(4,5,6),intArrayOf(7,8,9))

        val preActual = testInstance.transpose(input)
        val actual = testInstance.transpose(preActual)
        output.forEachIndexed { index, ints ->
            assertContentEquals(ints, actual[index])
        }
    }

    @Test
    fun `First simple test`(){
        val input = arrayOf(intArrayOf(1,2,3),intArrayOf(4,5,6),intArrayOf(7,8,9))
        val output = arrayOf(intArrayOf(1,4,7),intArrayOf(2,5,8),intArrayOf(3,6,9))

        val actual = testInstance.transpose(input)
        output.forEachIndexed { index, ints ->
            assertContentEquals(ints, actual[index])
        }
    }
    @Test
    fun `Second simple test`(){
        val input = arrayOf(intArrayOf(1,2,3),intArrayOf(4,5,6))
        val output = arrayOf(intArrayOf(1,4),intArrayOf(2,5),intArrayOf(3,6))

        val actual = testInstance.transpose(input)
        output.forEachIndexed { index, ints ->
            assertContentEquals(ints, actual[index])
        }
    }
}