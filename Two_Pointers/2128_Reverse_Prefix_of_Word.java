/*
 * Problem: #2128 - Reverse Prefix of Word
 * Difficulty: Easy
 * Topic: two-pointers, string, stack
 * Runtime: 0 ms
 * Memory: 42.6 MB
 * Date: 25 Aug 2026
 * LeetCode: https://leetcode.com/problems/reverse-prefix-of-word/
 */

class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        int start = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == ch){
                int end = i;
                Reverse(arr, start, end);
                break;
            }
        }
        return new String(arr);
    }
    private void Reverse(char[] ch, int s, int e){

        while(s < e){
            char temp = ch[s];
            ch[s] = ch[e];
            ch[e] = temp;
            s++;
            e--;
        }
    }
}