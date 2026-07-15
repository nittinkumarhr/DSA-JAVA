/*
 * Problem: #454 - 4Sum II
 * Difficulty: Medium
 * Topic: array, hash-table
 * Runtime: 127 ms
 * Memory: 46.8 MB
 * Date: 15 Jul 2026
 * LeetCode: https://leetcode.com/problems/4sum-ii/
 */

public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        // Store sum of nums1 + nums2 and its frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        // Step 1: Calculate all possible sums of nums1 and nums2
        for (int a : nums1) {
            for (int b : nums2) {
                int sum = a + b;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        int count = 0;
        // Step 2: Find complementary sums from nums3 and nums4
        for (int c : nums3) {
            for (int d : nums4) {

                int sum = c + d;
                int need = -sum;

                if (map.containsKey(need)) {
                    count += map.get(need);
                }
            }
        }
        return count;
    }
}
class Solution {