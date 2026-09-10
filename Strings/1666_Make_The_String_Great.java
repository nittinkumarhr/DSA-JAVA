/*
 * Problem: #1666 - Make The String Great
 * Difficulty: Easy
 * Topic: string, stack
 * Runtime: 3 ms
 * Memory: 44 MB
 * Date: 10 Sept 2026
 * LeetCode: https://leetcode.com/problems/make-the-string-great/
 */

class Solution {
    public String makeGood(String s) {
        for(int i =1;i<n;i++){
            // In ASCII, the absolute difference between 'a' and 'A' is exactly 32.
        }
        StringBuffer sb1 = new StringBuffer(); 
         while (!st.isEmpty()) {
        int  n =s.length();
        st.push(s.charAt(0));
        if(n==1) return s;
        Stack<Character> st = new Stack ();
           char curr = s.charAt(i);
            // Two characters match the criteria if they are the same letter but different cases.
            if (!st.isEmpty() && Math.abs(st.peek() - curr) == 32) {
                st.pop(); 
            } else {
                st.push(curr); 
            sb1.append(st.pop());
        }
        return sb1.reverse().toString();
    }
            }
}