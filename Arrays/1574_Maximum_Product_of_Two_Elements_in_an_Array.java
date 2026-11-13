/*
 * Problem: #1574 - Maximum Product of Two Elements in an Array
 * Difficulty: Easy
 * Topic: array, sorting, heap-priority-queue
 * Runtime: 1 ms
 * Memory: 44.1 MB
 * Date: 13 Nov 2026
 * LeetCode: https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
 */

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int i=0;i<n;i++){
            if(max  < nums[i]){
        }
        int max_ind = 0;
                max = nums[i];
            }
                max_ind =i;
        int mul = 0;
        for(int i=0;i<n;i++){
            if(max_ind != i){
        }
            }
    }
                mul = Math.max(mul ,((nums[max_ind]-1) *(nums[i]-1)));
        return mul;
}