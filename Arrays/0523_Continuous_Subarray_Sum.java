/*
 * Problem: #523 - Continuous Subarray Sum
 * Difficulty: Medium
 * Topic: array, hash-table, math, prefix-sum
 * Runtime: 24 ms
 * Memory: 139.8 MB
 * Date: 05 Jul 2026
 * LeetCode: https://leetcode.com/problems/continuous-subarray-sum/
 */

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        // Map: remainder -> first index where it appeared
        HashMap<Integer, Integer> map = new HashMap<>();
        // important base case
        map.put(0, -1);
        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += nums[i];
            int rem;
            // handle k = 0 case safely (not needed in this problem usually, but safe)
            if (k != 0) {
                rem = prefixSum % k;
            } else {
                rem = prefixSum;
            }
            if (map.containsKey(rem)) {
                int prevIndex = map.get(rem);
                // check length >= 2
                if (i - prevIndex >= 2) {
                    return true;
                }
            } else {
                // store first occurrence only
                map.put(rem, i);
            }
        }