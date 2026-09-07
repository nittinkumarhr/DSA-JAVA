/*
 * Problem: #287 - Find the Duplicate Number
 * Difficulty: Medium
 * Topic: array, two-pointers, binary-search, bit-manipulation, pigeonhole-principle, floyds-cycle-finding-algorithm
 * Runtime: 38 ms
 * Memory: 79.4 MB
 * Date: 07 Sept 2026
 * LeetCode: https://leetcode.com/problems/find-the-duplicate-number/
 */

class Solution {
    public int findDuplicate(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            if( (arr[i] ^ arr[i+1]) == 0){
                return arr[i];
            }
        }
    }
        return 0;
        Arrays.sort(arr);
}