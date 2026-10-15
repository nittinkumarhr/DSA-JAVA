/*
 * Problem: #718 - Maximum Length of Repeated Subarray
 * Difficulty: Medium
 * Topic: array, binary-search, dynamic-programming, sliding-window, rolling-hash, hash-function
 * Runtime: 1490 ms
 * Memory: 44.9 MB
 * Date: 15 Oct 2026
 * LeetCode: https://leetcode.com/problems/maximum-length-of-repeated-subarray/
 */

class Solution {
    public int findLength(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;
        int maxLen = 0;

        for (int i = 0; i < n1; i++) {

            for (int j = 0; j < n2; j++) {

                int k = 0;

                while ((i + k < n1) &&
                       (j + k < n2) &&
                       nums1[i + k] == nums2[j + k]) {
                    k++;
                }

                maxLen = Math.max(maxLen, k);
            }
        }

        return maxLen;
    }
}