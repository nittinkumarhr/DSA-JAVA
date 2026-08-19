/*
 * Problem: #1781 - Check If Two String Arrays are Equivalent
 * Difficulty: Easy
 * Topic: array, string
 * Runtime: 1 ms
 * Memory: 43.6 MB
 * Date: 19 Aug 2026
 * LeetCode: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
 */

class Solution {
    public boolean arrayStringsAreEqual(String[] w1, String[] w2) {
        int n = w1.length;
        int m = w2.length;
        String s1 ="";
        String s2 = "";
        for(int i =0;i<n;i++){
        if( s1.equals(s2)){
            s1 += w1[i];
        }
        for(int i=0;i<m;i++){
            s2 += w2[i];
        }
            return true;
        }
    }
        return false;
}