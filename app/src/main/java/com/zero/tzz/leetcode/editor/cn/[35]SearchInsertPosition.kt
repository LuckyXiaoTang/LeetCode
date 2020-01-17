package com.zero.tzz.leetcode.editor.cn

//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//
// 你可以假设数组中无重复元素。 
//
// 示例 1: 
//
// 输入: [1,3,5,6], 5
//输出: 2
// 
//
// 示例 2: 
//
// 输入: [1,3,5,6], 2
//输出: 1
// 
//
// 示例 3: 
//
// 输入: [1,3,5,6], 7
//输出: 4
// 
//
// 示例 4: 
//
// 输入: [1,3,5,6], 0
//输出: 0
// 
// Related Topics 数组 二分查找


class SearchInsertPosition {


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun searchInsert(nums: IntArray, target: Int): Int {
            if (nums.isEmpty()) return 0
            if (nums[0] >= target) return 0
            if (nums[nums.size - 1] < target) return nums.size
            // 二分查找元素
            // [1,3,5,6] 7
            var min = 0
            var max = nums.size
            var mid = (min + max) / 2
            var ans = 0
            while (true) {
                val midValue = nums[mid]
                if (midValue == target) {
                    ans = mid
                    break
                }
                if (midValue > target) {
                    max = mid
                } else {
                    min = mid
                }
                mid = (min + max) / 2
                if (max - min == 1) {
                    ans = min + 1
                    break
                }
            }
            return ans
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}

fun main() {
    val solution = SearchInsertPosition.Solution()
    println(solution.searchInsert(intArrayOf(1, 3, 5, 6), 0))
    println(solution.searchInsert(intArrayOf(1, 3, 5, 6), 7))
    println(solution.searchInsert(intArrayOf(1, 3, 5, 6), 1))
    println(solution.searchInsert(intArrayOf(1, 3, 5, 6), 3))
}