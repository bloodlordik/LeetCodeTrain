package binary_gap

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest{
    private val testInstance = Solution()
    @Test
    fun `First test`(){
        val actual = testInstance.binaryGap(22)
        assertEquals(2,actual)

        /*
            The first adjacent pair of 1's is "10110" with a distance of 2.
            The second adjacent pair of 1's is "10110" with a distance of 1.
            The answer is the largest of these two distances, which is 2.
            Note that "10110" is not a valid pair since there is a 1 separating the two 1's underlined.
         */
    }
    @Test
    fun `Second test`(){
        val actual = testInstance.binaryGap(8)
        assertEquals(0,actual)

        /*
            8 in binary is "1000".
            There are not any adjacent pairs of 1's in the binary representation of 8, so we return 0.
         */
    }

    @Test
    fun `Third test`(){
        val actual = testInstance.binaryGap(5)
        assertEquals(2,actual)

        /*
            5 in binary is "101".
         */
    }

}