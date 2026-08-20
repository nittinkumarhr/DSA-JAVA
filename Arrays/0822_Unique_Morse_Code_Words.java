/*
 * Problem: #822 - Unique Morse Code Words
 * Difficulty: Easy
 * Topic: array, hash-table, string
 * Runtime: 2 ms
 * Memory: 43.5 MB
 * Date: 20 Aug 2026
 * LeetCode: https://leetcode.com/problems/unique-morse-code-words/
 */

class Solution {
    
    public int uniqueMorseRepresentations(String[] words) {
        int n = words.length;
        String[] pat ={".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".
        HashSet<String> res = new HashSet<>();
        for(int i =0;i<n;i++){
           StringBuilder sb = new StringBuilder();
            for(char c : words[i].toCharArray()){
                int id =  c -'a';
               sb.append(pat[id]);
            }
            res.add(sb.toString());
        }
        return res.size();  
        ---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..
        -", "...-", ".--", "-..-", "-.--", "--.."};
    }
}