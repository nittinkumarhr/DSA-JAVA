/*
 * Problem: #680 - Valid Palindrome II
 * Difficulty: Easy
 * Topic: two-pointers, string, greedy
 * Runtime: 4 ms
 * Memory: 47.7 MB
 * Date: 12 Sept 2026
 * LeetCode: https://leetcode.com/problems/valid-palindrome-ii/
 */

if (s.charAt(i1) != s.charAt(j1)) {
                        validLeft = false;
                        break;
                    }
                    i1++;
                    j1--;
                }
                
                // Option 2: Skip the right character (j) and check the rest inline
                int i2 = i, j2 = j - 1;
                boolean validRight = true;
                while (i2 < j2) {
                    if (s.charAt(i2) != s.charAt(j2)) {
                        validRight = false;
                        break;
                    }
                boolean validLeft = true;
                while (i1 < j1) {
                    i2++;
                    j2--;
                }
                
                // If either option works, it's a valid palindrome with one deletion
                return validLeft || validRight;
            }
        }
        
        return true;
    }
}