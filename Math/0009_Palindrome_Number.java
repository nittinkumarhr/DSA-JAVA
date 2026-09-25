/*
 * Problem: #9 - Palindrome Number
 * Difficulty: Easy
 * Topic: math
 * Runtime: 5 ms
 * Memory: 45.9 MB
 * Date: 25 Sept 2026
 * LeetCode: https://leetcode.com/problems/palindrome-number/
 */

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int original = x;
        int rev = 0;
        while(x != 0){
            int digit = x % 10;
            if(rev > Integer.MAX_VALUE / 10 ||
              (rev == Integer.MAX_VALUE / 10 && digit > 7)){
                return false;
            }
            rev = rev * 10 + digit;
            x /= 10;
        }
        return original == rev;
    }
}