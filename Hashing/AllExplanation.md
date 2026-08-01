# Hashing Learning Guide

---

# 1065. Binary String With Substrings Representing 1 To N

> 🔗 [LeetCode](https://leetcode.com/problems/binary-string-with-substrings-representing-1-to-n/) &nbsp;|&nbsp; 🏷 Medium &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 08 Jul 2026

---

## Problem Summary

Problem #1065 — Binary String With Substrings Representing 1 To N. Difficulty: Medium.

---

## AI-Powered Solution Explanation

- Review the solution code and add your explanation here.

---

## AI Complexity Analysis

### Time Complexity

`O(?)`

### Space Complexity

`O(?)`

---

## AI Learning Insights

### Pattern

- hash-table
- string
- bit-manipulation
- sliding-window

### Key Observation

_Add your key insight here._

### Similar Problems

- N/A

### Common Mistakes

- N/A

---

## Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

# 0451. Sort Characters By Frequency

> 🔗 [LeetCode](https://leetcode.com/problems/sort-characters-by-frequency/) &nbsp;|&nbsp; 🏷 Medium &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 18 Jul 2026

---

## 📝 Problem Summary

The problem asks us to sort a given string in descending order based on the frequency of its characters. If multiple characters have the same frequency, their relative order does not matter.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- sort characters by frequency → Frequency Map + Sorting/Heap
- decreasing order of frequency → Max-Heap or Bucket Sort
- frequency of character is bounded by string length → Bucket Sort optimization

**Pattern(s) used:**

- Hash Table
- Bucket Sort
- Heap (Priority Queue)
- Sorting

---

## 🛠 Solution Approach

- Count the frequency of each character in the string using a hash map or a fixed-size integer array.
- Create an array of lists (buckets) where the index represents the frequency of characters (size of array is string length + 1).
- Iterate through the frequency map and place each character into the bucket corresponding to its frequency.
- Iterate through the buckets in reverse order (from highest frequency to lowest).
- For each character in a bucket, append it to a StringBuilder repeated 'frequency' times.
- Convert the StringBuilder to a string and return it.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(n)`

### Space Complexity

`O(n)`

> Counting frequencies takes O(n) time. Creating and filling the buckets takes O(n) time and space because the maximum frequency is bounded by n (the length of the string). Reconstructing the string takes O(n) time.

---

## ⚠️ Edge Cases to Consider

- Empty string or single character — Handled naturally as the loop bounds prevent execution or return the character immediately.
- All characters have the same frequency — Handled correctly since bucket order doesn't matter for equal frequencies.
- Case sensitivity (e.g., 'A' vs 'a') — Handled correctly by treating them as distinct characters in the hash map.

---

## 💡 Key Insights

### Key Observation

The maximum frequency of any character cannot exceed the length of the string 'n'. This allows us to use Bucket Sort to achieve O(n) time complexity, avoiding the O(k log k) sorting overhead.

### Common Mistakes

- Using string concatenation (res += c) inside a loop instead of StringBuilder, which leads to O(n^2) time complexity due to string immutability.
- Assuming only lowercase English letters are present, which causes IndexOutOfBounds exceptions if using a fixed-size array of size 26 instead of a Map or size 128/256 array.
- Sorting the entire string directly, which is inefficient and unnecessary.

---

## 🔁 How to Approach Similar Problems

To sort elements by frequency, always start by building a frequency map. If the maximum possible frequency is bounded by a reasonable number (like the array/string length 'n'), use Bucket Sort where the index represents the frequency to achieve linear O(n) time. If the frequencies are unbounded or sparse, use a Max-Heap or sort the unique keys based on their mapped values.

**Similar Problems to Practice:**

- Top K Frequent Elements
- Sort Array by Increasing Frequency
- Rearrange String k Distance Apart

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

# 0768. Partition Labels

> 🔗 [LeetCode](https://leetcode.com/problems/partition-labels/) &nbsp;|&nbsp; 🏷 Medium &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 23 Jul 2026

---

## 📝 Problem Summary

Partition a string into as many parts as possible such that each letter appears in at most one part, returning the size of each partition.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- partition string into parts → greedy grouping
- each letter appears in at most one part → last occurrence tracking

**Pattern(s) used:**

- Greedy
- Hash Map/Frequency Array
- Two Pointers

---

## 🛠 Solution Approach

- Create an array of size 26 to store the last index of each character in the string.
- Iterate through the string to populate the last index array.
- Initialize 'start' and 'end' pointers to 0 to track the current partition boundaries.
- Iterate through the string again, updating 'end' to the maximum of its current value or the last occurrence of the current character.
- When the current index equals 'end', a partition is complete; record its length and update 'start' to 'end + 1'.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(N)`

### Space Complexity

`O(1)`

> We traverse the string twice (O(N)) and use a fixed-size array of 26 integers (O(1)).

---

## ⚠️ Edge Cases to Consider

- Empty string — should return an empty list.
- Single character — returns a list containing 1.
- All identical characters — returns a list containing the string length.

---

## 💡 Key Insights

### Key Observation

A partition must extend at least as far as the last occurrence of every character contained within that partition.

### Common Mistakes

- Forgetting to update the 'end' pointer dynamically as you iterate through the current partition.
- Incorrectly calculating the partition length as 'end - start' instead of 'end - start + 1'.

---

## 🔁 How to Approach Similar Problems

When a problem requires partitioning or grouping elements based on constraints that depend on the global range of those elements, first pre-calculate the boundaries (like the last occurrence) for each element. Use a greedy approach to expand the current window until the boundary condition is satisfied, then reset and repeat. Always look for 'interval' properties hidden within string or array problems.

**Similar Problems to Practice:**

- Merge Intervals
- Jump Game II
- Video Stitching

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

# 0807. Custom Sort String

> 🔗 [LeetCode](https://leetcode.com/problems/custom-sort-string/) &nbsp;|&nbsp; 🏷 Medium &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 01 Aug 2026

---

## 📝 Problem Summary

Sort the characters of a string 's' to match a custom ordering defined by another string 'order'. Characters in 's' that do not appear in 'order' can be placed anywhere in the final output.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- custom sorting order defined by a string → Counting Sort / Frequency Map
- characters not in order can be placed anywhere → Partitioning into defined vs undefined characters
- lowercase English letters constraint → Fixed-size frequency array or O(1) space Hash Map

**Pattern(s) used:**

- Counting Sort
- Frequency Map
- Hash Table

---

## 🛠 Solution Approach

- Count the frequency of each character in string 's' and store it in a hash map.
- Iterate through the characters of the 'order' string.
- For each character in 'order', if it exists in the frequency map, append it to the result string as many times as its frequency, then remove it from the map.
- Iterate through the remaining characters in the frequency map (those not present in 'order') and append them to the end of the result.
- Return the final constructed custom-sorted string.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(N + M)`

### Space Complexity

`O(1)`

> We iterate through 's' of length N to build the frequency map, and 'order' of length M to construct the result. The space complexity is O(1) because the alphabet size is constant (26 lowercase English letters), meaning the map size is bounded.

---

## ⚠️ Edge Cases to Consider

- s contains characters not in order — these must be appended at the end without being discarded.
- order contains characters not in s — the code safely ignores them because they won't be present in the frequency map.
- empty s or order — handled gracefully as the loops won't execute, returning an empty string.

---

## 💡 Key Insights

### Key Observation

Instead of using a general-purpose comparison-based sort (which takes O(N log N)), we can use counting sort (O(N)) because the relative order of elements is dictated by a fixed, pre-defined sequence, and the alphabet size is small and constant.

### Common Mistakes

- Using a comparison-based sort with a custom comparator, which is less efficient (O(N log N)) than counting sort (O(N)).
- Forgetting to append the characters from 's' that were not present in 'order'.
- Modifying strings directly instead of using a StringBuilder, leading to O(N^2) time complexity due to string immutability.

---

## 🔁 How to Approach Similar Problems

When asked to sort a collection based on a custom, non-standard order (especially with a small, finite alphabet), avoid standard comparison sorts. Instead, use Counting Sort: count the frequencies of elements first, iterate through the custom order to place elements in the correct sequence, and then append any remaining elements. This reduces the time complexity from O(N log N) to O(N).

**Similar Problems to Practice:**

- Sort Characters By Frequency
- Relative Sort Array
- First Unique Character in a String

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

