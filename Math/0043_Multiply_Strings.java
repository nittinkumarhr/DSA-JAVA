/*
 * Problem: #43 - Multiply Strings
 * Difficulty: Medium
 * Topic: math, string, simulation
 * Runtime: 12 ms
 * Memory: 46.8 MB
 * Date: 31 Jul 2026
 * LeetCode: https://leetcode.com/problems/multiply-strings/
 */

import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
       BigInteger a = BigInteger.ZERO;
       int n = num1.length();
       for(int i =0;i<n;i++){
        char c = num1.charAt(i);
        int asciiValue = (char)c;
        asciiValue = asciiValue -48;
        a = a.multiply(BigInteger.TEN).add(BigInteger.valueOf(asciiValue)); 
       }
       BigInteger b = BigInteger.ZERO;
       int n2 = num2.length();
       for(int i =0;i<n2;i++){
        char c = num2.charAt(i);
        int asciiValue = (char)c;
        asciiValue = asciiValue -48;
        b = b.multiply(BigInteger.TEN).add(BigInteger.valueOf(asciiValue)); 
       }
       return String.valueOf(a.multiply(b));
    }
}