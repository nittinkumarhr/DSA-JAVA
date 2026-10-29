/*
 * Problem: #1346 - Maximize the Topmost Element After K Moves
 * Difficulty: Medium
 * Topic: array, greedy
 * Runtime: 1 ms
 * Memory: 78.3 MB
 * Date: 29 Oct 2026
 * LeetCode: https://leetcode.com/problems/maximize-the-topmost-element-after-k-moves/
 */

public int maximumTop(int[] nums, int k) {
        int n = nums.length, max = -1;
        
        if(n==1){
            if(k%2==1)  return -1;
            else    return nums[0];
        }
        
        if(k<n) max = nums[k];
        else if(k>n)    k = n+1;
        
        for (int i = 0; i < k-1; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}
class Solution {