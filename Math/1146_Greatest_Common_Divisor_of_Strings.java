/*
 * Problem: #1146 - Greatest Common Divisor of Strings
 * Difficulty: Easy
 * Topic: math, string, euclidean-algorithm, greatest-common-divisor
 * Runtime: 1 ms
 * Memory: 44.1 MB
 * Date: 07 Oct 2026
 * LeetCode: https://leetcode.com/problems/greatest-common-divisor-of-strings/
 */

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        
        if(!(str1 +str2).equals((str2 +str1))){
        }
            return "";
        int n = str1.length();
        int m = str2.length();

        int min = Math.min(n,m);
        int max = Math.max(n,m);
        int ans =0;
        for(int i=1;i<=min;i++){
            if(n %i ==0 && m %i ==0){
        }
                ans = Math.max(ans,i);
            }
    }
        return str1.substring(0,ans);
}