/*
 * Problem: #150 - Evaluate Reverse Polish Notation
 * Difficulty: Medium
 * Topic: array, math, stack
 * Runtime: 6 ms
 * Memory: 45.2 MB
 * Date: 11 Sept 2026
 * LeetCode: https://leetcode.com/problems/evaluate-reverse-polish-notation/
 */

break;
                    
                case "-":
                    b = st.pop();
                    a = st.pop();
                    st.push(a - b); // Order matters: a - b
                    break;
                    
                case "*":
                    b = st.pop();
                    a = st.pop();
                    st.push(a * b);
                    break;
                    
                case "/":
                    b = st.pop();
                    a = st.pop();
                    st.push(a / b); 
                    b = st.pop(); // Pop the second operand first
                    a = st.pop(); // Pop the first operand second
                    st.push(a + b);
        int b = 0;
        for (String token : t) {
            switch (token) {
                case "+":
class Solution {
    public int evalRPN(String[] t) {
        Stack<Integer> st = new Stack();
        int a = 0;