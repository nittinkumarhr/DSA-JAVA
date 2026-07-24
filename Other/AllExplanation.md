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

# 1602678. Courses

> 🔗 [LeetCode](https://leetcode.com/problems/find-missing-and-repeating2512/) &nbsp;|&nbsp; 🏷 Easy &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 24 Jul 2026

---

## 📝 Problem Summary

The problem asks to identify two numbers in an array of size N containing integers from 1 to N: one that appears twice (the duplicate) and one that is missing entirely.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- array of size N with elements from 1 to N → frequency counting or cyclic sort
- find duplicate and missing → hash map or index-based marking

**Pattern(s) used:**

- Frequency Counting
- Hashing

---

## 🛠 Solution Approach

- Initialize a frequency map or array to track occurrences of numbers from 1 to N.
- Iterate through the input array and increment the count for each number encountered.
- Iterate through the frequency map to find the key with a value of 2 (duplicate) and the key with a value of 0 (missing).
- Return the results in an array or list.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(N)`

### Space Complexity

`O(N)`

> The algorithm iterates through the array once and the map once, both taking linear time, while the map stores up to N entries, requiring linear space.

---

## ⚠️ Edge Cases to Consider

- N=2 — minimum possible size where one number is missing and one is duplicated.
- Array with all elements same — not possible given constraints, but would cause map value to exceed 2.
- Missing number is 1 or N — ensures the loop boundaries correctly cover the full range.

---

## 💡 Key Insights

### Key Observation

Since the range of numbers is fixed (1 to N) and the array size is N, the problem can be mapped to a frequency count where exactly one index will have a count of 2 and one will have a count of 0.

### Common Mistakes

- Using nested loops to count frequencies, leading to O(N^2) complexity.
- Forgetting to initialize the frequency map with all numbers from 1 to N, leading to missing keys.

---

## 🔁 How to Approach Similar Problems

Whenever a problem specifies an array of size N containing numbers in the range [1, N] or [0, N-1], immediately consider using the array indices as keys. If you cannot modify the input array, use a frequency array or hash map. If space must be O(1), use the Cyclic Sort pattern or negate values at indices to mark them as visited.

**Similar Problems to Practice:**

- Find the Duplicate Number
- Set Mismatch
- First Missing Positive

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

# 830536. Compare the Triplets

> 🔗 [LeetCode](https://leetcode.com/problems/compare-the-triplets/) &nbsp;|&nbsp; 🏷 Authorshafaetdifficultyeasymax score10submitted by2251812 &nbsp;|&nbsp; 💻 Unknown &nbsp;|&nbsp; 📅 24 Jul 2026

---

## 📝 Problem Summary

The problem requires comparing two triplets (lists of three integers) element-by-element. For each index, if the first list's value is greater, the first player gains a point; if the second list's value is greater, the second player gains a point; if they are equal, no points are awarded. The final result is a list containing the total scores of both players.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- element-by-element comparison → Iterative traversal
- fixed size input → Direct indexing
- accumulating results based on conditions → Counter variables

**Pattern(s) used:**

- Iteration
- Conditional Logic

---

## 🛠 Solution Approach

- Initialize a result list with two zeros to represent Alice and Bob's scores.
- Loop through the indices from 0 to 2.
- Retrieve the values at the current index for both input lists.
- Compare the values: increment Alice's score if her value is higher, increment Bob's if his is higher.
- Return the result list after the loop finishes.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(1)`

### Space Complexity

`O(1)`

> The input size is fixed at three elements, making the operations constant time and constant space regardless of input values.

---

## ⚠️ Edge Cases to Consider

- Equal values — The logic correctly ignores these as no points are awarded.
- All values equal — The result will correctly remain [0, 0].
- Maximum integer values — The logic uses simple comparison, so no overflow occurs.

---

## 💡 Key Insights

### Key Observation

The problem is a direct mapping task where the state of the output depends solely on a simple conditional check at each index of the input arrays.

### Common Mistakes

- Forgetting to handle the case where values are equal (doing nothing).
- Using nested loops or complex data structures when a simple linear pass suffices.

---

## 🔁 How to Approach Similar Problems

When a problem asks to compare two collections element-by-element or perform an operation based on matching indices, look for a single loop approach. If the input size is small and fixed, direct indexing is the most efficient strategy. Always identify the 'scoring' criteria first and map them to conditional branches within your loop.

**Similar Problems to Practice:**

- Find the Difference
- Count Items Matching a Rule
- Check if Two String Arrays are Equivalent

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

# 2087. Confirmation Rate

> 🔗 [LeetCode](https://leetcode.com/problems/confirmation-rate/) &nbsp;|&nbsp; 🏷 Medium &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 24 Jul 2026

---

## 📝 Problem Summary

Calculate the confirmation rate of each user, which is the number of 'confirmed' messages divided by the total number of requested confirmation messages, rounded to two decimal places. Users who did not request any confirmation messages must have a confirmation rate of 0.00.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- for each user -> GROUP BY user_id
- users with no confirmation requests -> LEFT JOIN from Signups to Confirmations
- rate of a specific condition -> AVG(IF(condition, 1, 0)) or AVG(CASE WHEN...)

**Pattern(s) used:**

- SQL Left Join
- SQL Conditional Aggregation
- SQL Group By

---

## 🛠 Solution Approach

- Perform a LEFT JOIN from the Signups table (s) to the Confirmations table (c) on user_id to retain all users even if they have no confirmation history.
- Group the joined dataset by s.user_id.
- Apply the AVG function on a conditional statement (IF or CASE WHEN) that yields 1 if the action is 'confirmed' and 0 otherwise.
- Round the calculated average to 2 decimal places using the ROUND function.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(N + M)`

### Space Complexity

`O(N)`

> The database engine scans the Signups table of size N and the Confirmations table of size M to perform the join and aggregation, requiring O(N + M) time. The space complexity is O(N) to store the grouped output records for each unique user.

---

## ⚠️ Edge Cases to Consider

- Users with zero confirmation requests — Handled by the LEFT JOIN which produces NULL for the action, and AVG(IF(NULL='confirmed', 1, 0)) correctly evaluates to 0.00.
- Users with only 'timeout' requests — Handled correctly as the IF condition evaluates to 0 for all records, yielding a 0.00 rate.

---

## 💡 Key Insights

### Key Observation

Using a LEFT JOIN instead of an INNER JOIN ensures that users with no confirmation attempts are preserved, and using AVG(IF(action = 'confirmed', 1, 0)) elegantly computes the ratio of successes to total attempts (including handling NULLs as 0).

### Common Mistakes

- Using an INNER JOIN which incorrectly excludes users who have never requested a confirmation.
- Using COUNT(action) as a denominator without handling division by zero or NULL values properly.

---

## 🔁 How to Approach Similar Problems

To solve rate or percentage problems in SQL, always start with a LEFT JOIN from the master entity table to the transaction table to avoid losing entities with zero transactions. Then, use conditional aggregation like AVG(IF(condition, 1, 0)) to compute the ratio directly, which naturally handles the math and grouping in a single pass.

**Similar Problems to Practice:**

- Immediate Food Delivery II
- Monthly Transactions I
- Queries Quality and Percentage

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

