/*
 * Problem: #890 - Isomorphic Strings - LeetCode
 * Difficulty: Unknown
 * Topic: hash-table, string
 * Runtime: 18
ms
 * Memory: 44.12
MB
 * Date: 2026-06-29
 * LeetCode: https://leetcode.com/problems/isomorphic-strings/
 */

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> charIndexS = new HashMap<>();
        HashMap<Character, Integer> charIndexT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!charIndexS.containsKey(s.charAt(i))) {
                charIndexS.put(s.charAt(i), i);
            }

            if (!charIndexT.containsKey(t.charAt(i))) {
                charIndexT.put(t.charAt(i), i);
            }

            if (!charIndexS.get(s.charAt(i)).equals(charIndexT.get(t.charAt(i)))) {
                return false;
            }
        }

        return true;        
    }
}