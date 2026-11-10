/*
 * Problem: #4135 - Concatenate Non-Zero Digits and Multiply by Sum I
 * Difficulty: Easy
 * Topic: math
 * Runtime: 1 ms
 * Memory: 42.2 MB
 * Date: 10 Nov 2026
 * LeetCode: https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i/
 */

class Solution {
    public long sumAndMultiply(int n) {
        long pow =1, res =0, sum =0;
        while(n!= 0){
            long rem = n%10;
            if(rem != 0){
                res += rem*pow;
                pow *=10;
                sum +=rem;
            }
            n=n/10;
        }
        return res *sum;        
    }
}