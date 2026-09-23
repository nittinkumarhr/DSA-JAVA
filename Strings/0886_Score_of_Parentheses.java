/*
 * Problem: #886 - Score of Parentheses
 * Difficulty: Medium
 * Topic: string, stack, bracket-sequences
 * Runtime: 0 ms
 * Memory: 42.6 MB
 * Date: 23 Sept 2026
 * LeetCode: https://leetcode.com/problems/score-of-parentheses/
 */

Stack<Integer> stack = new Stack<>();
            if (ch == '(') {
        // Score outside all parentheses
        stack.push(0);
        for (char ch : s.toCharArray()) {
                // Start a new nested level
                stack.push(0);
            } else {
                // Score inside the current ()
                int inner = stack.pop();
                // Calculate score of this pair
                int currentScore = Math.max(1, 2 * inner);
                // Add it to the previous level
                int previous = stack.pop();
                stack.push(previous + currentScore);
            }
    public int scoreOfParentheses(String s) {
class Solution {

import java.util.Stack;
        }
        return stack.peek();
    }
}