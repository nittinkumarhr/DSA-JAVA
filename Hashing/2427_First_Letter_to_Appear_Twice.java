/*
 * Problem: #2427 - First Letter to Appear Twice
 * Difficulty: Easy
 * Topic: hash-table, string, bit-manipulation, counting
 * Runtime: 0 ms
 * Memory: 42.9 MB
 * Date: 27 Sept 2026
 * LeetCode: https://leetcode.com/problems/first-letter-to-appear-twice/
 */

class Solution {
    public char repeatedCharacter(String s) {
        int n = s.length();
        HashMap<Character,Integer> res = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(res.containsKey(s.charAt(i))){
                int dif = i - res.get(s.charAt(i));
                if(dif < min){
                    min = dif;
                    return s.charAt(i);
                }
            }
            else{
                res.put(s.charAt(i),i);
            }
        }
        return c;
        
    }
        char c =0 ;
}