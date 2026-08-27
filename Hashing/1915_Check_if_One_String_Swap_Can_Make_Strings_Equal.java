/*
 * Problem: #1915 - Check if One String Swap Can Make Strings Equal
 * Difficulty: Easy
 * Topic: hash-table, string, counting
 * Runtime: 0 ms
 * Memory: 42.9 MB
 * Date: 27 Aug 2026
 * LeetCode: https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/
 */

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int i=-1, j=-1;
        int cnt=0;

        for(int k=0; k<s1.length(); k++){
            if(s1.charAt(k)!=s2.charAt(k)){
                cnt++;
                if(i==-1) i=k;
                else if(j==-1) j=k;
            }
        }

        if(cnt==0) return true;
        else if(cnt==2 && s1.charAt(i)==s2.charAt(j) && s1.charAt(j)==s2.charAt(i)){
            return true;
        }


        return false;
    }
}