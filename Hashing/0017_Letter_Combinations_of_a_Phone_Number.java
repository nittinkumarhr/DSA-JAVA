/*
 * Problem: #17 - Letter Combinations of a Phone Number
 * Difficulty: Medium
 * Topic: hash-table, string, backtracking
 * Runtime: 3 ms
 * Memory: 43.7 MB
 * Date: 11 Oct 2026
 * LeetCode: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 */

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return Collections.emptyList();

        String[] phone_map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> output = new ArrayList<>();
        backtrack("", digits, phone_map, output);
        return output;
    }

    private void backtrack(String combination, String next_digits, String[] phone_map, List<String> 
    output) {
        if (next_digits.isEmpty()) {
            output.add(combination);
        } else {
            String letters = phone_map[next_digits.charAt(0) - '2'];
            for (char letter : letters.toCharArray()) {
                backtrack(combination + letter, next_digits.substring(1), phone_map, output);
            }
        }
    }
}