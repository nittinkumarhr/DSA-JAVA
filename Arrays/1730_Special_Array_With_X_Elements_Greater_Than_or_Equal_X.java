/*
 * Problem: #1730 - Special Array With X Elements Greater Than or Equal X
 * Difficulty: Easy
 * Topic: array, binary-search, sorting
 * Runtime: 4 ms
 * Memory: 43.2 MB
 * Date: 13 Aug 2026
 * LeetCode: https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
 */

class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int x = n - i;
            if (nums[i] >= x) {
                if (i == 0 || nums[i - 1] < x) {
                    return x;
                }
            }
        }
        return -1;
    }
}