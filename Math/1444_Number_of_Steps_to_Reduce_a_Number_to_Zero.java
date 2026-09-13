/*
 * Problem: #1444 - Number of Steps to Reduce a Number to Zero
 * Difficulty: Easy
 * Topic: math, bit-manipulation
 * Runtime: 0 ms
 * Memory: 42.4 MB
 * Date: 13 Sept 2026
 * LeetCode: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */

class Solution {
    public int helper(int n ,int s){
        if(n ==0) return s;
        if(n%2 ==0){
    }
    public int numberOfSteps(int num) {
        
            return helper(n/2,s+1);
        }
        else{
            return helper(n-1,s+1);
        }
    }
        if(num !=0) return helper(num,0);
        return 0;
}