/*
 * Problem: #392 - Is Subsequence
 * Difficulty: Easy
 * Topic: two-pointers, string, dynamic-programming
 * Runtime: 1 ms
 * Memory: 42.8 MB
 * Date: 15 Aug 2026
 * LeetCode: https://leetcode.com/problems/is-subsequence/
 */

class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int i =0;
        int j = 0;

        
        while( i <n && j<m){
            if(s.charAt(i) == t.charAt(j)){
        }
                i++;
            }
    }
            j++;
        return i == n;
}