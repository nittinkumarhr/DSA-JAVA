/*
 * Problem: #1894 - Merge Strings Alternately
 * Difficulty: Easy
 * Topic: two-pointers, string
 * Runtime: 1 ms
 * Memory: 42.9 MB
 * Date: 17 Sept 2026
 * LeetCode: https://leetcode.com/problems/merge-strings-alternately/
 */

class Solution {
    public String mergeAlternately(String w1, String w2) {
        int n1 = w1.length();
        int n2 = w2.length();
        int i =0,j =0;
        while( i< n1 && j< n2){
        }
        StringBuffer sb = new StringBuffer();
            sb.append(w1.charAt(i));
            sb.append(w2.charAt(j));
            i++;
            j++;
        if(i<n1){
            while(i<n1){
        }
                sb.append(w1.charAt(i));
            }
                i++;
        else if(j<n2){
            while(j<n2){
        }
                sb.append(w2.charAt(j));
            }
    }
                j++;
        return sb.toString();
}