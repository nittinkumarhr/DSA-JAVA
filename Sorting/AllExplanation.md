# Sorting Learning Guide

---

# 806746. Quicksort 1 - Partition

> 🔗 [LeetCode](https://leetcode.com/problems/quicksort1/) &nbsp;|&nbsp; 🏷 Authorhackerrankdifficultyeasycutoff score10.00max score10submitted by131884 &nbsp;|&nbsp; 💻 Unknown &nbsp;|&nbsp; 📅 24 Jul 2026

---

## 📝 Problem Summary

The problem asks to implement the partitioning step of the Quicksort algorithm by choosing the first element of an array as a pivot and rearranging the remaining elements into three separate lists: those smaller than the pivot, those equal to the pivot, and those greater than the pivot, finally concatenating them.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- partitioning around a pivot → Divide and Conquer
- rearranging elements relative to a value → Three-way partitioning
- subdividing an array → Divide and Conquer

**Pattern(s) used:**

- Divide and Conquer
- Partitioning
- Three-way Partition

---

## 🛠 Solution Approach

- Select the first element of the input array as the pivot.
- Initialize three empty lists: left (smaller), equal (equal), and right (greater).
- Iterate through the input array once.
- Compare each element to the pivot and append it to the corresponding list.
- Concatenate the three lists in the order: left, equal, right.
- Return the combined result.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(n)`

### Space Complexity

`O(n)`

> The algorithm performs a single pass over the input array to categorize elements, resulting in linear time, and requires additional space to store the partitioned lists.

---

## ⚠️ Edge Cases to Consider

- Single element array — the pivot is the only element, resulting in an empty left/right list.
- All identical elements — all elements will be placed in the equal list.
- Already sorted array — the left list will contain all elements except the pivot, demonstrating worst-case partitioning.

---

## 💡 Key Insights

### Key Observation

The partitioning process does not require sorting the entire array; it only requires a single linear scan to group elements relative to a chosen pivot value.

### Common Mistakes

- Forgetting to include the pivot itself in the 'equal' list.
- Attempting to sort the subarrays recursively when the problem only asks for a single partition step.
- Inefficient concatenation using repeated list additions instead of a single stream or collection.

---

## 🔁 How to Approach Similar Problems

When a problem asks to organize elements based on a specific reference value or property, consider the partitioning pattern. Look for keywords like 'pivot', 'rearrange', or 'relative to'. Always check if you need to perform this operation in-place (using two pointers) or if creating auxiliary data structures is acceptable for clarity.

**Similar Problems to Practice:**

- Sort Colors
- Kth Largest Element in an Array
- Move Zeroes

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

