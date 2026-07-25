/*
 * Problem: #50 - Pow(x, n)
 * Difficulty: Medium
 * Topic: math, recursion
 * Runtime: 0 ms
 * Memory: 47.7 MB
 * Date: 25 Jul 2026
 * LeetCode: https://leetcode.com/problems/powx-n/
 */

class Solution {
    public double myPow(double x, int n) {
        long temp = n;

        if (temp < 0)
            return 1.0 / power(x, -temp);

        return power(x, temp);
    }

    public static double power(double x, long n) {
        if (n == 0) return 1.0;
        if (n == 1) return x;

        if (n % 2 == 0)
            return power(x * x, n / 2);

        return x * power(x, n - 1);
    }
}