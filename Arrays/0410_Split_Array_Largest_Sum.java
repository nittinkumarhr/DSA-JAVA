/*
 * Problem: #410 - Split Array Largest Sum
 * Difficulty: Hard
 * Topic: array, binary-search, dynamic-programming, greedy, prefix-sum
 * Runtime: 0 ms
 * Memory: 43 MB
 * Date: 29 Sept 2026
 * LeetCode: https://leetcode.com/problems/split-array-largest-sum/
 */

}
        return low;
    }
                low = mid + 1;
            }
            } else {
                // mid is not possible
    private boolean canSplit(int[] nums, int k, int maxSum) {
        int parts = 1;
        int currentSum = 0;
        for (int num : nums) {
            if (currentSum + num <= maxSum) {
                currentSum += num;
                high = mid;
                // mid is possible
                // Try to find a smaller answer
            int mid = low + (high - low) / 2;
            if (canSplit(nums, k, mid)) {
        while (low < high) {
        // Binary Search

            high += num;
        }
            low = Math.max(low, num);
        for (int num : nums) {
        // Find the search range
        int high = 0;
        int low = 0;
class Solution {
    public int splitArray(int[] nums, int k) {