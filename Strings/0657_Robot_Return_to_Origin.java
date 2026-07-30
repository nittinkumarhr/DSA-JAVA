/*
 * Problem: #657 - Robot Return to Origin
 * Difficulty: Easy
 * Topic: string, simulation
 * Runtime: 4 ms
 * Memory: 46 MB
 * Date: 30 Jul 2026
 * LeetCode: https://leetcode.com/problems/robot-return-to-origin/
 */

class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char m : moves.toCharArray()) {
            if (m == 'R') x++;
            else if (m == 'L') x--;
            else if (m == 'U') y++;
            else if (m == 'D') y--;
        }
        return x == 0 && y == 0;
    }
}