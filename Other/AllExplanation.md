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

# 1600238. Courses

> 🔗 [LeetCode](https://leetcode.com/problems/binary-search-1587115620/) &nbsp;|&nbsp; 🏷 Easy &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 17 Jul 2026

---

## 📝 Problem Summary

The problem asks us to find the 0-based index of the first occurrence of a target integer `k` in an array `arr`. If the target is not present in the array, the algorithm should return -1.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- unsorted array search → linear scan
- find first occurrence → sequential iteration with early return

**Pattern(s) used:**

- Linear Search

---

## 🛠 Solution Approach

- Iterate through the array sequentially starting from index 0.
- Compare the element at the current index with the target integer `k`.
- If the current element equals `k`, immediately return the current index.
- If the loop completes without finding a match, return -1.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(N)`

### Space Complexity

`O(1)`

> The time complexity is O(N) because we may need to examine every element in the array of size N in the worst case. The space complexity is O(1) because we only use a single loop index variable.

---

## ⚠️ Edge Cases to Consider

- Empty array — the loop condition is immediately false, returning -1 safely.
- Target not present — the loop completes entirely and returns -1.
- Multiple occurrences of target — the early return ensures the first index is returned.

---

## 💡 Key Insights

### Key Observation

Since the array is unsorted, we cannot make any assumptions about the positions of elements, making a sequential scan necessary and sufficient to find the first occurrence.

### Common Mistakes

- Placing the 'return -1' statement inside an 'else' block within the loop, which terminates the search prematurely after checking only the first element.
- Using an incorrect loop boundary that causes an IndexOutOfBoundsException.

---

## 🔁 How to Approach Similar Problems

When searching for an element in an unsorted linear data structure, a linear scan is the default approach. Always ensure that failure cases (element not found) are handled after the loop completes, and return as soon as the target condition is met to optimize the average-case runtime.

**Similar Problems to Practice:**

- Binary Search
- First Unique Character in a String
- Find Target Indices After Sorting Array

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

# 1603043. Courses

> 🔗 [LeetCode](https://leetcode.com/problems/longest-sub-array-with-sum-k0809/) &nbsp;|&nbsp; 🏷 Medium &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 24 Jul 2026

---

## 📝 Problem Summary

The problem asks to find the length of the longest contiguous subarray within an integer array that sums up to a specific target value k.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- contiguous subarray → sliding window or prefix sum
- sum equals k → prefix sum with hash map
- longest subarray → optimization problem

**Pattern(s) used:**

- Prefix Sum
- Hash Map

---

## 🛠 Solution Approach

- Initialize a hash map to store the first occurrence of each prefix sum.
- Iterate through the array, maintaining a running prefix sum.
- If the current prefix sum equals k, update the maximum length to the current index plus one.
- Check if (currentSum - k) exists in the map; if so, calculate the subarray length as (currentIndex - map.get(currentSum - k)) and update the maximum.
- If the current prefix sum is not in the map, store it with the current index to ensure we capture the longest possible subarray.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(n)`

### Space Complexity

`O(n)`

> We traverse the array once performing constant time hash map operations, and in the worst case, we store n distinct prefix sums in the map.

---

## ⚠️ Edge Cases to Consider

- Empty array — returns 0 as the loop never executes.
- Target k not found — returns 0 as max remains initialized to 0.
- Negative numbers — handled correctly by the prefix sum logic.
- Array with all zeros — handled by only storing the first occurrence of a prefix sum.

---

## 💡 Key Insights

### Key Observation

The sum of a subarray from index i+1 to j is equal to prefixSum[j] - prefixSum[i]; by storing the earliest index of each prefix sum, we maximize the distance between j and i.

### Common Mistakes

- Updating the map for every occurrence of a prefix sum instead of only the first one.
- Forgetting to handle the case where the prefix sum itself equals k by initializing the map with {0: -1}.

---

## 🔁 How to Approach Similar Problems

When a problem asks for a subarray with a specific property related to sums, immediately consider the prefix sum technique. If you need to find a range [i, j] such that some function of the elements between them meets a criteria, use a hash map to store the 'state' of the prefix at index i to quickly look up if a valid j exists. Always check if you need to store the first occurrence (for longest) or last occurrence (for shortest) of a prefix sum.

**Similar Problems to Practice:**

- Subarray Sum Equals K
- Contiguous Array
- Maximum Size Subarray Sum Equals k

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

