/*
 * Problem: #892 - Shortest Subarray with Sum at Least K
 * Difficulty: Hard
 * Topic: array, binary-search, queue, sliding-window, heap-priority-queue, prefix-sum, monotonic-queue
 * Runtime: 22 ms
 * Memory: 66.7 MB
 * Date: 13 Oct 2026
 * LeetCode: https://leetcode.com/problems/shortest-subarray-with-sum-at-least-k/
 */

int ans = n + 1;
        for (int i = 0; i <= n; i++) {
        }
        Deque<Integer> deque = new ArrayDeque<>();
            // Case 1: Found a subarray with sum >= k
            while (!deque.isEmpty()
                    && prefix[i] - prefix[deque.peekFirst()] >= k) {

                ans = Math.min(ans, i - deque.pollFirst());
            }
            // Case 2: Remove useless prefix sums
            while (!deque.isEmpty()
                    && prefix[i] <= prefix[deque.peekLast()]) {
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];

                deque.pollLast();
            }
            // Store current prefix index
            deque.offerLast(i);
        }
        return ans == n + 1 ? -1 : ans;
        long[] prefix = new long[n + 1];
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
class Solution {
    }
}