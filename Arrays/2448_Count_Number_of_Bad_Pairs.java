/*
 * Problem: #2448 - Count Number of Bad Pairs
 * Difficulty: Medium
 * Topic: array, hash-table, math, counting
 * Runtime: 43 ms
 * Memory: 87.7 MB
 * Date: 08 Sept 2026
 * LeetCode: https://leetcode.com/problems/count-number-of-bad-pairs/
 */

class Solution {
    public long countBadPairs(int[] arr) {
        int n = arr.length;
        long totalParis = (long)n*(n-1)/2;
          HashMap<Long, Long> map = new HashMap<>();
        for(int i=0;i<n;i++){

        }
        return totalParis - goodParis;
    }
          long goodParis=0;
            long key =(long) i-arr[i];
            goodParis += map.getOrDefault(key,0L);
            map.put(key, map.getOrDefault(key, 0L) + 1);
}