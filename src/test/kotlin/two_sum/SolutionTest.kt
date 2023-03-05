package two_sum



import kotlin.test.Test
import kotlin.test.assertContentEquals

class SolutionTest{
    private val instance = Solution()

    @Test
    fun `first simple test`(){
        val input = intArrayOf(2,7,11,15)
        val target = 9
        val expect = intArrayOf(0, 1)

        val actual = instance.twoSum(numbers = input, target = target)
        assertContentEquals(expect, actual)
    }
    @Test
    fun `first second test`(){
        val input = intArrayOf(3,2,4)
        val target = 6
        val expect = intArrayOf(1,2)

        val actual = instance.twoSum(numbers = input, target = target)
        assertContentEquals(expect, actual)

    }
    @Test
    fun `third simple test`(){
        val input = intArrayOf(3,3)
        val target = 6
        val expect = intArrayOf(0, 1)

        val actual = instance.twoSum(numbers = input, target = target)
        assertContentEquals(expect, actual)

    }
}