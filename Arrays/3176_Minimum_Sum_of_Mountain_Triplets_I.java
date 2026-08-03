/*
 * Problem: #3176 - Minimum Sum of Mountain Triplets I
 * Difficulty: Easy
 * Topic: array
 * Runtime: 2 ms
 * Memory: 43.7 MB
 * Date: 03 Aug 2026
 * LeetCode: https://leetcode.com/problems/minimum-sum-of-mountain-triplets-i/
 */

class Solution {
    public int minimumSum(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-2;i++){
            for(int j =i+1;j<n-1;j++){
                for(int k =j+1;k<n;k++){
            }
        }
        
                }
        int max =Integer.MAX_VALUE;
                    if(arr[i]<arr[j] && arr[j]>arr[k]){
                        max = Math.min(max,(arr[i]+arr[j]+arr[k]));
                    }
    }
        if( max == Integer.MAX_VALUE) return -1;
        return max;
}