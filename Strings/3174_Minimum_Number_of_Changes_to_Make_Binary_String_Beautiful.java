/*
 * Problem: #3174 - Minimum Number of Changes to Make Binary String Beautiful
 * Difficulty: Medium
 * Topic: string
 * Runtime: 3 ms
 * Memory: 46.2 MB
 * Date: 18 Nov 2026
 * LeetCode: https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful/
 */

class Solution {
    public int minChanges(String s) {
        int changes = 0;
        for (int i = 0; i < s.length(); i += 2) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                changes++;
            }
        }
        return changes;
    }
}