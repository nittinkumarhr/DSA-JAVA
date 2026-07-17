/*
 * Problem: #179 - Largest Number
 * Difficulty: Medium
 * Topic: array, string, greedy, sorting
 * Runtime: 6 ms
 * Memory: 45.1 MB
 * Date: 17 Jul 2026
 * LeetCode: https://leetcode.com/problems/largest-number/
 */

import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {

        String[] arr = new String[nums.length];

        // Convert integers to strings
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Custom sorting
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // If the largest element is "0", the answer is "0"
        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            sb.append(s);
        }

        return sb.toString();
    }
}