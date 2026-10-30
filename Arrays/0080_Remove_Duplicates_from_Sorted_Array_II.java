/*
 * Problem: #80 - Remove Duplicates from Sorted Array II
 * Difficulty: Medium
 * Topic: array, two-pointers
 * Runtime: 1 ms
 * Memory: 48.3 MB
 * Date: 30 Oct 2026
 * LeetCode: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int occurance = 1;
        for(int i=1; i < nums.length; i++){
            if (nums[i] == nums[i-1]){
                occurance++;
            }else{
                occurance = 1;
            }
            if (occurance <= 2){
                nums[index] = nums[i];
                index++;
            }
        }  
        return index;
    }
}