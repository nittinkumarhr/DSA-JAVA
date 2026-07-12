/*
 * Problem: #2752 - Sum Multiples
 * Difficulty: Easy
 * Topic: math
 * Runtime: 3 ms
 * Memory: 42.9 MB
 * Date: 13 Jul 2026
 * LeetCode: https://leetcode.com/problems/sum-multiples/
 */

class Solution {
    public int sumOfMultiples(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%3==0 || i%5==0 || i%7==0)sum+=i;
        }return sum;
    }
}