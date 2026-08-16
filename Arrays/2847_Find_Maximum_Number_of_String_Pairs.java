/*
 * Problem: #2847 - Find Maximum Number of String Pairs
 * Difficulty: Easy
 * Topic: array, hash-table, string, simulation
 * Runtime: 3 ms
 * Memory: 45 MB
 * Date: 16 Aug 2026
 * LeetCode: https://leetcode.com/problems/find-maximum-number-of-string-pairs/
 */

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> set = new HashSet<>();
        int count = 0;
        
        for (String str : words) {
            if (set.contains(str)) {
                count++;
            }
            String rev = new StringBuilder(str).reverse().toString();
            set.add(rev);
        }
        
        return count;
    }
}