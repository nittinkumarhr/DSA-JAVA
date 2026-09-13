/*
 * Problem: #1720 - Crawler Log Folder
 * Difficulty: Easy
 * Topic: array, string, stack
 * Runtime: 1 ms
 * Memory: 43.7 MB
 * Date: 13 Sept 2026
 * LeetCode: https://leetcode.com/problems/crawler-log-folder/
 */

class Solution {
    public int minOperations(String[] l) {
        int n = l.length;
        Stack<String> st = new Stack<>();
        for (String s : l) {
                continue;
    }
            } else {
                st.push(s);
}
            }
        }
        return st.size();
            if (s.equals("../")) {
                if (!st.isEmpty()) {
            } else if (s.equals("./")) {
                    st.pop();
                }