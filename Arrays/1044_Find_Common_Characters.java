/*
 * Problem: #1044 - Find Common Characters
 * Difficulty: Easy
 * Topic: array, hash-table, string
 * Runtime: 21 ms
 * Memory: 46.9 MB
 * Date: 14 Aug 2026
 * LeetCode: https://leetcode.com/problems/find-common-characters/
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> commonChars(String[] words) {
        // Step 1: Initialize the base map with the first word's character counts
        Map<Character, Integer> minFreq = new HashMap<>();
        for (char c : words[0].toCharArray()) {
            minFreq.put(c, minFreq.getOrDefault(c, 0) + 1);
        }

        // Step 2: Iterate through the remaining words
        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> currentFreq = new HashMap<>();
            for (char c : words[i].toCharArray()) {
                currentFreq.put(c, currentFreq.getOrDefault(c, 0) + 1);
            }

            // Step 3: Update the base map with minimum frequencies
            for (char key : minFreq.keySet()) {
                int currentCount = currentFreq.getOrDefault(key, 0);
                minFreq.put(key, Math.min(minFreq.get(key), currentCount));
            }
        }

        // Step 4: Reconstruct the final list from the minimum frequencies
        List<String> result = new ArrayList<>();