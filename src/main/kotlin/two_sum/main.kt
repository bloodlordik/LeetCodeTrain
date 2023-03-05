package two_sum

class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        if (numbers.isEmpty()) return intArrayOf(0)
        if (numbers.count() == 2) return intArrayOf(0,1)

        numbers.forEachIndexed { indexOne, first ->

            numbers.forEachIndexed { index, i ->
                if (((i+first) == target) and (index != indexOne)) return intArrayOf(indexOne, index)
            }
        }
        return intArrayOf(0)
    }
}