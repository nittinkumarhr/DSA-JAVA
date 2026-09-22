/*
 * Problem: #713 - Subarray Product Less Than K
 * Difficulty: Medium
 * Topic: array, binary-search, sliding-window, prefix-sum
 * Runtime: 3 ms
 * Memory: 48.9 MB
 * Date: 22 Sept 2026
 * LeetCode: https://leetcode.com/problems/subarray-product-less-than-k/
 */

class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
       if(k<=1)return 0;
       int n = arr.length;
       int l =0;
       long mul =1;
       int count =0;
       for(int j =0;j<n;j++){
        mul *= arr[j];
       }
        while(mul>=k){
            mul /= arr[l];
        }
    }
            l++;
        count += j-l +1;
       return count ;
}