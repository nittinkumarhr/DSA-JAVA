/*
 * Problem: #4220 - Minimum Operations to Sort a String
 * Difficulty: Medium
 * Topic: string
 * Runtime: 26 ms
 * Memory: 47.4 MB
 * Date: 21 Oct 2026
 * LeetCode: https://leetcode.com/problems/minimum-operations-to-sort-a-string/
 */

// Case 1: Already sorted
        if (sorted) {
            return 0;
        }
        // Case 2: Cannot sort the entire 2-character string
        if (n == 2) {
            return -1;
        }
        // Case 3: One operation is enough
        if (s.charAt(0) == minChar ||
            s.charAt(n - 1) == maxChar) {
            return 1;
        }
        // Case 4: Check the middle characters
            if (i > 0 && s.charAt(i) < s.charAt(i - 1)) {
                sorted = false;
            }
        }
            char c = s.charAt(i);
            minChar = (char) Math.min(minChar, c);
            maxChar = (char) Math.max(maxChar, c);
        char maxChar = s.charAt(0);
        for (int i = 0; i < n; i++) {
        boolean sorted = true;
        char minChar = s.charAt(0);

class Solution {
    public int minOperations(String s) {
        int n = s.length();