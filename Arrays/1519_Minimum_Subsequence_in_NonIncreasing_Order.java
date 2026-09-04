/*
 * Problem: #1519 - Minimum Subsequence in Non-Increasing Order
 * Difficulty: Easy
 * Topic: array, greedy, sorting
 * Runtime: 9 ms
 * Memory: 52.2 MB
 * Date: 04 Sept 2026
 * LeetCode: https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/
 */

class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        // 1. Calculate total sum
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        int selected = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            // Take current element
            selected += nums[i];
            // Add it to answer
            result.add(nums[i]);
            // 4. Check condition
            int remaining = total - selected;
            if (selected > remaining) {
                break;
            }
        }
        return result;
    }
}