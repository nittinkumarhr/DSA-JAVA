/*
 * Problem: #1938 - Minimum Operations to Make the Array Increasing
 * Difficulty: Easy
 * Topic: array, greedy
 * Runtime: 2 ms
 * Memory: 47.2 MB
 * Date: 11 Aug 2026
 * LeetCode: https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/
 */

class Solution {
        public int minOperations(int[] nums) {
        int cnt = 0, prev = 0;
        for (int cur : nums) {
            if (cur <= prev) {
                cnt += ++prev - cur;
            }else {
                prev = cur;
            }
        }
        return cnt;
    }
}