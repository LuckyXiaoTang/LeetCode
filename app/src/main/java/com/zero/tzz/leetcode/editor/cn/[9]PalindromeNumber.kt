package com.zero.tzz.leetcode.editor.cn

//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//
// 示例 1: 
//
// 输入: 121
//输出: true
// 
//
// 示例 2: 
//
// 输入: -121
//输出: false
//解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
// 
//
// 示例 3: 
//
// 输入: 10
//输出: false
//解释: 从右向左读, 为 01 。因此它不是一个回文数。
// 
//
// 进阶: 
//
// 你能不将整数转为字符串来解决这个问题吗？ 
// Related Topics 数学


class PalindromeNumber {


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun isPalindrome(x: Int): Boolean {
            // 方法一
            /*if (x <= 0 || x % 10 == 0) return false
            var tempX = x
            var result = 0
            var pop = 0
            while (tempX != 0) {
                pop = tempX % 10
                tempX /= 10
                result = result * 10 + pop
            }
            return result == x*/

            // 方法二(优化方法一 只比较一般)
            var tempX = x
            var revertedNumber = 0
            while (tempX > revertedNumber) {
                revertedNumber = revertedNumber * 10 + tempX % 10
                tempX /= 10
            }
            // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
            // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
            // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
            return revertedNumber == tempX || revertedNumber == tempX / 10


            // 方法三
            /*val str = x.toString()
            val reverse = str.reversed()
            return str == reverse*/
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

fun main() {
    val solution = PalindromeNumber.Solution()
    println(solution.isPalindrome(100))
}