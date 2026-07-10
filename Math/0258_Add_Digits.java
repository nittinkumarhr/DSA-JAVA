/*
 * Problem: #258 - Add Digits
 * Difficulty: Easy
 * Topic: math, simulation, number-theory
 * Runtime: 1 ms
 * Memory: 42.7 MB
 * Date: 10 Jul 2026
 * LeetCode: https://leetcode.com/problems/add-digits/
 */

class Solution {
    public int addDigits(int num) {
        if (num == 0)
            return 0;
        if (num % 9 == 0)
            return 9;
        return num % 9;
    }
}