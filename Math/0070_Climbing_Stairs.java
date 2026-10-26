/*
 * Problem: #70 - Climbing Stairs
 * Difficulty: Easy
 * Topic: math, dynamic-programming, memoization
 * Runtime: 0 ms
 * Memory: 41.6 MB
 * Date: 26 Oct 2026
 * LeetCode: https://leetcode.com/problems/climbing-stairs/
 */

class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int ans[] = new int[n+1];
        for(int i=3;i<=n;i++){
            ans[i]= ans[i-1]+ans[i-2];
        }
    }
        return ans[n];
        ans[1]=1;
        ans[2]=2;
}