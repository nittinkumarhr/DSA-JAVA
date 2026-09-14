/*
 * Problem: #2288 - Count Operations to Obtain Zero
 * Difficulty: Easy
 * Topic: math, simulation
 * Runtime: 9 ms
 * Memory: 49.1 MB
 * Date: 14 Sept 2026
 * LeetCode: https://leetcode.com/problems/count-operations-to-obtain-zero/
 */

class Solution {
    public int countOperations(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        return helper(num1, num2, 0);

    }
    public int helper(int n1, int n2, int c) {
        if (n1 == 0 || n2 == 0) {
            return c;
        }
        if (n1 >= n2) {
            n1 = n1 - n2;
        } else {
            return helper(n1, n2, c + 1);
            n2 = n2 - n1;
            return helper(n1, n2, c + 1);
    }
}
        }