/*
 * Problem: #503 - Next Greater Element II
 * Difficulty: Medium
 * Topic: array, stack, monotonic-stack
 * Runtime: 90 ms
 * Memory: 47.8 MB
 * Date: 15 Sept 2026
 * LeetCode: https://leetcode.com/problems/next-greater-element-ii/
 */

class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            int item = arr[i];
            int val = -1; // Default fallback if no greater element exists
            
            // Look at the next n-1 elements circularly
            for (int j = 1; j < n; j++) {
                int circularIndex = (i + j) % n;
                if (arr[circularIndex] > item) {
                    val = arr[circularIndex];
                    break; // Found the very next greater element
                }
            }
            ans[i] = val;
        }
        return ans;
    }
}