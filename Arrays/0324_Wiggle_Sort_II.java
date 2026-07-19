/*
 * Problem: #324 - Wiggle Sort II
 * Difficulty: Medium
 * Topic: array, divide-and-conquer, greedy, sorting, quickselect
 * Runtime: 9 ms
 * Memory: 49 MB
 * Date: 19 Jul 2026
 * LeetCode: https://leetcode.com/problems/wiggle-sort-ii/
 */

class Solution {
    public void wiggleSort(int[] nums) {

        int[] temp = nums.clone();
        Arrays.sort(temp);

        int n = nums.length;

        int left = (n - 1) / 2;   // End of first half
        int right = n - 1;        // End of second half

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                nums[i] = temp[left--];
            } else {
                nums[i] = temp[right--];
            }
        }
    }
}