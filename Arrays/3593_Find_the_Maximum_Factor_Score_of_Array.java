/*
 * Problem: #3593 - Find the Maximum Factor Score of Array
 * Difficulty: Medium
 * Topic: array, math, number-theory, least-common-multiple
 * Runtime: 2 ms
 * Memory: 45 MB
 * Date: 10 Oct 2026
 * LeetCode: https://leetcode.com/problems/find-the-maximum-factor-score-of-array/
 */

for (int i = 0; i < n; i++) {
            prefixGcd[i + 1] = gcd(prefixGcd[i], nums[i]);
            prefixLcm[i + 1] = lcm(prefixLcm[i], nums[i]);
        }

        suffixGcd[n] = 0;
        suffixLcm[n] = 1;

        for (int i = n - 1; i >= 0; i--) {
            suffixGcd[i] = gcd(suffixGcd[i + 1], nums[i]);
            suffixLcm[i] = lcm(suffixLcm[i + 1], nums[i]);
        }

        long ans = prefixGcd[n] * prefixLcm[n];

        for (int i = 0; i < n; i++) {
            long g = gcd(prefixGcd[i], suffixGcd[i + 1]);
            long l = lcm(prefixLcm[i], suffixLcm[i + 1]);

            ans = Math.max(ans, g * l);
        }

        return ans;
    }
}