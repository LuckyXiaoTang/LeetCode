package com.zero.tzz.leetcode.editor.cn

//编写一个函数来查找字符串数组中的最长公共前缀。
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 示例 1: 
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
// 
//
// 示例 2: 
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
// 
//
// 说明: 
//
// 所有输入只包含小写字母 a-z 。 
// Related Topics 字符串


class LongestCommonPrefix {


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun longestCommonPrefix(strs: Array<String>): String {
            val size = strs.size
            if (size == 0) return ""
            if (size == 1) return strs[0]
            var result = strs[0]
            for (i in 1 until size) {
                val str1 = strs[i].toCharArray()
                val str2 = strs[i - 1].toCharArray()
                val len = Math.min(str1.size, str2.size)
                var temp = ""
                loop@ for (j in 0 until len) {
                    if (str1[j] != str2[j]) {
                        break@loop
                    }
                    temp += str1[j]
                }
                if (result.length > temp.length) {
                    result = temp
                }
            }
            return result
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

fun main() {
    val solution = LongestCommonPrefix.Solution()
    println(solution.longestCommonPrefix(arrayOf("dog","racecar","car")))
}