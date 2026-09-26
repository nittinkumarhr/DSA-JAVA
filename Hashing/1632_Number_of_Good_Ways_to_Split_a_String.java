/*
 * Problem: #1632 - Number of Good Ways to Split a String
 * Difficulty: Medium
 * Topic: hash-table, string, dynamic-programming, bit-manipulation, prefix-sum
 * Runtime: 5 ms
 * Memory: 46.3 MB
 * Date: 26 Sept 2026
 * LeetCode: https://leetcode.com/problems/number-of-good-ways-to-split-a-string/
 */

class Solution {
    public int numSplits(String s) {
        int rc[] = new int[26], lc[] = new int[26], l = 0, r = 0, res = 0;
        for (char c : s.toCharArray())
            if (rc[c - 'a']++ == 0)
                r++;
        for (char c : s.toCharArray()) {
            if (lc[c - 'a']++ == 0)
                l++;
            if (--rc[c - 'a'] == 0)
                r--;
            if (l == r)
                res++;
        }
        return res;
    }
}