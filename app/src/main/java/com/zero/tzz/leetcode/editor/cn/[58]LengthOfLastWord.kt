package com.zero.tzz.leetcode.editor.cn

//给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。
//
// 如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。 
//
// 如果不存在最后一个单词，请返回 0 。 
//
// 说明：一个单词是指仅由字母组成、不包含任何空格的 最大子字符串。 
//
// 
//
// 示例: 
//
// 输入: "Hello World"
//输出: 5
// 
// Related Topics 字符串


class LengthOfLastWord {


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun lengthOfLastWord(s: String): Int {
            if (s.isEmpty()) return 0
            val str = s.trim()
            if(!str.trim().contains(' ')) return str.length
            val index = str.lastIndexOf(' ')
            if (index != str.length - 1) {
                return str.length - 1 - index
            }
            return 0
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

fun main() {
    val solution = LengthOfLastWord.Solution()
    println(solution.lengthOfLastWord("aa a "))
}