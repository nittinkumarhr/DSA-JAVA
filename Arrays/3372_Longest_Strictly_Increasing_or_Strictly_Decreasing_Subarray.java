/*
 * Problem: #3372 - Longest Strictly Increasing or Strictly Decreasing Subarray
 * Difficulty: Easy
 * Topic: array
 * Runtime: 1 ms
 * Memory: 43.8 MB
 * Date: 12 Nov 2026
 * LeetCode: https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/
 */

class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int maxLen = 1, inc = 1, dec = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                inc++;
                dec = 1;
            } else if (nums[i] < nums[i - 1]) {
                dec++;
                inc = 1;
            } else {
                inc = 1;
                dec = 1;
            }
            maxLen = Math.max(maxLen, Math.max(inc, dec));
        }
        return maxLen;
    }
}