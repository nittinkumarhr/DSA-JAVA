# Two Pointers Learning Guide

---

# 0392. Is Subsequence

> 🔗 [LeetCode](https://leetcode.com/problems/is-subsequence/) &nbsp;|&nbsp; 🏷 Easy &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 15 Aug 2026

---

## 📝 Problem Summary

The problem asks us to determine if a string `s` is a subsequence of another string `t`. A subsequence is formed by deleting some or no characters from a string without changing the relative order of the remaining characters.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- check if s is a subsequence of t → Two Pointers (Greedy matching)
- relative order must be preserved → Sequential scanning with independent pointers

**Pattern(s) used:**

- Two Pointers
- Greedy

---

## 🛠 Solution Approach

- Initialize two pointers: `i` at the beginning of string `s` (index 0) and `j` at the beginning of string `t` (index 0).
- Run a loop while `i` is less than the length of `s` and `j` is less than the length of `t`.
- If the characters at `s.charAt(i)` and `t.charAt(j)` match, increment `i` to look for the next character of `s`.
- Always increment `j` on every iteration to continue scanning through `t`.
- After the loop, check if `i` has reached the length of `s`. If it has, all characters of `s` were found in `t` in the correct order, so return `true`; otherwise, return `false`.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(N)`

### Space Complexity

`O(1)`

> The time complexity is O(N), where N is the length of the target string `t`, because we traverse `t` at most once. The space complexity is O(1) as we only use a few integer variables for pointers.

---

## ⚠️ Edge Cases to Consider

- s is empty (e.g., s = "", t = "abc") — Handled correctly because `i` starts at 0, which equals `s.length()`, returning `true` immediately.
- t is empty but s is not (e.g., s = "a", t = "") — Handled correctly because the loop condition `j < m` is false initially, returning `false` since `i (0) != n (1)`.
- s is longer than t — Handled correctly because `j` will reach the end of `t` before `i` reaches the end of `s`, returning `false`.

---

## 💡 Key Insights

### Key Observation

A greedy choice is optimal here: matching the first occurrence of `s[i]` in `t` as early as possible is always the best strategy because it leaves the maximum number of remaining characters in `t` to match the rest of `s`.

### Common Mistakes

- Using nested loops to search for each character, resulting in an inefficient O(N * M) time complexity.
- Forgetting to increment the pointer for `t` (`j`) on every iteration, leading to infinite loops.
- Failing to handle empty string inputs correctly, which can cause index out of bounds errors.

---

## 🔁 How to Approach Similar Problems

To determine if one sequence is a subsequence of another while preserving order, always think of a two-pointer approach. One pointer tracks the sequence you are trying to match (advancing only on a match), and the other pointer scans the source sequence continuously. This greedy, single-pass strategy ensures optimal linear time complexity.

**Similar Problems to Practice:**

- Number of Matching Subsequences
- Append Characters to String to Make Subsequence
- Longest Uncommon Subsequence I

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

# 2128. Reverse Prefix of Word

> 🔗 [LeetCode](https://leetcode.com/problems/reverse-prefix-of-word/) &nbsp;|&nbsp; 🏷 Easy &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 25 Aug 2026

---

## 📝 Problem Summary

Given a 0-indexed string `word` and a character `ch`, the task is to find the first occurrence of `ch` in `word` and reverse the segment of the string from index 0 up to the index of this first occurrence (inclusive). If the character does not exist in the string, the original string should be returned unchanged.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- reverse a segment/prefix → Two-pointer swap technique
- first occurrence of a character → Linear search / single-pass scanning

**Pattern(s) used:**

- Two Pointers
- String Manipulation

---

## 🛠 Solution Approach

- Convert the input string into a mutable character array to allow in-place modifications.
- Iterate through the character array from left to right to locate the first index `i` where `arr[i] == ch`.
- If the character `ch` is found, invoke a helper method to reverse the subarray from index `0` to `i` using two pointers (`start` and `end`) swapping elements towards the center.
- Break out of the loop immediately after the first occurrence is processed to avoid reversing subsequent segments.
- Convert the modified character array back into a string and return it.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(N)`

### Space Complexity

`O(N)`

> Finding the character takes O(N) time where N is the length of the string, and reversing the prefix takes at most O(N) time, resulting in O(N) overall time complexity. The space complexity is O(N) to store the character array representation of the string in Java since strings are immutable.

---

## ⚠️ Edge Cases to Consider

- Character 'ch' not present in 'word' — The loop completes without finding 'ch', leaving the array unmodified and returning the original string correctly.
- Character 'ch' is at the very first index (index 0) — The reverse function is called with start = 0 and end = 0, which immediately terminates without swapping, returning the original string.
- Character 'ch' is at the very last index — The entire string is reversed correctly as the loop finds 'ch' at index N-1.
- Multiple occurrences of 'ch' — The code breaks after the first occurrence, ensuring only the prefix up to the first 'ch' is reversed.

---

## 💡 Key Insights

### Key Observation

The problem only requires reversing up to the first occurrence of the target character. Once this character is found and the prefix is reversed, we can immediately stop processing, making a single-pass linear scan highly efficient.

### Common Mistakes

- Reversing all occurrences of the character instead of stopping at the first occurrence.
- Off-by-one errors when setting the boundaries for the two-pointer swap (e.g., reversing up to `i-1` instead of `i`).
- Inefficiently recreating strings repeatedly during concatenation instead of using an in-place character array or StringBuilder.

---

## 🔁 How to Approach Similar Problems

When asked to reverse a specific segment or the entirety of a sequence, look for the 'Two Pointers' pattern. Initialize one pointer at the start of the target segment and another at the end, swapping their elements and moving them toward each other until they meet. Always identify the exact boundary conditions (indices) of the segment to be reversed before initiating the swap loop.

**Similar Problems to Practice:**

- Reverse String
- Reverse Vowels of a String
- Reverse Words in a String III

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

# 0874. Backspace String Compare

> 🔗 [LeetCode](https://leetcode.com/problems/backspace-string-compare/) &nbsp;|&nbsp; 🏷 Easy &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 09 Sept 2026

---

## 📝 Problem Summary

Determine if two strings are equal after processing backspace characters ('#'), where each '#' deletes the character immediately preceding it (if any).

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- backspace/delete operations → Stack (LIFO) simulation
- O(1) space constraint with deletion → Two Pointers traversing backwards

**Pattern(s) used:**

- Two Pointers
- Stack
- Simulation

---

## 🛠 Solution Approach

- Initialize two pointers at the end of both strings, s and t.
- Maintain a count of active backspaces for both strings as you traverse backwards.
- For each string, skip characters that are deleted: if you see '#', increment the backspace count; if you see a normal character and backspace count > 0, decrement the count and skip the character.
- Once both pointers stop on valid, undeleted characters, compare them. If they do not match, return false.
- If one string runs out of characters before the other, return false.
- Decrement both pointers and repeat until both strings are fully processed.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(N + M)`

### Space Complexity

`O(1)`

> We traverse both strings of lengths N and M at most twice from right to left, using only a few integer variables for pointers and backspace counts.

---

## ⚠️ Edge Cases to Consider

- More backspaces than characters (e.g., 'a##') — must ensure pointer does not go out of bounds and backspace count doesn't cause errors.
- All characters deleted (e.g., 'ab##' vs 'c#d#') — both should evaluate to empty strings and return true.
- No backspaces present — should correctly compare characters directly without skipping.

---

## 💡 Key Insights

### Key Observation

By traversing the strings from right to left (backwards), we encounter the backspace characters ('#') before the characters they delete. This allows us to know exactly which characters to skip without needing to store the intermediate state in a stack.

### Common Mistakes

- Attempting a left-to-right two-pointer approach, which fails because you cannot look ahead to see if a character will be deleted.
- Failing to handle consecutive backspaces (e.g., 'b###') correctly, leading to incorrect skip counts.
- Not checking if one pointer has exhausted its string while the other pointer is still pointing to an undeleted character.

---

## 🔁 How to Approach Similar Problems

When a problem involves 'undo', 'backspace', or 'cancel' operations, a Stack is the intuitive LIFO tool. To optimize a Stack-based simulation to O(1) space, try reversing the direction of traversal (right-to-left or bottom-up) so that the 'canceling' operator is processed before the elements it affects.

**Similar Problems to Practice:**

- Removing Stars From a String
- Crawler Log Folder
- Compare Version Numbers

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

# 0680. Valid Palindrome II

> 🔗 [LeetCode](https://leetcode.com/problems/valid-palindrome-ii/) &nbsp;|&nbsp; 🏷 Easy &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 12 Sept 2026

---

## 📝 Problem Summary

The problem asks whether a given string can be transformed into a palindrome by deleting at most one character.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- palindrome check → two pointers meeting in the middle
- at most one deletion/modification allowed → greedy branching upon first mismatch

**Pattern(s) used:**

- Two Pointers
- Greedy

---

## 🛠 Solution Approach

- Initialize two pointers, i at the start (0) and j at the end (length - 1) of the string.
- While i < j, compare the characters at both pointers.
- If the characters match, increment i and decrement j.
- If a mismatch occurs, branch into two checks: check if the substring s[i+1...j] is a palindrome, or if the substring s[i...j-1] is a palindrome.
- If either of these sub-checks is true, return true; otherwise, return false.
- If the loop completes without any mismatch, return true.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(N)`

### Space Complexity

`O(1)`

> We traverse the string at most twice: once for the initial outer scan, and at most once more for the inner validation of the remaining substring of length at most N.

---

## ⚠️ Edge Cases to Consider

- Already a palindrome — handled naturally as the pointers meet without triggering any mismatch.
- String of length 1 or 2 — handled correctly because any 1 or 2-character string can be made a palindrome with at most one deletion.
- Mismatch at the exact center — handled correctly as the sub-checks will validate the remaining single-character or empty transitions.

---

## 💡 Key Insights

### Key Observation

When a mismatch s[i] != s[j] is encountered, the only two possible ways to fix it with a single deletion are to either skip s[i] or skip s[j]. Since we only have a budget of one deletion, we do not need deep recursion; we only need to check these two immediate branches once.

### Common Mistakes

- Only checking one side of the mismatch (e.g., always skipping the left character) instead of trying both options.
- Using a full backtracking or dynamic programming approach, which is over-engineered and results in O(N^2) time complexity instead of O(N).

---

## 🔁 How to Approach Similar Problems

To validate symmetric properties with a small, constant budget of 'skips' or 'errors' (k), use a two-pointer approach moving inward. Upon encountering a violation, branch out to validate the remaining range with k-1 allowed errors. For k=1, this yields a highly efficient, single-branch O(N) solution.

**Similar Problems to Practice:**

- Valid Palindrome
- Valid Palindrome III
- Minimum Insertion Steps to Make a String Palindrome

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

