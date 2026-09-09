/*
 * Problem: #874 - Backspace String Compare
 * Difficulty: Easy
 * Topic: two-pointers, string, stack, simulation
 * Runtime: 2 ms
 * Memory: 43.3 MB
 * Date: 09 Sept 2026
 * LeetCode: https://leetcode.com/problems/backspace-string-compare/
 */

class Solution {
        
    public String eval(String s) {
        Stack<Character> stk = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch != '#') {
            } else if (!stk.isEmpty()) {
                stk.push(ch); 
            }
                stk.pop();  
        }
        StringBuilder res = new StringBuilder();
        for (char ch : stk) {
            res.append(ch);
        }
        return res.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        return eval(s).equals(eval(t));
    }
}