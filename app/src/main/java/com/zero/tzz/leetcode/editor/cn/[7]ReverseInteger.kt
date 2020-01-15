package com.zero.tzz.leetcode.editor.cn

//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//
// 示例 1: 
//
// 输入: 123
//输出: 321
// 
//
// 示例 2: 
//
// 输入: -123
//输出: -321
// 
//
// 示例 3: 
//
// 输入: 120
//输出: 21
// 
//
// 注意: 
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31, 2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
// Related Topics 数学


class ReverseInteger {
    //    方法：弹出和推入数字 & 溢出前进行检查
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun reverse(x: Int): Int {
            var tempX = x
            var result = 0
            var pop = 0
            while (tempX != 0) {
                pop = tempX % 10
                tempX /= 10
                // 溢出问题
                if (result > Int.MAX_VALUE / 10 || (result == Int.MAX_VALUE / 10 && pop > 7)) {
                    return 0
                }
                if (result < Int.MIN_VALUE / 10 || (result == Int.MIN_VALUE / 10 && pop < -8)) {
                    return 0
                }
                result = result * 10 + pop
            }
            return result
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

fun main() {
    val solution = ReverseInteger.Solution()
    println(solution.reverse(-321))
}