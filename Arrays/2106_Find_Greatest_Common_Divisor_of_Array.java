/*
 * Problem: #2106 - Find Greatest Common Divisor of Array
 * Difficulty: Easy
 * Topic: array, math, number-theory, euclidean-algorithm, greatest-common-divisor
 * Runtime: 0 ms
 * Memory: 45.2 MB
 * Date: 07 Oct 2026
 * LeetCode: https://leetcode.com/problems/find-greatest-common-divisor-of-array/
 */

class Solution {
    public int findGCD(int[] nums) {
        int max =1;
        int min =1000;
        for(int i :nums){
            max =Math.max(max,i);
            min = Math.min(min ,i);
        }
        for(int i=1;i<=min;i++){
            if(min%i ==0 && max%i ==0){
        }
        int ans =0;
                ans = Math.max(ans,i);
            }
    }
        return ans;
}