/*
 * Problem: #2876 - Number of Employees Who Met the Target
 * Difficulty: Easy
 * Topic: array
 * Runtime: 1 ms
 * Memory: 43.8 MB
 * Date: 12 Jul 2026
 * LeetCode: https://leetcode.com/problems/number-of-employees-who-met-the-target/
 */

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;

        for (int hour : hours) {
            if (hour >= target) {
                count++;
            }
        }

        return count;
    }
}