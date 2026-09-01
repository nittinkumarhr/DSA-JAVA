/*
 * Problem: #1741 - Sort Array by Increasing Frequency
 * Difficulty: Easy
 * Topic: array, hash-table, sorting
 * Runtime: 6 ms
 * Memory: 45.6 MB
 * Date: 01 Sept 2026
 * LeetCode: https://leetcode.com/problems/sort-array-by-increasing-frequency/
 */

class Solution {
     public int[] frequencySort(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map =new HashMap<>();
        for (int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);
        ArrayList<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet())
            arr.add(new int[] {e.getKey(), e.getValue()});
        arr.sort((a, b) -> {if (a[1] != b[1]) // freq not equal so ascending
                                return a[1] - b[1];
                            return b[0] - a[0];}); // eqqual descending
        int[] ans = new int[n];
        int idx = 0;
        for (int[] i : arr)
            for (int j = 0; j < i[1]; j++)
                ans[idx++] = i[0];
        return ans;
    }
}