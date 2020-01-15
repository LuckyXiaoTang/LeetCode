package com.zero.tzz.leetcode.editor.cn

//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
//
// 示例 1:
//
// 输入: "abcabcbb"
//输出: 3
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
//
//
// 示例 2:
//
// 输入: "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
//
//
// 示例 3:
//
// 输入: "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
//
// Related Topics 哈希表 双指针 字符串 Sliding Window


class LongestSubstringWithoutRepeatingCharacters {


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun lengthOfLongestSubstring(s: String): Int {
            var count = 0
            var i = 0
            var j = 0
            val array = s.toCharArray()
            val list = arrayListOf<Char>()
            val len = array.size
            while (i < len) {
                val char = array[i]
                if (list.contains(char)) {
                    j++
                    i = j
                    count = Math.max(count,list.size)
                    list.clear()
                } else {
                    i++
                    list.add(char)
                }
            }
            count = Math.max(count,list.size)
            return count
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

fun main() {
    val solution = LongestSubstringWithoutRepeatingCharacters.Solution()
    println(solution.lengthOfLongestSubstring("dvdf"))
    println(solution.lengthOfLongestSubstring("abcabcbb"))
    println(solution.lengthOfLongestSubstring("bbbb"))
    println(solution.lengthOfLongestSubstring("pwwkew"))
    println(solution.lengthOfLongestSubstring("ac"))
}