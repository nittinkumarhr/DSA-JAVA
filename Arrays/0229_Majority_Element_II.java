/*
 * Problem: #229 - Majority Element II
 * Difficulty: Medium
 * Topic: array, hash-table, sorting, counting, boyer-moore-majority-vote-algorithm
 * Runtime: 15 ms
 * Memory: 51.1 MB
 * Date: 15 Sept 2026
 * LeetCode: https://leetcode.com/problems/majority-element-ii/
 */

class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n = arr.length;
        }
        int threshold = n / 3;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > threshold) {
                ans.add(entry.getKey());
        return ans;
        } 
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
    }
            }
}