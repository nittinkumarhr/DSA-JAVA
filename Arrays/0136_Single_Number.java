/*
 * Problem: #136 - Single Number
 * Difficulty: Easy
 * Topic: array, bit-manipulation
 * Runtime: 1 ms
 * Memory: 46.6 MB
 * Date: 02 Aug 2026
 * LeetCode: https://leetcode.com/problems/single-number/
 */

class Solution {
    public int singleNumber(int[] nums) {
        int uique =0;
        for(int i : nums){
            uique ^=i;
        }
        return uique;
        
    }
}