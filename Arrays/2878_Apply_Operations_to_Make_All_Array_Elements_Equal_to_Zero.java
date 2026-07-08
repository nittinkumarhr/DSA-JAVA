/*
 * Problem: #2878 - Apply Operations to Make All Array Elements Equal to Zero
 * Difficulty: Medium
 * Topic: array, prefix-sum
 * Runtime: 1 ms
 * Memory: 109.3 MB
 * Date: 08 Jul 2026
 * LeetCode: https://leetcode.com/problems/apply-operations-to-make-all-array-elements-equal-to-zero/
 */

class Solution {
    public boolean checkArray(int[] nums, int k) {
        if (k == 1) return true;

        int curSum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] -= curSum; // get the latest value of the current element 
            if (nums[i] < 0) return false; // previous k - 1 elements decreased the current element 
            more than they should
            // update the cursum by adding the current element, and deleting the k - 1 th element
            curSum += nums[i];
            if (i - (k - 1) >= 0) curSum -= nums[i - (k - 1)];
        }

        return nums[n - 1] == 0;
    }
}