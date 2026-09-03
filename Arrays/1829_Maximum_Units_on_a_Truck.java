/*
 * Problem: #1829 - Maximum Units on a Truck
 * Difficulty: Easy
 * Topic: array, greedy, sorting
 * Runtime: 9 ms
 * Memory: 46.9 MB
 * Date: 03 Sept 2026
 * LeetCode: https://leetcode.com/problems/maximum-units-on-a-truck/
 */

class Solution {
      public int maximumUnits(int[][] boxTypes, int truckSize) {
     // Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]); // b[1] - a[1] may cause int overflow, credit 
     to @Zudas.
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int boxes = 0;
        for (int[] box : boxTypes) {
            if (truckSize >= box[0]) {
                boxes += box[0] * box[1];
                truckSize -= box[0];
            }else {
                boxes += truckSize * box[1];
                return boxes;
            }
        }
        return boxes;
    }
}