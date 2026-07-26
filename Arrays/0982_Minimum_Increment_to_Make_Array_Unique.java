/*
 * Problem: #982 - Minimum Increment to Make Array Unique
 * Difficulty: Medium
 * Topic: array, greedy, sorting, counting
 * Runtime: 43 ms
 * Memory: 80.3 MB
 * Date: 26 Jul 2026
 * LeetCode: https://leetcode.com/problems/minimum-increment-to-make-array-unique/
 */

class Solution {
    public int minIncrementForUnique(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int mov =0;
        for(int i=1;i<n;i++){
            if(arr[i]<=arr[i-1]){
        }

            }
    }
                int need = arr[i-1]+1;
                mov += need -arr[i];
                arr[i] = need;
        return mov;
}