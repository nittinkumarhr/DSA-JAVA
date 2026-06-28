/*
 * Problem: #487 - Max Consecutive Ones III - LeetCode
 * Difficulty: Unknown
 * Topic: array, binary-search, sliding-window, prefix-sum
 * Runtime: 0
ms
 * Memory: 0.00
MB
 * Date: 2026-06-28
 * LeetCode: https://leetcode.com/problems/max-consecutive-ones-iii/
 */

class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0;
        int end=0;
        int zeros=0;

        while(end<nums.length){
            if(nums[end] == 0){
                zeros++;
            }
            end++;
            if(zeros>k){
                if(nums[start] == 0){
                    zeros--;
                }
                start++;
            }
        }
        return end-start;
    }
}