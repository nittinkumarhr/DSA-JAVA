/*
 * Problem: #985 - Bag of Tokens
 * Difficulty: Medium
 * Topic: array, two-pointers, greedy, sorting
 * Runtime: 6 ms
 * Memory: 45.1 MB
 * Date: 24 Jul 2026
 * LeetCode: https://leetcode.com/problems/bag-of-tokens/
 */

class Solution {
    public int bagOfTokensScore(int[] arr, int p) {
        int n = arr.length;
        int s =0,m=0;
        int i =0,j = n-1;
        while(i<=j){
            if(arr[i]<=p){
                p = p-arr[i];
                s++;
                i++;
            }
            else if(i<j &&s >0){
                p=p+arr[j];
                s--;
                j--;
            }
        }
        return s;

        Arrays.sort(arr);
                m = Math.max(m,s);
            else 
            {
                break;
            }
    }
}