/*
 * Problem: #1065 - Binary String With Substrings Representing 1 To N
 * Difficulty: Medium
 * Topic: hash-table, string, bit-manipulation, sliding-window
 * Runtime: 0 ms
 * Memory: 42.8 MB
 * Date: 08 Jul 2026
 * LeetCode: https://leetcode.com/problems/binary-string-with-substrings-representing-1-to-n/
 */

class Solution {
    public boolean queryString(String s, int n) {
        for(int i =1;i<=n;i++){
            String bin = Integer.toBinaryString(i);
            if(!s.contains(bin)){
                return false;
            }
        }
        return true;
    }
}