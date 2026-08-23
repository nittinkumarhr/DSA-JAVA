/*
 * Problem: #1363 - Greatest English Letter in Upper and Lower Case
 * Difficulty: Easy
 * Topic: hash-table, string, enumeration
 * Runtime: 6 ms
 * Memory: 43.7 MB
 * Date: 23 Aug 2026
 * LeetCode: https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/
 */

class Solution
{
    public String greatestLetter(String s)
    {
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray())
            set.add(ch);
        
        for(char ch = 'Z'; ch >= 'A'; ch--)
            if(set.contains(ch) && set.contains((char)('a'+(ch-'A'))))
               return ""+ch;
        return "";
    }
}