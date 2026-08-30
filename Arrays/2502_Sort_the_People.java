/*
 * Problem: #2502 - Sort the People
 * Difficulty: Easy
 * Topic: array, hash-table, string, sorting
 * Runtime: 9 ms
 * Memory: 47.5 MB
 * Date: 30 Aug 2026
 * LeetCode: https://leetcode.com/problems/sort-the-people/
 */

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }        
        Arrays.sort(heights);
        String[] result = new String[heights.length];
        int index = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            result[index] = map.get(heights[i]);
            index++;
        }
        return result;
    }
}