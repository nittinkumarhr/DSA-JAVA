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

