/*
 * Problem: #1605 - Minimum Number of Days to Make m Bouquets
 * Difficulty: Medium
 * Topic: array, binary-search
 * Runtime: 19 ms
 * Memory: 82.5 MB
 * Date: 07 Aug 2026
 * LeetCode: https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
 */

public int minDays(int[] arr, int m, int k) {
        // Edge case: If you need more flowers than available in total
        // preventing integer overflow during comparison
        if ((long) m * k > arr.length) {
            return -1;
        }

        int n = arr.length;
        int r = -1;
        for (int i = 0; i < n; i++) {
            r = Math.max(r, arr[i]);
        }
        int mind = -1;
        int l = 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            // CHANGE: Check if we can make AT LEAST m bouquets
            if (CanMake(arr, mid, k) >= m) { 
                mind = mid;
                r = mid - 1; // Try to find a smaller number of days
            } else {
                l = mid + 1;
            }
        }
        return mind;
    }
}