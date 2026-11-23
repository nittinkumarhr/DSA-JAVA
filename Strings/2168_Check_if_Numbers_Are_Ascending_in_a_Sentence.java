/*
 * Problem: #2168 - Check if Numbers Are Ascending in a Sentence
 * Difficulty: Easy
 * Topic: string
 * Runtime: 1 ms
 * Memory: 41.9 MB
 * Date: 23 Nov 2026
 * LeetCode: https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/
 */

class Solution {
    public boolean areNumbersAscending(String s) {
        int prev=0,curr=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                curr = s.charAt(i)-'0';
                while(i+1 < s.length() && s.charAt(i+1) >='0' && s.charAt(i+1) <= '9' ){
                    curr=(curr*10)+(s.charAt(i+1)-'0');
                    i++;
                }
                if(curr <= prev){
                    return false;
                }
                prev = curr;
            }
        }
        return true;
    }
}