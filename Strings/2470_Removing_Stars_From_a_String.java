/*
 * Problem: #2470 - Removing Stars From a String
 * Difficulty: Medium
 * Topic: string, stack, simulation
 * Runtime: 90 ms
 * Memory: 48.8 MB
 * Date: 09 Sept 2026
 * LeetCode: https://leetcode.com/problems/removing-stars-from-a-string/
 */

class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack();
        for(char c : s.toCharArray()){
            if(c =='*' && !st.isEmpty()){
                st.pop();
            }
        }
        
            else {
                st.push(c);
            }
        return sb.reverse().toString();
        while (!st.isEmpty()) {
        }
        if(st.isEmpty()){
            return "";
        }
    }
        StringBuffer sb = new StringBuffer();
            sb.append(st.pop());
}