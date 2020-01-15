package com.zero.tzz.leetcode.editor.cn

//给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
//
// 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。 
//
// 你可以假设 nums1 和 nums2 不会同时为空。 
//
// 示例 1: 
//
// nums1 = [1, 3]
//nums2 = [2]
//
//则中位数是 2.0
// 
//
// 示例 2: 
//
// nums1 = [1, 2]
//nums2 = [3, 4]
//
//则中位数是 (2 + 3)/2 = 2.5
// 
// Related Topics 数组 二分查找 分治算法


class MedianOfTwoSortedArrays {


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
            var sum1 = 0
            var sum2 = 0
            for (i in nums1) {
                sum1 += i
            }
            for (i in nums1) {
                sum2 += i
            }
            return (sum1 + sum2).toDouble() / 4
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

fun main() {
    // [1,3,5]
    // [3,4]
    val solution = MedianOfTwoSortedArrays.Solution()
}