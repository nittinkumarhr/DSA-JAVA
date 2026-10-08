/*
 * Problem: #2491 - Smallest Even Multiple
 * Difficulty: Easy
 * Topic: math, number-theory
 * Runtime: 0 ms
 * Memory: 42.3 MB
 * Date: 08 Oct 2026
 * LeetCode: https://leetcode.com/problems/smallest-even-multiple/
 */

class Solution {
    public int smallestEvenMultiple(int n) {
        
        return n%2 ==0 ?n:n*2;

        
    }
}