/*
 * Problem: #2392 - Successful Pairs of Spells and Potions
 * Difficulty: Medium
 * Topic: array, two-pointers, binary-search, sorting
 * Runtime: 53 ms
 * Memory: 146.8 MB
 * Date: 10 Aug 2026
 * LeetCode: https://leetcode.com/problems/successful-pairs-of-spells-and-potions/
 */

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {
            int idx = bs(potions, spells[i], success);
            if (idx != -1) ans[i] = potions.length - idx;
        }

        return ans;
    }

    int bs(int potions[], long strength, long success) {
        int low = 0, high = potions.length - 1, idx = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((long) potions[mid] * strength >= success) {
                idx = mid;
                high = mid - 1; // find smaller index
            } else {
                low = mid + 1;
            }
        }
        return idx;
    }
}