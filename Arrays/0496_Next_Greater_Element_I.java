/*
 * Problem: #496 - Next Greater Element I
 * Difficulty: Easy
 * Topic: array, hash-table, stack, monotonic-stack
 * Runtime: 3 ms
 * Memory: 45.4 MB
 * Date: 15 Sept 2026
 * LeetCode: https://leetcode.com/problems/next-greater-element-i/
 */

int n = nums1.length;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            int item = nums1[i];

            if (res.containsKey(item)) {
            } else {
                ans[i] = -1;
            }
        }
                int idx = res.get(item) + 1;
                while (idx < nums2.length) {
                    if (item < nums2[idx]) {
                }
                        break;
                    }
                    idx++;
                        ans[i] = nums2[idx];
                if (idx == nums2.length) {
                    ans[i] = -1;
                }
        return ans;
    }
}