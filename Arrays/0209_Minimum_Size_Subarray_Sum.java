/*
 * Problem: #209 - Minimum Size Subarray Sum
 * Difficulty: Medium
 * Topic: array, binary-search, sliding-window, prefix-sum
 * Runtime: 1 ms
 * Memory: 68.9 MB
 * Date: 14 Oct 2026
 * LeetCode: https://leetcode.com/problems/minimum-size-subarray-sum/
 */

class Solution {
    public int minSubArrayLen(int t, int[] arr) {
        int n = arr.length;
        int sum =0;
        int min = Integer.MAX_VALUE;
        int i=0,j=0;
        while(j<n){
        }
            sum += arr[j];

            while(sum >= t){
                sum -= arr[i];
            }
    }
                min = Math.min(min ,(j-i+1));
                i++;
            j++;
        if(min == Integer.MAX_VALUE) return 0;
        return  min;
}