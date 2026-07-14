# Strings Learning Guide

---

# 3312. Number of Changing Keys

> 🔗 [LeetCode](https://leetcode.com/problems/number-of-changing-keys/) &nbsp;|&nbsp; 🏷 Easy &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 15 Jul 2026

---

## 📝 Problem Summary

The problem asks us to calculate the number of times a user changes keys while typing a given string, ignoring case sensitivity. A key change is defined as transitioning from one character to a different character in consecutive positions.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- change keys / adjacent elements differ → Pairwise comparison / Linear scan
- case-insensitive comparison → Input normalization (lowercasing/uppercasing)

**Pattern(s) used:**

- Linear Scan
- String Normalization
- Pairwise Comparison

---

## 🛠 Solution Approach

- Convert the entire string to lowercase to handle case insensitivity uniformly.
- Initialize a counter variable `ans` to 0 to track the number of key changes.
- Iterate through the string starting from index 1 up to the last index.
- At each step, compare the character at the current index `i` with the character at the previous index `i-1`.
- If the characters are not equal, increment the counter `ans`.
- Return the final count `ans`.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(N)`

### Space Complexity

`O(N)`

> The time complexity is O(N) because we traverse the string of length N exactly once. The space complexity is O(N) because converting the string to lowercase in Java creates a new string of size N.

---

## ⚠️ Edge Cases to Consider

- Single character string (e.g., 'a') — The loop does not execute because the length is 1, correctly returning 0 changes.
- Case-alternating identical characters (e.g., 'aAaA') — Normalization converts this to 'aaaa', correctly resulting in 0 changes.
- All distinct characters (e.g., 'abc') — Every adjacent pair is different, correctly returning N-1 changes.

---

## 💡 Key Insights

### Key Observation

By normalizing the string to a single case (lowercase) first, we eliminate the need for complex conditional checks (like checking both uppercase and lowercase offsets) during the pairwise comparison.

### Common Mistakes

- Forgetting to handle case insensitivity, leading to false positives when comparing 'a' and 'A'.
- Starting the loop at index 0 and accessing `i-1`, which causes a StringIndexOutOfBoundsException.
- Using complex nested loops or extra data structures when a single pass with a lookback of one element is sufficient.

---

## 🔁 How to Approach Similar Problems

To solve any problem requiring transition counting or adjacent element comparison, normalize the input data first if formatting/case differences exist. Then, perform a single-pass linear scan starting from index 1, comparing the current element `arr[i]` directly with its predecessor `arr[i-1]`.

**Similar Problems to Practice:**

- Valid Palindrome
- Longer Contiguous Segments of Ones than Zeros
- Score of a String

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

