/*
 * Problem: #807 - Custom Sort String
 * Difficulty: Medium
 * Topic: hash-table, string, sorting
 * Runtime: 2 ms
 * Memory: 43 MB
 * Date: 01 Aug 2026
 * LeetCode: https://leetcode.com/problems/custom-sort-string/
 */

import java.util.HashMap;
class Solution {
    public String customSortString(String order, String s) {
        StringBuilder result = new StringBuilder();
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        for (char c : order.toCharArray()) {
            if (mp.containsKey(c)) {
                result.append(String.valueOf(c).repeat(Math.max(0, mp.get(c))));
                mp.remove(c);
            }
        }
        for (char c : mp.keySet()) {
            result.append(String.valueOf(c).repeat(Math.max(0, mp.get(c))));
        }
        return result.toString();
    }
}