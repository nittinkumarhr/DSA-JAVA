/*
 * Problem: #1737 - Maximum Nesting Depth of the Parentheses
 * Difficulty: Easy
 * Topic: string, stack, bracket-sequences
 * Runtime: 0 ms
 * Memory: 41.4 MB
 * Date: 20 Nov 2026
 * LeetCode: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
 */

class Solution {
    public int maxDepth(String s) {

        for (char ch : s.toCharArray()) {
            if(ch == '('){
        }

        int c =0;
        int max =0;
                c++;
            }
            else if( ch == ')'){
                c--;
            }
    }
            max = Math.max(max,c);
        return max;
}