/*
 * Problem: #2137 - Final Value of Variable After Performing Operations
 * Difficulty: Easy
 * Topic: array, string, simulation
 * Runtime: 1 ms
 * Memory: 44.1 MB
 * Date: 17 Sept 2026
 * LeetCode: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
 */

class Solution {
    public int finalValueAfterOperations(String[] op) {
        int count =0;
        for(String s : op){

            if( s.equals("X++") || s.equals("++X")){
        }
        
                count++;
            }
            else {
                count--;
            }
    }
        return count;
}