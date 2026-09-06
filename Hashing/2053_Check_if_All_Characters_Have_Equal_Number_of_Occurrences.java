/*
 * Problem: #2053 - Check if All Characters Have Equal Number of Occurrences
 * Difficulty: Easy
 * Topic: hash-table, string, counting
 * Runtime: 2 ms
 * Memory: 42.9 MB
 * Date: 06 Sept 2026
 * LeetCode: https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/
 */

class Solution {
        public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        int len = s.length();
        int prev = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            freq[c-'a']++;
           prev = Math.max(prev , freq[c-'a']);
        }
        
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) continue;
            
            if (prev != freq[i]) return false;
        }
        
        return true;
}
}