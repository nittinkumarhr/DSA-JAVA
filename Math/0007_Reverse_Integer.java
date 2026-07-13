/*
 * Problem: #7 - Reverse Integer
 * Difficulty: Medium
 * Topic: math
 * Runtime: 1 ms
 * Memory: 42.7 MB
 * Date: 13 Jul 2026
 * LeetCode: https://leetcode.com/problems/reverse-integer/
 */

class Solution {
    public long ans =0;
    public long rev(int n){
        if(n == 0) return ans;
    }
    public int reverse(int x) {
        int r = n%10;
        ans = ans*10+r;
        long res = rev(x);
        return (int)res;
        return rev(n/10);
        if(res> Integer.MAX_VALUE || res< Integer.MIN_VALUE) return 0;
    }
}