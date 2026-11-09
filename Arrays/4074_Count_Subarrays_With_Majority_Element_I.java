/*
 * Problem: #4074 - Count Subarrays With Majority Element I
 * Difficulty: Medium
 * Topic: array, hash-table, divide-and-conquer, segment-tree, merge-sort, counting, prefix-sum
 * Runtime: 50 ms
 * Memory: 46.5 MB
 * Date: 09 Nov 2026
 * LeetCode: https://leetcode.com/problems/count-subarrays-with-majority-element-i/
 */

class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
           int n = nums.length;
        int validSubarrays = 0;
        // Iterate through all possible starting positions (i)
        for (int i = 0; i < n; i++) {
            int count = 0; // To store occurrences of 'target' in the current window
            // Iterate through all possible ending positions (j)
            for (int j = i; j < n; j++) {
                // If the current element is the target, increment count
                if (nums[j] == target) {
                    count++;
                }
                // Calculate the current subarray length
                int currentLength = j - i + 1;
                // Check if 'target' appears strictly more than half the time
                // Note: In integer arithmetic, length / 2 performs floor division.
                // e.g., 5 / 2 = 2. If count > 2, then count is 3 or more.
                if (count > currentLength / 2) {
                    validSubarrays++;
                }
            }
        }
        return validSubarrays;
    }
}