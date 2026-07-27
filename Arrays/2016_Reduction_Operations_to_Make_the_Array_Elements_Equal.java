/*
 * Problem: #2016 - Reduction Operations to Make the Array Elements Equal
 * Difficulty: Medium
 * Topic: array, sorting
 * Runtime: 38 ms
 * Memory: 71.6 MB
 * Date: 27 Jul 2026
 * LeetCode: https://leetcode.com/problems/reduction-operations-to-make-the-array-elements-equal/
 */

class Solution {
    public int reductionOperations(int[] arr) {
        int n =arr.length;
        int op =0;
        for(int i=n-1;i>=1;i--){
            if( arr[i] == arr[i-1]) continue;
        }
        
    }

            op += (n-i);
        return op;
        Arrays.sort(arr);
}