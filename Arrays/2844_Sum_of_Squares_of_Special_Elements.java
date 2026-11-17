/*
 * Problem: #2844 - Sum of Squares of Special Elements 
 * Difficulty: Easy
 * Topic: array, enumeration
 * Runtime: 2 ms
 * Memory: 45.7 MB
 * Date: 17 Nov 2026
 * LeetCode: https://leetcode.com/problems/sum-of-squares-of-special-elements/
 */

class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                ans += nums[i - 1] * nums[i - 1];
            }
        }
        return ans;
    }
}