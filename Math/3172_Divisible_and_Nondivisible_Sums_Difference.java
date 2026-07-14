/*
 * Problem: #3172 - Divisible and Non-divisible Sums Difference
 * Difficulty: Easy
 * Topic: math
 * Runtime: 1 ms
 * Memory: 42.5 MB
 * Date: 15 Jul 2026
 * LeetCode: https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/
 */

class Solution {
    public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m != 0) {
                num1 += i;
            } else {
                num2 += i;
            }
        }

        return num1 - num2;
    }
}