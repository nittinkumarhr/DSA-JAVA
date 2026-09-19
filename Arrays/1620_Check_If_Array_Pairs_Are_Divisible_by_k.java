/*
 * Problem: #1620 - Check If Array Pairs Are Divisible by k
 * Difficulty: Medium
 * Topic: array, hash-table, counting
 * Runtime: 4 ms
 * Memory: 84.5 MB
 * Date: 19 Sept 2026
 * LeetCode: https://leetcode.com/problems/check-if-array-pairs-are-divisible-by-k/
 */

class Solution {
    public boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        int ans[] = new int [k];
        for(int i=0;i<n;i++){
            int op = ((arr[i]%k)+k)%k;
             ans[op]++;
        }
        int c=0;
        for(int i=1;i < k;i++){
            if(ans[i] != ans[pat]){
        }
                
            }
        return true;
            int pat = k-i;
                return false;
         if(ans[0] %2 !=0){
                return false;
        }
    }
}