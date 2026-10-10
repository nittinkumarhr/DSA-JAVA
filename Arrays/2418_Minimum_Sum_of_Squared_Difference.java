/*
 * Problem: #2418 - Minimum Sum of Squared Difference
 * Difficulty: Medium
 * Topic: array, binary-search, greedy, sorting, heap-priority-queue
 * Runtime: 14 ms
 * Memory: 104.3 MB
 * Date: 10 Oct 2026
 * LeetCode: https://leetcode.com/problems/minimum-sum-of-squared-difference/
 */

if (operations <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        int level = low;
        long operationsUsed = 0;
        long answer = 0;

        // Reduce each difference to at most 'level'.
        for (int d : diff) {
            int reduced = Math.min(d, level);

            operationsUsed += d - reduced;
            answer += (long) reduced * reduced;
        }

        // Use remaining operations to reduce some
        // differences from level to level - 1.
        long remaining = k - operationsUsed;

        answer -= remaining * (2L * level - 1);

        return answer;
    }
}