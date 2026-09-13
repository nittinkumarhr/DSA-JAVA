/*
 * Problem: #1303 - Minimum Moves to Reach Target Score
 * Difficulty: Medium
 * Topic: math, greedy
 * Runtime: 0 ms
 * Memory: 42.4 MB
 * Date: 13 Sept 2026
 * LeetCode: https://leetcode.com/problems/minimum-moves-to-reach-target-score/
 */

class Solution {
    public int helper(int t,int md,int c){
    public int minMoves(int t, int md) {
        if(md ==0 ){
            return t-1;
        }
        return helper(t,md,0);
        
        if(md==0 && t!= 1){
    }
            return c+(t-1);
        }
        if(t%2 ==0){
            return helper(t/2,md-1,c+1);
        }
        else{
            return helper(t-1,md,c+1);
        }
        if(t ==1){
            return c;
        }
    }
}