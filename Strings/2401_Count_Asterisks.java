/*
 * Problem: #2401 - Count Asterisks
 * Difficulty: Easy
 * Topic: string
 * Runtime: 3 ms
 * Memory: 43.2 MB
 * Date: 26 Aug 2026
 * LeetCode: https://leetcode.com/problems/count-asterisks/
 */

class Solution {
    public int countAsterisks(String s) {
        boolean insidePipe = false;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '|'){
                insidePipe = !insidePipe;
            }
            if(!insidePipe && s.charAt(i) == '*'){
                count++;
            }
        }
        return count;
    }
}