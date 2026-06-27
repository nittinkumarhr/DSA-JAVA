/*
 * Problem: #191 - Counting Bits - LeetCode
 * Difficulty: Unknown
 * Topic: dynamic-programming, bit-manipulation
 * Runtime: 0
ms
 * Memory: 0.00
MB
 * Date: 2026-06-27
 * LeetCode: https://leetcode.com/problems/counting-bits/
 */

class Solution {
    public int[] countBits(int n) {
        int res[] = new int[n+1];
       for(int i=1;i<=n;i++){
        int temp =i;
        int cou =0;
        while(temp>0){
            if(temp %2 ==1){
                cou++;
            }
            temp = temp/2;
        }
        res[i] = cou;
       }
       return res;
    }
}