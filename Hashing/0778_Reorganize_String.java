/*
 * Problem: #778 - Reorganize String
 * Difficulty: Medium
 * Topic: hash-table, string, greedy, sorting, heap-priority-queue, counting
 * Runtime: 1 ms
 * Memory: 42.9 MB
 * Date: 21 Sept 2026
 * LeetCode: https://leetcode.com/problems/reorganize-string/
 */

int n = s.length();
        int feq[] = new int[26];
        for (int i = 0; i < n; i++) {
            feq[s.charAt(i) - 'a']++;

        }
        int max =0,letter =0;
        for(int i=0;i<26;i++){
            if(feq[i]>max){
        }
            }
                max =feq[i];
                letter =i;
        if(max >(n+1)/2) return "";
        char res [] = new char [n];
        int idx=0;
        while(feq[letter]-- >0){
            res[idx] = (char) (letter +'a');
        }
            idx +=2;
        for(int i=0;i<26;i++){
            while(feq[i]-- >0){
                if(idx >= res.length) idx =1;
            }
                res[idx] = (char )(i +'a');
                idx +=2;
        }
class Solution {
    public String reorganizeString(String s) {