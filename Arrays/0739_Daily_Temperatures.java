/*
 * Problem: #739 - Daily Temperatures
 * Difficulty: Medium
 * Topic: array, stack, monotonic-stack
 * Runtime: 60 ms
 * Memory: 107.8 MB
 * Date: 21 Jul 2026
 * LeetCode: https://leetcode.com/problems/daily-temperatures/
 */

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {

                int index = stack.pop();
                ans[index] = i - index;
            }
            stack.push(i);
        }
        return ans;
    }
}