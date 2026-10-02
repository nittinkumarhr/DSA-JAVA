/*
 * Problem: #1675 - Magnetic Force Between Two Balls
 * Difficulty: Medium
 * Topic: array, binary-search, sorting
 * Runtime: 46 ms
 * Memory: 79.4 MB
 * Date: 02 Oct 2026
 * LeetCode: https://leetcode.com/problems/magnetic-force-between-two-balls/
 */

class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l = 1, r = position[position.length - 1] - position[0];
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int lastPosition = position[0], balls = 1;
            for (int i = 1; i < position.length; i++) {
                if (position[i] - lastPosition >= mid) {
                    lastPosition = position[i];
                    balls++;
                }
            }
            if (balls >= m) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}