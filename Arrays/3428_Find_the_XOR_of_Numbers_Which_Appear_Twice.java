/*
 * Problem: #3428 - Find the XOR of Numbers Which Appear Twice
 * Difficulty: Easy
 * Topic: array, hash-table, bit-manipulation
 * Runtime: 5 ms
 * Memory: 44.6 MB
 * Date: 16 Sept 2026
 * LeetCode: https://leetcode.com/problems/find-the-xor-of-numbers-which-appear-twice/
 */

class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int num = 0;
        for(int i=1;i<n;i++)
            {
                if(nums[i]==nums[i-1])
                {
                    num = num^nums[i];
                }
            }
        return num;
    }
}