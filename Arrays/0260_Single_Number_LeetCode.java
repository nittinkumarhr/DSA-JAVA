/*
 * Problem: #260 - Single Number - LeetCode
 * Difficulty: Unknown
 * Topic: array, bit-manipulation
 * Runtime: 0
ms
 * Memory: 0.00
MB
 * Date: 2026-06-27
 * LeetCode: https://leetcode.com/problems/single-number/
 */

class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int n : nums) {
            res = res ^ n;
        }
        return res;        
    }
}