/*
 * Problem: #3644 - Minimum Positive Sum Subarray 
 * Difficulty: Easy
 * Topic: array, sliding-window, prefix-sum
 * Runtime: 17 ms
 * Memory: 46.5 MB
 * Date: 14 Nov 2026
 * LeetCode: https://leetcode.com/problems/minimum-positive-sum-subarray/
 */

class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int[] pre = new int[nums.size() + 1];  
        for (int i = 0; i < nums.size(); i++) pre[i + 1] = pre[i] + nums.get(i);
        return IntStream.rangeClosed(l, r)
            .flatMap(k -> IntStream.range(0, pre.length - k).map(i -> pre[i + k] - pre[i]))
            .filter(s -> s > 0)
            .min()
            .orElse(-1);
    }
}