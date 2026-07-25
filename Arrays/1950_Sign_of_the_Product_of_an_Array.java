/*
 * Problem: #1950 - Sign of the Product of an Array
 * Difficulty: Easy
 * Topic: array, math
 * Runtime: 0 ms
 * Memory: 45.3 MB
 * Date: 26 Jul 2026
 * LeetCode: https://leetcode.com/problems/sign-of-the-product-of-an-array/
 */

class Solution {
      public int arraySign(int[] nums) {
        int sign = 1; 
        for (int n : nums) {
            if (n == 0) {
                return 0; 
            } 
            if (n < 0) {
                sign = -sign; 
            }
        }
        return sign; 
    }
}