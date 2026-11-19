/*
 * Problem: #2706 - Minimum Score by Changing Two Elements
 * Difficulty: Medium
 * Topic: array, greedy, sorting
 * Runtime: 18 ms
 * Memory: 59.3 MB
 * Date: 19 Nov 2026
 * LeetCode: https://leetcode.com/problems/minimum-score-by-changing-two-elements/
 */

class Solution {
    public int minimizeSum(int[] nums) {
         Arrays.sort(nums);
        int n = nums.length;
        int option1 = nums[n - 3] - nums[0];
        int option2 = nums[n - 2] - nums[1];
        int option3 = nums[n - 1] - nums[2];
        return Math.min(option1, Math.min(option2, option3));
    }
}