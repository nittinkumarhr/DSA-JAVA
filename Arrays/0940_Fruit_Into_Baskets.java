/*
 * Problem: #940 - Fruit Into Baskets
 * Difficulty: Medium
 * Topic: array, hash-table, sliding-window
 * Runtime: 54 ms
 * Memory: 70.8 MB
 * Date: 09 Jul 2026
 * LeetCode: https://leetcode.com/problems/fruit-into-baskets/
 */

class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < fruits.length; right++) {

            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {

                map.put(fruits[left], map.get(fruits[left]) - 1);

                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}