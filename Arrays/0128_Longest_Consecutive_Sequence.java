/*
 * Problem: #128 - Longest Consecutive Sequence
 * Difficulty: Medium
 * Topic: array, hash-table, union-find
 * Runtime: 30 ms
 * Memory: 95.7 MB
 * Date: 14 Jul 2026
 * LeetCode: https://leetcode.com/problems/longest-consecutive-sequence/
 */

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) 
            return 0;
        Set<Integer> h = new HashSet<>();
        for (int num : nums) 
            h.add(num);
        int lStreak = 0;
        for (int num : h)
            if (!h.contains(num - 1)) {
                int numm = num;
                int cStreak = 1;
                while (h.contains(numm + 1)) {
                    numm++;
                    cStreak++;
                }
                lStreak = Math.max(lStreak, cStreak);
            }
        return lStreak;
    }
}