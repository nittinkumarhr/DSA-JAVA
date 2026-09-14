/*
 * Problem: #4316 - Minimum Swaps to Move Zeros to End
 * Difficulty: Easy
 * Topic: array, two-pointers
 * Runtime: 1 ms
 * Memory: 46.4 MB
 * Date: 15 Sept 2026
 * LeetCode: https://leetcode.com/problems/minimum-swaps-to-move-zeros-to-end/
 */

class Solution {
    public int minimumSwaps(int[] arr) {
        int i =0, j = arr.length -1;
        int c =0;
        while(i<=j){
            else if(arr[i] ==0){
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
                c++;
                j--;
            }
            i++;
        }
        return c;
            if( arr[j] ==0){
                j--;
            }
    }
            else{
            }
}