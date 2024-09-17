class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var smallerIndex: Int = 0
        var greaterIndex: Int = numbers.size - 1
        val intArray = IntArray(2)

        while (smallerIndex < greaterIndex) {
            val sum = numbers[smallerIndex] + numbers[greaterIndex]

            if (sum == target) {
                intArray[0] = smallerIndex + 1
                intArray[1] = greaterIndex + 1
                return intArray
            } else if (sum > target) {
                greaterIndex--
            } else {
                smallerIndex++
            }
        }
        return intArray
    }
}
