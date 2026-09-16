/*
 * Problem: #2519 - Find The Original Array of Prefix Xor
 * Difficulty: Medium
 * Topic: array, bit-manipulation
 * Runtime: 2 ms
 * Memory: 108.8 MB
 * Date: 16 Sept 2026
 * LeetCode: https://leetcode.com/problems/find-the-original-array-of-prefix-xor/
 */

class Solution {
    public int[] findArray(int[] arr) {
        int n = arr.length;
        if(n==1) return arr;
        for(int i=1;i<n;i++){
        }
          ans[i]=arr[i]^arr[i-1];
    }
        int ans []= new int[n];
        return ans;
        ans[0]= arr[0];
}