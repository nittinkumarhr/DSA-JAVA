/*
 * Problem: #18 - 4Sum
 * Difficulty: Medium
 * Topic: array, two-pointers, sorting
 * Runtime: 20 ms
 * Memory: 45.9 MB
 * Date: 08 Aug 2026
 * LeetCode: https://leetcode.com/problems/4sum/
 */

Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n- 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int l = j + 1, r = n- 1;
                while (l < r) {
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == target) {
                        ans.add(List.of(nums[i], nums[j], nums[l], nums[r]));
                        while (l < r && nums[l] == nums[++l]);
                        while (l < r && nums[r] == nums[--r]);
                    } else if (sum < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n= nums.length;
        return ans;
    }
}