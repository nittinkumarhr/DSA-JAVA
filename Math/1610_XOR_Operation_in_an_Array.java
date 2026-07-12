/*
 * Problem: #1610 - XOR Operation in an Array
 * Difficulty: Easy
 * Topic: math, bit-manipulation
 * Runtime: 0 ms
 * Memory: 42.5 MB
 * Date: 13 Jul 2026
 * LeetCode: https://leetcode.com/problems/xor-operation-in-an-array/
 */

class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = start + 2*i;
        }

        int xor = nums[0];
        for(int i=1;i<n;i++){
            xor = xor^nums[i];
        }

        return xor;   
    }
}