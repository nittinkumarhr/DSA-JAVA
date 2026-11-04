/*
 * Problem: #2670 - Make K-Subarray Sums Equal
 * Difficulty: Medium
 * Topic: array, math, greedy, sorting, number-theory
 * Runtime: 115 ms
 * Memory: 100.3 MB
 * Date: 04 Nov 2026
 * LeetCode: https://leetcode.com/problems/make-k-subarray-sums-equal/
 */

class Solution {
   public long makeSubKSumEqual(int[] arr, int k) {
    long res = 0;
    for (int i = 0; i < k; ++i) {
        List<Integer> cycle = new ArrayList<>();
        for (int j = i; arr[j] != 0; j = (j + k) % arr.length) {
            cycle.add(arr[j]);
            arr[j] = 0;
        }
        Collections.sort(cycle);
        for (int n : cycle)
            res += Math.abs(n - cycle.get(cycle.size() / 2));
    }
    return res;
}
}