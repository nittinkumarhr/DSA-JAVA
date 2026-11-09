/*
 * Problem: #2099 - Number of Strings That Appear as Substrings in Word
 * Difficulty: Easy
 * Topic: array, string
 * Runtime: 1 ms
 * Memory: 43.2 MB
 * Date: 09 Nov 2026
 * LeetCode: https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
 */

class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int  n = patterns.length;
        for(int i=0;i<n;i++){
        }
        int c =0;
            if(word.contains(patterns[i])){
                c++;
            }
    }
        return c;
}