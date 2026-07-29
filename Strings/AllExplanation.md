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

# 1320. Remove All Adjacent Duplicates in String II

> 🔗 [LeetCode](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/) &nbsp;|&nbsp; 🏷 Medium &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 29 Jul 2026

---

## 📝 Problem Summary

The problem asks us to repeatedly remove $k$ consecutive identical characters from a string $s$ until no more such groups of size $k$ exist, and return the resulting string.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- adjacent duplicate removal -> Stack-based tracking of elements to handle cascading deletions
- remove k consecutive identical elements -> Stack storing pairs of (character, consecutive_count) to easily check and pop when count reaches k

**Pattern(s) used:**

- Stack
- String Manipulation

---

## 🛠 Solution Approach

- Initialize a stack to store pairs of characters and their consecutive counts.
- Iterate through each character of the input string.
- If the stack is not empty and the current character matches the character at the top of the stack, increment the count of the top element.
- If the character does not match, push a new pair containing the character and a count of 1 onto the stack.
- If the count of the top element reaches $k$, pop it from the stack immediately.
- Reconstruct the final string by building it from the remaining elements in the stack, repeating each character by its stored count.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(N)`

### Space Complexity

`O(N)`

> We iterate through the string of length N exactly once, performing O(1) stack operations per character. The stack and the output string builder require O(N) space in the worst case when no elements are removed.

---

## ⚠️ Edge Cases to Consider

- k is larger than string length — No removals can occur; the original string should be returned.
- String becomes completely empty — The stack will be empty at the end, and the code must correctly return an empty string.
- Cascading removals (e.g., 'abbba' with k=3) — Removing 'bbb' leaves 'aa', which must not be prematurely cleared unless their count also reaches k.

---

## 💡 Key Insights

### Key Observation

Instead of physically deleting characters and shifting the string (which is highly inefficient), we can track the running frequency of adjacent characters using a stack. This allows us to perform 'deletions' in O(1) time by simply popping from the stack when the count reaches $k$.

### Common Mistakes

- Using a simple character stack without tracking counts, which forces O(k) lookbacks to check for duplicates.
- Reconstructing the string in the wrong order (forgetting that stacks are Last-In-First-Out).
- Failing to handle cascading removals where the deletion of one group brings two previously separated identical groups together.

---

## 🔁 How to Approach Similar Problems

When a problem requires removing or collapsing adjacent elements that meet a certain condition, especially when removals can trigger new matches (cascading effects), use a Stack. To optimize, store both the element and its state (like consecutive count or index) in the stack. This avoids scanning backwards and keeps operations O(1) per character.

**Similar Problems to Practice:**

- Remove All Adjacent Duplicates In String
- Decode String
- Asteroid Collision

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

