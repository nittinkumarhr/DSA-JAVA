/*
 * Problem: #71 - Simplify Path
 * Difficulty: Medium
 * Topic: string, stack
 * Runtime: 4 ms
 * Memory: 44.9 MB
 * Date: 28 Sept 2026
 * LeetCode: https://leetcode.com/problems/simplify-path/
 */

class Solution {
    public String simplifyPath(String s) {
        Stack<String> stack = new Stack<>();
        String[] components = s.split("/");
        for (String component : components) {
            if (component.equals(".") || component.isEmpty())  continue;
                else if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } 
            else {
                stack.push(component);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
        StringBuilder ans = new StringBuilder();
        for (String dir : stack) {
            ans.append("/").append(dir);
        }
        return ans.toString();
    }
}