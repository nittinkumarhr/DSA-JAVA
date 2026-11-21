/*
 * Problem: #4078 - Maximum Alternating Sum of Squares
 * Difficulty: Medium
 * Topic: array, greedy, sorting
 * Runtime: 34 ms
 * Memory: 135.2 MB
 * Date: 21 Nov 2026
 * LeetCode: https://leetcode.com/problems/maximum-alternating-sum-of-squares/
 */

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] sq = new long[n];
        for (int i = 0; i < n; i++) {
            sq[i] = (long) nums[i] * nums[i];
        }
        Arrays.sort(sq);
        long ans = 0;
        int pos = (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            if (i < pos) ans += sq[n - 1 - i];
            else ans -= sq[n - 1 - i];
        }
        return ans;
    }
}