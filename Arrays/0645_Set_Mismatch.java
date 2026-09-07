/*
 * Problem: #645 - Set Mismatch
 * Difficulty: Easy
 * Topic: array, hash-table, bit-manipulation, sorting
 * Runtime: 15 ms
 * Memory: 48.4 MB
 * Date: 07 Sept 2026
 * LeetCode: https://leetcode.com/problems/set-mismatch/
 */

class Solution {
    public int[] findErrorNums(int[] arr) {
        int res[] = new int[2];
        for(int i =0;i<arr.length-1;i++){
        if((arr[i] ^ arr[i+1])== 0){
            res[0] = arr[i]; 
        }
        }
        return res;
        Arrays.sort(arr);
        res[1] = uniq;
        for(int i=0;i<arr.length;i++){
            if( uniq == arr[i]) ++uniq;
        }
    }
        int uniq =1;
            break;
}