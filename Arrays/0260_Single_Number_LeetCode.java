/*
 * Problem: #260 - Single Number - LeetCode
 * Difficulty: Unknown
 * Topic: array, bit-manipulation
 * Runtime: 1
ms
 * Memory: 46.80
MB
 * Date: 30 Jun 2026
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