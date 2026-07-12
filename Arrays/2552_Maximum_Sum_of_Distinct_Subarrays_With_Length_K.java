/*
 * Problem: #2552 - Maximum Sum of Distinct Subarrays With Length K
 * Difficulty: Medium
 * Topic: array, hash-table, sliding-window
 * Runtime: 60 ms
 * Memory: 99 MB
 * Date: 12 Jul 2026
 * LeetCode: https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/
 */

Map<Integer, Integer> freq = new HashMap<>();
        long sum = 0;
        long maxSum = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            // Add current element into the window
            sum += nums[right];
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);

            // If window size exceeds k, remove from left
            if (right - left + 1 > k) {
                freq.put(nums[left], freq.get(nums[left]) - 1);
                if (freq.get(nums[left]) == 0) {
                    freq.remove(nums[left]);
                }
                sum -= nums[left];
                left++;
            }

            // Check if current window is valid
            if (right - left + 1 == k && freq.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}