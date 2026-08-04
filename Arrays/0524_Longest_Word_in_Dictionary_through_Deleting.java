/*
 * Problem: #524 - Longest Word in Dictionary through Deleting
 * Difficulty: Medium
 * Topic: array, two-pointers, string, sorting
 * Runtime: 9 ms
 * Memory: 48 MB
 * Date: 04 Aug 2026
 * LeetCode: https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/
 */

class Solution {
    public String findLongestWord(String S, List<String> D) {
        String ans = "";
        for (String word : D) {
            int a = word.length(), b = ans.length();
            if (a < b || (a == b && word.compareTo(ans) > 0)) continue;
            int pos = -1;
            for (int i = 0; i < a; i++) {
                pos = S.indexOf(word.charAt(i), pos + 1);
                if (pos == -1) break;
            }
            if (pos != -1) ans = word;
        }
        return ans;
    }
}