/*
 * Problem: #4216 - Weighted Word Mapping
 * Difficulty: Easy
 * Topic: array, string, simulation
 * Runtime: 8 ms
 * Memory: 46.1 MB
 * Date: 06 Nov 2026
 * LeetCode: https://leetcode.com/problems/weighted-word-mapping/
 */

class Solution {
    public String mapWordWeights(String[] str, int[] w) {
        int n = str.length;
        String res ="";
        for(int i=0;i<n;i++){
            String s = str[i];
            int sum =0;
            for(int j =0;j<s.length();j++){
                int temp = (int)(s.charAt(j) - 'a');
                sum +=w[temp];
            }
            sum = sum%26;
            res += (char)('z'-sum);
        }
        return res;
        
    }
}