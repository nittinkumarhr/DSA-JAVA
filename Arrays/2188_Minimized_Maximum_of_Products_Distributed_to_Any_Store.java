/*
 * Problem: #2188 - Minimized Maximum of Products Distributed to Any Store
 * Difficulty: Medium
 * Topic: array, binary-search, greedy
 * Runtime: 22 ms
 * Memory: 81.1 MB
 * Date: 01 Oct 2026
 * LeetCode: https://leetcode.com/problems/minimized-maximum-of-products-distributed-to-any-store/
 */

int mid = low + (high - low) / 2;
            if (canDistribute(mid, n, quantities)) {
                high = mid; // Try to find a smaller maximum
            } else {
                low = mid + 1; // Increase the allowed maximum per store
            }
        }
        return low;
    }
    private boolean canDistribute(int maxPerStore, int totalStores, int[] quantities) {
        int storesNeeded = 0;
        for (int quantity : quantities) {
            storesNeeded += (quantity + maxPerStore - 1) / maxPerStore;
            if (storesNeeded > totalStores) {
                return false;
            }
        while (low < high) {
        }
        return true;
        int high = 0;
        int low = 1;
    public int minimizedMaximum(int n, int[] quantities) {
class Solution {
import java.util.Arrays;
        for(int q :quantities){
            high = Math.max(high,q);
        }
    }
}