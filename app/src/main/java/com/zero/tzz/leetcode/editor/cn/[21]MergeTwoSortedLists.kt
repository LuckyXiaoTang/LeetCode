package com.zero.tzz.leetcode.editor.cn

//将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
//
// 示例： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
// 
// Related Topics 链表


class MergeTwoSortedLists {


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
        fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
            if (l1 == null && l2 == null) return null
            var cursor1 = l1
            var cursor2 = l2
            val ans: ListNode? = ListNode(0)
            var dummy = ans
            while (dummy != null) {
                var val1 = Int.MAX_VALUE
                var val2 = Int.MAX_VALUE
                if (cursor1 != null) {
                    val1 = cursor1.`val`
                }
                if (cursor2 != null) {
                    val2 = cursor2.`val`
                }
                if (val1 < val2) {
                    dummy.`val` = val1
                    cursor1 = cursor1?.next
                } else {
                    dummy.`val` = val2
                    cursor2 = cursor2?.next
                }
                if (cursor1 != null || cursor2 != null) {
                    dummy.next = ListNode(0)
                }else{
                    dummy.next = null
                }
                dummy = dummy.next
            }
            return ans
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

fun main() {
    val solution = MergeTwoSortedLists.Solution()
    val l1 = ListNode(8)
    l1.next = ListNode(2)
    l1.next!!.next = ListNode(2)
    val l2 = ListNode(2)
    l2.next = ListNode(2)
    l2.next!!.next = ListNode(8)
    println(solution.mergeTwoLists(l1, l2))
}