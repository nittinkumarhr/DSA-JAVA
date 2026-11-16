/*
 * Problem: #2361 - Calculate Digit Sum of a String
 * Difficulty: Easy
 * Topic: string, simulation
 * Runtime: 1 ms
 * Memory: 42.3 MB
 * Date: 16 Nov 2026
 * LeetCode: https://leetcode.com/problems/calculate-digit-sum-of-a-string/
 */

class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < s.length(); i += k) {
                int sum = 0;
                for (int j = i; j < Math.min(i + k, s.length()); j++) {
                    sum += s.charAt(j) - '0';
                }
                result.append(sum);
            }
            s = result.toString();
        }
        return s;
    }
}