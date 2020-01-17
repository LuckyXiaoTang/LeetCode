package com.zero.tzz.leetcode.editor.cn

//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 示例 1: 
//
// 输入: [1,2,3]
//输出: [1,2,4]
//解释: 输入数组表示数字 123。
// 
//
// 示例 2: 
//
// 输入: [4,3,2,1]
//输出: [4,3,2,2]
//解释: 输入数组表示数字 4321。
// 
// Related Topics 数组


class PlusOne {


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun plusOne(digits: IntArray): IntArray {
            // 需要进位
            for (i in digits.size - 1 downTo 0) {
                println("i = $i")
                if (digits[i] == 9) {
                    digits[i] = 0
                    if (i == 0) {
                        val intArray = IntArray(digits.size + 1)
                        intArray[0] = 1
                        return intArray
                    }
                    continue
                } else {
                    digits[i] = digits[i] + 1
                    break
                }
            }
            return digits
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

fun main() {
    val solution = PlusOne.Solution()
    println(solution.plusOne(intArrayOf(4, 3, 2, 1)).toList())
    println(solution.plusOne(intArrayOf(1, 2, 3)).toList())
    println(solution.plusOne(intArrayOf(1, 2, 9)).toList())
    println(solution.plusOne(intArrayOf(9, 9, 9)).toList())
}