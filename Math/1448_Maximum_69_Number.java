/*
 * Problem: #1448 - Maximum 69 Number
 * Difficulty: Easy
 * Topic: math, greedy
 * Runtime: 1 ms
 * Memory: 41.8 MB
 * Date: 20 Sept 2026
 * LeetCode: https://leetcode.com/problems/maximum-69-number/
 */

class Solution {
    public int maximum69Number(int num) {
  char[] digits = String.valueOf(num).toCharArray();  
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9';
                break; 
            }
        }
        return Integer.parseInt(new String(digits));
    }
}