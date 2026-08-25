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

