# Other Learning Guide

---

# 1601210. Array Leaders

> 🔗 [LeetCode](https://leetcode.com/problems/leaders-in-an-array-1587115620/) &nbsp;|&nbsp; 🏷 Easy &nbsp;|&nbsp; 💻 Java (21) &nbsp;|&nbsp; 📅 16 Jul 2026

---

## 📝 Problem Summary

The problem asks to identify all elements in an array that are greater than or equal to every element to their right. An element is considered a 'leader' if it satisfies this condition, with the rightmost element always being a leader.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- elements to the right → suffix processing
- greater than all elements following → running maximum tracking

**Pattern(s) used:**

- Suffix Processing
- Greedy Approach

---

## 🛠 Solution Approach

- Initialize a variable 'maxRight' with the last element of the array.
- Add the last element to the result list as it is always a leader.
- Iterate through the array backwards from the second-to-last element to the start.
- If the current element is greater than or equal to 'maxRight', update 'maxRight' and add the current element to the result list.
- Reverse the result list to maintain the original relative order of leaders.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(n)`

### Space Complexity

`O(n)`

> The algorithm performs a single linear pass over the array, and the result list can store up to n elements in the worst case.

---

## ⚠️ Edge Cases to Consider

- Single element array — the loop is skipped and the element is correctly identified as a leader.
- All identical elements — every element satisfies the condition and is added to the result.
- Strictly decreasing array — every element is a leader because each is greater than all elements to its right.

---

## 💡 Key Insights

### Key Observation

By traversing from right to left, we only need to keep track of the maximum value encountered so far to determine if the current element is a leader, avoiding a nested loop O(n^2) approach.

### Common Mistakes

- Using a nested loop approach resulting in O(n^2) time complexity.
- Forgetting to include the rightmost element as a leader.
- Failing to reverse the result list if the order of leaders is required to match the original array index order.

---

## 🔁 How to Approach Similar Problems

When a problem requires comparing an element against all elements to its right (or left), consider processing the array in reverse. Maintain a running state (like a maximum or minimum) that updates as you traverse. This 'Suffix/Prefix State' pattern often reduces quadratic time complexity to linear time.

**Similar Problems to Practice:**

- Next Greater Element I
- Trapping Rain Water
- Daily Temperatures

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

# 1600437. Duplicates in a Limited Range Array

> 🔗 [LeetCode](https://leetcode.com/problems/find-duplicates-in-an-array/) &nbsp;|&nbsp; 🏷 Easy &nbsp;|&nbsp; 💻 Java (21) &nbsp;|&nbsp; 📅 16 Jul 2026

---

## 📝 Problem Summary

The problem asks to identify all elements that appear more than once in an array where the values are constrained within a specific range (typically 0 to n-1 or 1 to n).

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- array of size n with elements in range [0, n-1] → frequency counting or cyclic sort
- find duplicates → hash map or boolean array tracking
- limited range of values → index-based mapping

**Pattern(s) used:**

- Frequency Array
- Hashing

---

## 🛠 Solution Approach

- Initialize a boolean array 'res' of size n+1 to track seen elements.
- Initialize an empty list 'ans' to store duplicates.
- Iterate through the input array.
- For each element, check if it is already marked true in 'res'.
- If true, add it to 'ans'.
- If false, mark it as true in 'res'.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(n)`

### Space Complexity

`O(n)`

> Time complexity is O(n) because we traverse the array once; space complexity is O(n) due to the auxiliary boolean array used for tracking.

---

## ⚠️ Edge Cases to Consider

- Empty array — returns empty list correctly.
- No duplicates — returns empty list.
- All elements same — correctly identifies duplicates.
- Values at boundaries (0 or n) — requires array size n+1 to avoid index out of bounds.

---

## 💡 Key Insights

### Key Observation

When the range of values is constrained to the size of the array, the array indices themselves can serve as a direct mapping for frequency tracking.

### Common Mistakes

- Using an array of size n instead of n+1, leading to IndexOutOfBoundsException.
- Failing to handle the case where a number appears more than twice (adding it to the result multiple times).
- Attempting to sort the array first, which increases time complexity to O(n log n).

---

## 🔁 How to Approach Similar Problems

Whenever a problem specifies that array elements are bounded by the array size (e.g., 0 to n-1), immediately consider using the indices as keys. If you need to track presence or frequency, avoid heavy data structures like HashMaps and use a simple boolean or integer array instead. If space must be O(1), consider modifying the input array in-place by negating values at indices corresponding to the numbers seen.

**Similar Problems to Practice:**

- Find All Duplicates in an Array
- Find the Duplicate Number
- First Missing Positive

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

