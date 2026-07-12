/*
 * Problem: #2608 - Count the Digits That Divide a Number
 * Difficulty: Easy
 * Topic: math
 * Runtime: 0 ms
 * Memory: 42.2 MB
 * Date: 12 Jul 2026
 * LeetCode: https://leetcode.com/problems/count-the-digits-that-divide-a-number/
 */

class Solution {
    public int countDigits(int num) {
        int temp=num;
        int count=0;
        while(temp>0)
        {
            int rem=temp%10;
            temp=temp/10;
            if(num % rem==0)
            {
                count++;
            }
        }
        return count;
    }
}