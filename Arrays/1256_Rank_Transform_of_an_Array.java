/*
 * Problem: #1256 - Rank Transform of an Array
 * Difficulty: Easy
 * Topic: array, hash-table, sorting
 * Runtime: 31 ms
 * Memory: 76.5 MB
 * Date: 20 Oct 2026
 * LeetCode: https://leetcode.com/problems/rank-transform-of-an-array/
 */

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        HashMap<Integer, Integer> rank = new HashMap<>();
        int currentRank = 1;
        for (int num : sorted) {
            if (!rank.containsKey(num)) {
                rank.put(num, currentRank++);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rank.get(arr[i]);
        }
        return arr;
    }
}