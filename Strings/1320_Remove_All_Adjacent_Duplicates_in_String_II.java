/*
 * Problem: #1320 - Remove All Adjacent Duplicates in String II
 * Difficulty: Medium
 * Topic: string, stack
 * Runtime: 26 ms
 * Memory: 47 MB
 * Date: 29 Jul 2026
 * LeetCode: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
 */

int count;

class Solution {

    class Pair {
        char ch;
        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public String removeDuplicates(String s, int k) {