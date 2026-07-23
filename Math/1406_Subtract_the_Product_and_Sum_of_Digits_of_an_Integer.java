/*
 * Problem: #1406 - Subtract the Product and Sum of Digits of an Integer
 * Difficulty: Easy
 * Topic: math
 * Runtime: 0 ms
 * Memory: 42.2 MB
 * Date: 24 Jul 2026
 * LeetCode: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */

class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }return product - sum;
    }
}