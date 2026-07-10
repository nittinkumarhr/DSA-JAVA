/*
 * Problem: #3226 - Minimum Number Game
 * Difficulty: Easy
 * Topic: array, sorting, heap-priority-queue, simulation
 * Runtime: 5 ms
 * Memory: 47.3 MB
 * Date: 11 Jul 2026
 * LeetCode: https://leetcode.com/problems/minimum-number-game/
 */

import java.util.Arrays;

public class Solution {
    public int[] numberGame(int[] v) {
        int n = v.length;
        Arrays.sort(v);
        for (int i = 0; i < n; i += 2) {
            if (i + 1 < n) {
                int temp = v[i];
                v[i] = v[i + 1];
                v[i + 1] = temp;
            }
        }
        return v;
    }
}