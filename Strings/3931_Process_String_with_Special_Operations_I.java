/*
 * Problem: #3931 - Process String with Special Operations I
 * Difficulty: Medium
 * Topic: string, simulation
 * Runtime: 4 ms
 * Memory: 55.2 MB
 * Date: 07 Nov 2026
 * LeetCode: https://leetcode.com/problems/process-string-with-special-operations-i/
 */

class Solution {
    public String processStr(String s) {
        StringBuilder str = new StringBuilder();
        int n = s.length();
        for(int i=0;i<n;i++){
            int len = str.length();
            if(ch== '#'){
                str.append(str.toString());
            }
            else if(ch == '%' ){
                str.reverse();
            }
            else if(ch == '*'){
            else{
            }
        }
         return str.toString();
    }
}
                str.append(ch);
                if(len>0) str.deleteCharAt((len-1));
            }
            char ch = s.charAt(i);