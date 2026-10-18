/*
 * Problem: #3656 - Minimum Number of Operations to Make Elements in Array Distinct
 * Difficulty: Easy
 * Topic: array, hash-table
 * Runtime: 2 ms
 * Memory: 45.8 MB
 * Date: 18 Oct 2026
 * LeetCode: https://leetcode.com/problems/minimum-number-of-operations-to-make-elements-in-array-distinct/
 */

class Solution {
    public int minimumOperations(int[] arr) {
        int n = arr.length;
        HashSet<Integer> seen = new HashSet<>();
        for (int i = n - 1; i >= 0; i--) {
            if (seen.contains(arr[i])) {
                return (i /3) +1; 
            }
            seen.add(arr[i]);
        }        
        return 0;
    }
}