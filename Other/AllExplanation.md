# Other Learning Guide

---

# 1601393. Courses

> 🔗 [LeetCode](https://leetcode.com/problems/minimum-number-of-jumps-1587115620/) &nbsp;|&nbsp; 🏷 Medium &nbsp;|&nbsp; 💻 python3 &nbsp;|&nbsp; 📅 16 Jul 2026

---

## 📝 Problem Summary

The problem asks for the minimum number of jumps required to reach the last index of an array, starting from the first index. Each element in the array represents the maximum jump length from that position. If it is impossible to reach the end, the solution should return -1.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- minimum jumps to reach end → Greedy / BFS
- maximum jump length from each position → Range-based exploration

**Pattern(s) used:**

- Greedy
- Breadth-First Search (Implicit)

---

## 🛠 Solution Approach

- Initialize the jump counter 'ans' to 0 and start at index 'i = 0'.
- If the current element is 0 and we are not at the end, progress is blocked; return -1.
- If the current index 'i' is already the last index, return 'ans'.
- If the current position can directly reach or exceed the last index (arr[i] + i >= arr.length - 1), increment 'ans' and return it.
- Otherwise, scan all reachable indices from 'i + 1' to 'i + arr[i]' to find the index 'maxIdx' that maximizes the next reach (arr[maxIdx] + maxIdx).
- Set 'i = maxIdx', increment 'ans', and repeat the process.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(N)`

### Space Complexity

`O(1)`

> The time complexity is O(N) because each element in the array is scanned at most twice (once during the look-ahead search and once when the index pointer 'i' moves to it). The space complexity is O(1) as the algorithm only uses a few variables to track indices and jump counts.

---

## ⚠️ Edge Cases to Consider

- Array of length 1 — Handled correctly because the loop condition 'i < arr.length - 1' is immediately false, returning 0.
- First element is 0 (with length > 1) — Handled by checking if 'arr[i] == 0', which immediately returns -1.
- Unreachable end (e.g., trapped by a 0) — Handled by returning -1 when 'arr[i] == 0' is encountered before reaching the end.

---

## 💡 Key Insights

### Key Observation

To minimize jumps, you should always jump to the index within your current reach that maximizes your potential reach in the next step (i.e., maximizing 'arr[j] + j').

### Common Mistakes

- Using naive DFS/BFS recursion without memoization, which leads to Time Limit Exceeded (TLE).
- Greedily jumping to the index with the largest value (arr[j]) instead of the index that yields the furthest reach (arr[j] + j).
- Failing to handle cases where the end is unreachable, resulting in infinite loops.

---

## 🔁 How to Approach Similar Problems

When solving array-based optimization problems where you need to find the minimum steps to reach a target and each step offers a range of choices, look for a Greedy approach. Instead of evaluating all paths, track the maximum reachable index from your current window. Increment your step count only when you are forced to transition to the next boundary level.

**Similar Problems to Practice:**

- Jump Game
- Jump Game III
- Gas Station

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

