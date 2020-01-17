package com.zero.tzz.leetcode.editor.cn

//「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：
//
// 1.     1
//2.     11
//3.     21
//4.     1211
//5.     111221
// 
//
// 1 被读作 "one 1" ("一个一") , 即 11。 
//11 被读作 "two 1s" ("两个一"）, 即 21。 
//21 被读作 "one 2", "one 1" （"一个二" , "一个一") , 即 1211。 
//
// 给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。 
//
// 注意：整数序列中的每一项将表示为一个字符串。 
//
// 
//
// 示例 1: 
//
// 输入: 1
//输出: "1"
//解释：这是一个基本样例。 
//
// 示例 2: 
//
// 输入: 4
//输出: "1211"
//解释：当 n = 3 时，序列是 "21"，其中我们有 "2" 和 "1" 两组，"2" 可以读作 "12"，也就是出现频次 = 1 而 值 = 2；类似 
//"1" 可以读作 "11"。所以答案是 "12" 和 "11" 组合在一起，也就是 "1211"。 
// Related Topics 字符串


class CountAndSay {


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun countAndSay(n: Int): String {
            if (n < 1 || n > 30) return ""
            var chars = charArrayOf('1')
            if (n == 1) return "1"
            var ans = StringBuffer()
            // 1
            // 11
            // 21
            // 1211
            // 111221
            for (i in 1 until n) {
                var j = 0
                val size = chars.size
                while (j < size) {
                    var sum = 1
                    val char = chars[j]
                    if (j + 1 < chars.size) {
                        loopk@ for (k in (j + 1) until chars.size) {
                            if (char == chars[k]) {
                                sum++
                                if (k == chars.size - 1) {
                                    j = k + 1
                                    break@loopk
                                }
                            } else {
                                j = k
                                break@loopk
                            }
                        }
                    } else {
                        j++
                    }
                    ans.append(sum).append(char)
                }
                chars = ans.toString().toCharArray()
                if (i != n - 1) {
                    ans.delete(0, ans.length)
                }
            }
            return ans.toString()
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

fun main() {
    val solution = CountAndSay.Solution()
    println(solution.countAndSay(1))
    println(solution.countAndSay(2))
    println(solution.countAndSay(3))
    println(solution.countAndSay(4))
    println(solution.countAndSay(5))
    println(solution.countAndSay(6))
    println(solution.countAndSay(7))
    println(solution.countAndSay(8))
    println(solution.countAndSay(9))
}