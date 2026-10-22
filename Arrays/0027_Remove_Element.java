/*
 * Problem: #27 - Remove Element
 * Difficulty: Easy
 * Topic: array, two-pointers
 * Runtime: 0 ms
 * Memory: 42.5 MB
 * Date: 22 Oct 2026
 * LeetCode: https://leetcode.com/problems/remove-element/
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;        
    }
}