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

