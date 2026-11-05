/*
 * Problem: #1486 - Find the Distance Value Between Two Arrays
 * Difficulty: Easy
 * Topic: array, two-pointers, binary-search, sorting
 * Runtime: 21 ms
 * Memory: 45.7 MB
 * Date: 05 Nov 2026
 * LeetCode: https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
 */

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        return (int) Arrays.stream(arr1)
            .filter(a -> Arrays.stream(arr2).allMatch(b -> Math.abs(a - b) > d))  // no b 
            in [a - d, a + d]
            .count();
    }
}