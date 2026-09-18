/*
 * Problem: #2736 - Minimum Additions to Make Valid String
 * Difficulty: Medium
 * Topic: string, dynamic-programming, stack, greedy
 * Runtime: 1 ms
 * Memory: 44 MB
 * Date: 18 Sept 2026
 * LeetCode: https://leetcode.com/problems/minimum-additions-to-make-valid-string/
 */

class Solution {
    public int addMinimum(String word) {
        int ans = 0;
        int i = 0; // Pointer for the given word
        int j = 0; // Pointer representing 'a', 'b', 'c' cyclically (0='a', 1='b', 2='c')
        
        while (i < word.length()) {
            char expectedChar = (char) ('a' + j);
            if (word.charAt(i) == expectedChar) {
                i++; // Character matches what we expect, move forward in input
            } else {
                ans++; // Mis-match: we must insert the expectedChar here
            }
            j = (j + 1) % 3; // Move to the next expected character cycle
        }
        
        // If the string ended but we are in the middle of a cycle, complete the last block
        if (j != 0) {
            ans += (3 - j);
        }
        
        return ans;
    }
}