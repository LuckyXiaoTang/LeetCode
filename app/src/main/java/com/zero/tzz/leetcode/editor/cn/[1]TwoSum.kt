package com.zero.tzz.leetcode.editor.cn

// 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
// 因为 nums[0] + nums[1] = 2 + 7 = 9
// 所以返回 [0, 1]
// 
// Related Topics 数组 哈希表

class TwoSum {


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            if (nums.isNotEmpty()) {
                val intArray = IntArray(2)
                val size = nums.size
                for (i in 0 until size) {
                    for (j in i + 1 until size) {
                        if (nums[i] + nums[j] == target) {
                            intArray[0] = i
                            intArray[1] = j
                            return intArray
                        }
                    }
                }
            }
            return intArrayOf()
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

fun main() {
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    val result = TwoSum.Solution().twoSum(intArray, 6)
    println(result.toList().toString())
}