/*
 * Problem: #1538 - Maximum Points You Can Obtain from Cards
 * Difficulty: Medium
 * Topic: array, sliding-window, prefix-sum
 * Runtime: 1 ms
 * Memory: 62 MB
 * Date: 09 Jul 2026
 * LeetCode: https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
 */

class Solution {
    public int maxScore(int[] arr, int k) {
        int n = arr.length;
        int sum =0;
        if(n ==k){
            for(int i=0;i<n;i++){
                sum += arr[i];
            }
            return sum;
        }
        for(int i=n-k;i<n;i++){
            sum += arr[i];
        }
        int i=0,j=n-k;
        int cur =sum;
        while(j<n){
            cur += arr[i]- arr[j];
            if(cur > sum){
                sum = cur;
            }
            i++;
            j++;
        }
        return sum;
    
        
    }
}