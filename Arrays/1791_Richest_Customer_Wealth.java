/*
 * Problem: #1791 - Richest Customer Wealth
 * Difficulty: Easy
 * Topic: array, matrix
 * Runtime: 0 ms
 * Memory: 44.4 MB
 * Date: 25 Jul 2026
 * LeetCode: https://leetcode.com/problems/richest-customer-wealth/
 */

class Solution {
    public int maximumWealth(int[][] accounts) {
        int rich = 0;
        for (int[] i : accounts) {
            int sum = 0;
            for (int money : i) {
                sum += money;
            }
            rich = Math.max(rich, sum);
        }
        return rich;
    }
}