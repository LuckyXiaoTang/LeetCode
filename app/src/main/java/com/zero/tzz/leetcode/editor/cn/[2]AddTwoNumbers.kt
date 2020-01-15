package com.zero.tzz.leetcode.editor.cn

//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学

class AddTwoNumbers {


//leetcode submit region begin(Prohibit modification and deletion)
    /**
     * Example:
     * var li = ListNode(5)
     * var v = li.`val`
     * Definition for singly-linked list.
     * class ListNode(var `val`: Int) {
     *     var next: ListNode? = null
     * }
     */
    class Solution {
        fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
            val dummyHead = ListNode(0)
            var cursor1 = l1
            var cursor2 = l2
            var cursor3 = dummyHead

            var carry = 0

            while (cursor1 != null || cursor2 != null) {
                var num1 = 0
                var num2 = 0
                if (cursor1 != null) {
                    num1 = cursor1.`val`
                }
                if (cursor2 != null) {
                    num2 = cursor2.`val`
                }

                val sum = num1 + num2 + carry

                carry = sum / 10
                cursor3.next = ListNode(sum % 10)
                cursor3 = cursor3.next!!

                if (cursor1 != null) {
                    cursor1 = cursor1.next
                }
                if (cursor2 != null) {
                    cursor2 = cursor2.next
                }
            }
            // at last, still need to check carry for last digit
            if (carry == 1) {
                cursor3.next = ListNode(1)
            }
            return dummyHead.next
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
    override fun toString(): String {
        return "ListNode(value=$`val`, next=$next)"
    }
}

fun main() {
    val l1 = ListNode(8)
    l1.next = ListNode(2)
    l1.next!!.next = ListNode(2)
    val l2 = ListNode(2)
    l2.next = ListNode(2)
    l2.next!!.next = ListNode(8)
    AddTwoNumbers.Solution().addTwoNumbers(l1, l2)
}