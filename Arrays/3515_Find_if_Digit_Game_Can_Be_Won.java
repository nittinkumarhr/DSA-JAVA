/*
 * Problem: #3515 - Find if Digit Game Can Be Won
 * Difficulty: Easy
 * Topic: array, math
 * Runtime: 1 ms
 * Memory: 45.3 MB
 * Date: 06 Aug 2026
 * LeetCode: https://leetcode.com/problems/find-if-digit-game-can-be-won/
 */

class Solution {
    public boolean canAliceWin(int[] arr) {
        int n = arr.length;
        int two_d=0;
        int sing_d=0;
        for(int i =0;i<n;i++){
            if( arr[i]>=0 && arr[i]<=9){
                sing_d += arr[i];
            }
            else {
             two_d +=arr[i];
            }
        }
        if(sing_d == two_d){
            return false;
        }
        return true;
    }
}