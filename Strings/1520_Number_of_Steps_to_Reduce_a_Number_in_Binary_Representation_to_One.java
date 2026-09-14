/*
 * Problem: #1520 - Number of Steps to Reduce a Number in Binary Representation to One
 * Difficulty: Medium
 * Topic: string, bit-manipulation, simulation
 * Runtime: 0 ms
 * Memory: 42.4 MB
 * Date: 14 Sept 2026
 * LeetCode: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/
 */

class Solution {
    public int numSteps(String s) {
        int steps = 0;
        int carry = 0;
               // Traverse from right to left, stopping before the first character (index 0)
            int currentBit = s.charAt(i) - '0';
                steps += 2; 
                carry = 1;  
            } else {
                steps += 1; 
            }
        }
        return steps + carry;
    }
}
        for (int i = s.length() - 1; i > 0; i--) {
            if ((currentBit + carry) % 2 != 0) {