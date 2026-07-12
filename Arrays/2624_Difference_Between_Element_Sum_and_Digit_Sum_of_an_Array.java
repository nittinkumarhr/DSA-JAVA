/*
 * Problem: #2624 - Difference Between Element Sum and Digit Sum of an Array
 * Difficulty: Easy
 * Topic: array, math
 * Runtime: 2 ms
 * Memory: 46.4 MB
 * Date: 12 Jul 2026
 * LeetCode: https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/
 */

public class Solution {
    public int differenceOfSum(int[] nums) {
        int totalSum = 0;
        int digitSum = 0;

        for (int num : nums) {
            totalSum += num;
 
            while (num > 0) {
                digitSum += num % 10;
                num /= 10;}
        }

        return totalSum - digitSum;}
}