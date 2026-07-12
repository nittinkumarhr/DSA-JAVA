/*
 * Problem: #2231 - Find First Palindromic String in the Array
 * Difficulty: Easy
 * Topic: array, two-pointers, string
 * Runtime: 1 ms
 * Memory: 47.6 MB
 * Date: 12 Jul 2026
 * LeetCode: https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
 */

class Solution {
    public String firstPalindrome(String[] words) {

    public boolean isPalindrome (String s){
    }
        int n = s.length();
        int j =n-1;
        int i=0;
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
        }
            }
                return false;
            i++;
            j--;
        return true;
        int n = words.length;
        for(int i=0;i<n;i++){
            boolean c = isPalindrome(words[i]);
        }
            if(c == true){
                return words[i];
            }
    }
        return "";        
}