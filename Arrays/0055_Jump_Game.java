/*
 * Problem: #55 - Jump Game
 * Difficulty: Medium
 * Topic: array, dynamic-programming, greedy
 * Runtime: 2 ms
 * Memory: 47.9 MB
 * Date: 16 Jul 2026
 * LeetCode: https://leetcode.com/problems/jump-game/
 */

class Solution {
    public boolean canJump(int[] nums) {

        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {

            // Can't even reach this index
            if (i > maxReach) {
                return false;
            }

            // Update the farthest reachable index
            maxReach = Math.max(maxReach, i + nums[i]);

            // Optimization: already can reach the end
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }
}