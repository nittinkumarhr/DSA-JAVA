/*
 * Problem: #134 - Gas Station
 * Difficulty: Medium
 * Topic: array, greedy
 * Runtime: 2 ms
 * Memory: 118.7 MB
 * Date: 28 Oct 2026
 * LeetCode: https://leetcode.com/problems/gas-station/
 */

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(g_sum < c_sum)return -1;
        int n = gas.length;
        int m = cost.length;
        for(int i=0;i<n;i++){
            g_sum += gas[i];
        }
        int g_sum = 0;
        int c_sum = 0;
        for(int i=0;i<n;i++){
             c_sum += cost[i];

        int cur = 0 ,indx =0;
            cur += gas[i] - cost[i];
        }
            if(cur <0){
                indx =i+1;
            }
    }
                cur =0;
        return indx;
}