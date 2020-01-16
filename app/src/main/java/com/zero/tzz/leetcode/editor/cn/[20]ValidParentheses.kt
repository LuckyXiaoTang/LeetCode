package com.zero.tzz.leetcode.editor.cn

//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 注意空字符串可被认为是有效字符串。 
//
// 示例 1: 
//
// 输入: "()"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "()[]{}"
//输出: true
// 
//
// 示例 3: 
//
// 输入: "(]"
//输出: false
// 
//
// 示例 4: 
//
// 输入: "([)]"
//输出: false
// 
//
// 示例 5: 
//
// 输入: "{[]}"
//输出: true 
// Related Topics 栈 字符串


class ValidParentheses {


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun isValid(s: String): Boolean {
            if (s.isEmpty()) return true
            if (s.length % 2 != 0) return false
            // stack方案无法提交 需要导包
            /*val map = hashMapOf(
                '}' to '{',
                ']' to '[',
                ')' to '('
            )
            val stack = Stack<Char>()
            val array = s.toCharArray()
            for (char in array) {
                if (map.containsKey(char)) {
                    val value = map.get(char)
                    val topChar = if (stack.isEmpty()) '#' else stack.pop()
                    if (value != topChar) {
                        return false
                    }
                    continue
                }
                stack.push(char)
            }
            return stack.isEmpty()*/
            if (s.contains("{}") || s.contains("[]") || s.contains("()")) {
                return isValid(s.replace("{}", "").replace("[]", "").replace("()", ""))
            }
            return false
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}

fun main() {
    val solution = ValidParentheses.Solution()
    println(solution.isValid("{[]}"))
    println(solution.isValid("()[]{}"))
    println(solution.isValid("{["))
    println(solution.isValid("}[]"))
}