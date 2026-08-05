/*
 * Problem: #957 - Minimum Add to Make Parentheses Valid
 * Difficulty: Medium
 * Topic: string, stack, greedy, bracket-sequences
 * Runtime: 2 ms
 * Memory: 43 MB
 * Date: 05 Aug 2026
 * LeetCode: https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
 */

class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for( int i=0;i<n;i++){
            char c = s.charAt(i) ;
            if( st.empty()){
                st.push(c);
            }
            else if(st.peek()=='(' && c == ')'){
                st.pop();
            }

        }
        return st.size();
            else{
                st.push(c);
            }
    }
}