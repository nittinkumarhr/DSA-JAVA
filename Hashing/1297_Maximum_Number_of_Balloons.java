/*
 * Problem: #1297 - Maximum Number of Balloons
 * Difficulty: Easy
 * Topic: hash-table, string, counting
 * Runtime: 2 ms
 * Memory: 43 MB
 * Date: 19 Aug 2026
 * LeetCode: https://leetcode.com/problems/maximum-number-of-balloons/
 */

class Solution {
    public int maxNumberOfBalloons(String s) {
        // Count frequencies of all lowercase letters
        int[] counts = new int[26];
        for (char ch : s.toCharArray()) {
            counts[ch - 'a']++;

        }
        // Find the limiting character
        int bCount = counts['b' - 'a'];
        int aCount = counts['a' - 'a'];
        int nCount = counts['n' - 'a'];
        int lCount = counts['l' - 'a'] / 2; // Requires 2 'l's
        int oCount = counts['o' - 'a'] / 2; // Requires 2 'o's

}
        return Math.min(bCount, 
               Math.min(aCount, 
               Math.min(lCount, 
    }
               Math.min(oCount, nCount))));