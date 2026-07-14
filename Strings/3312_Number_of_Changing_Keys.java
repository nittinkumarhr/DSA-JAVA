/*
 * Problem: #3312 - Number of Changing Keys
 * Difficulty: Easy
 * Topic: string
 * Runtime: 1 ms
 * Memory: 43.5 MB
 * Date: 15 Jul 2026
 * LeetCode: https://leetcode.com/problems/number-of-changing-keys/
 */

class Solution {
    public int countKeyChanges(String s) {
        s=s.toLowerCase();
        int ans=0;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(i-1))
            ans++;

        }
        return ans;
    }
}