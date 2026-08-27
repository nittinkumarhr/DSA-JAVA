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

Sort a string 's' based on a custom character ordering defined by another string 'order'. Characters in 's' that are not present in 'order' can be placed in any position in the output.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- custom sorting order -> frequency map + custom ordering traversal
- characters not in order can be in any position -> append remaining elements from frequency map at the end

**Pattern(s) used:**

- Frequency Map / Hash Table
- Counting Sort

---

## 🛠 Solution Approach

- Count and store the frequency of each character in string 's' using a hash map.
- Iterate through the characters of the 'order' string.
- For each character in 'order', if it exists in the frequency map, append it to the result string as many times as its recorded frequency, then remove it from the map.
- Iterate through the remaining entries in the frequency map (characters in 's' but not in 'order') and append them to the result.
- Return the constructed custom-sorted string.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(N + M)`

### Space Complexity

`O(1)`

> We iterate through 's' of length N to build the frequency map and 'order' of length M to construct the sorted string. The auxiliary space is O(1) because the frequency map contains at most 26 unique lowercase English letters.

---

## ⚠️ Edge Cases to Consider

- s contains characters not in order — These must be appended at the end without being discarded.
- order contains characters not in s — The algorithm must safely ignore these characters without throwing errors.
- s has duplicate characters — The frequency count must correctly preserve and repeat all duplicates in the output.

---

## 💡 Key Insights

### Key Observation

Instead of using a comparison-based sorting algorithm (which takes O(N log N)), we can use counting sort (O(N)) because the relative order is predefined and the character set is small and finite.

### Common Mistakes

- Using a comparison-based sort with a custom comparator, which is less efficient than counting sort.
- Forgetting to append the characters of 's' that do not appear in 'order'.
- Modifying the string directly instead of using a StringBuilder, leading to O(N^2) time complexity due to string immutability.

---

## 🔁 How to Approach Similar Problems

When asked to sort elements according to a custom, non-standard order, avoid standard comparison sorts. Instead, use a frequency map (or a fixed-size array if the character set is small) to count occurrences. Reconstruct the output by iterating through the custom ordering first, consuming the counts, and then handling any leftover elements. This reduces the time complexity from O(N log N) to O(N).

**Similar Problems to Practice:**

- Sort Characters By Frequency
- Reorganize String
- First Unique Character in a String

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

# 1297. Maximum Number of Balloons

> 🔗 [LeetCode](https://leetcode.com/problems/maximum-number-of-balloons/) &nbsp;|&nbsp; 🏷 Easy &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 19 Aug 2026

---

## 📝 Problem Summary

Given a string, find the maximum number of times the word 'balloon' can be formed using its characters. Each character in the input string can be used at most once, meaning we must count the frequencies of the constituent characters ('b', 'a', 'l', 'o', 'n') and find the limiting bottleneck.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- form a target word multiple times -> frequency counting and bottleneck calculation
- characters can be used at most once -> hash table or frequency array

**Pattern(s) used:**

- Frequency Counting
- Hash Table
- Bottleneck Analysis

---

## 🛠 Solution Approach

- Initialize a frequency array of size 26 to count occurrences of each lowercase English letter in the input string.
- Iterate through the input string and populate the frequency array.
- Retrieve the counts for the characters 'b', 'a', 'l', 'o', and 'n'.
- Divide the counts of 'l' and 'o' by 2, since each 'balloon' requires two of each.
- Return the minimum of these five values, which represents the maximum number of complete 'balloon' words that can be formed.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(N)`

### Space Complexity

`O(1)`

> We iterate through the string of length N exactly once to count character frequencies. The space complexity is O(1) because the frequency array size is fixed at 26, regardless of the input size.

---

## ⚠️ Edge Cases to Consider

- String length is less than 7 — handled correctly because the counts of required characters will not be sufficient, resulting in a minimum of 0.
- No characters from 'balloon' present — all relevant counts will be 0, and the minimum returned will be 0.
- Abundant 'b', 'a', 'n' but zero 'l' or 'o' — division by 2 yields 0, correctly identifying 'l' or 'o' as the bottleneck.

---

## 💡 Key Insights

### Key Observation

The maximum number of target words we can form is strictly limited by the 'bottleneck' character—the character that has the lowest ratio of (available count / required count in target word).

### Common Mistakes

- Forgetting to divide the counts of 'l' and 'o' by 2, leading to an overestimation of the possible words.
- Using an expensive HashMap instead of a fixed-size array of size 26 for character counting.
- Not handling cases where some required characters are completely missing from the input string.

---

## 🔁 How to Approach Similar Problems

To solve any problem asking for the maximum number of target patterns/words that can be formed from a source pool: 1) Count the frequencies of all elements in the source pool. 2) Identify the required frequency of each element in a single target instance. 3) Divide the source count of each element by its target requirement. 4) The minimum of these quotients is your bottleneck and final answer.

**Similar Problems to Practice:**

- Find Words That Can Be Formed by Characters
- Ransom Note
- Minimum Window Substring

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

# 1363. Greatest English Letter in Upper and Lower Case

> 🔗 [LeetCode](https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/) &nbsp;|&nbsp; 🏷 Easy &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 23 Aug 2026

---

## 📝 Problem Summary

The problem asks us to find the lexicographically greatest English letter that appears in both its uppercase and lowercase forms within a given string. If no such letter exists, we return an empty string.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- greatest letter -> Reverse iteration (from 'Z' to 'A') to find the optimal solution first
- both lowercase and uppercase -> Set lookup or bitmasking for existence of paired elements

**Pattern(s) used:**

- Hash Table
- Greedy / Reverse Search

---

## 🛠 Solution Approach

- Insert all characters of the input string into a hash set to enable O(1) lookup.
- Iterate through the uppercase English alphabet in reverse order, starting from 'Z' down to 'A'.
- For each uppercase character, check if both it and its lowercase counterpart exist in the hash set.
- Return the first character that satisfies this condition as a string, as reverse iteration guarantees it is the greatest.
- If the loop completes without finding any matching pair, return an empty string.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(N)`

### Space Complexity

`O(1)`

> Populating the hash set takes O(N) time where N is the length of the string. The search phase takes O(1) time because we iterate a constant 26 times. The space complexity is O(1) because the hash set can store at most 52 unique English characters.

---

## ⚠️ Edge Cases to Consider

- No matching pairs — The loop completes and correctly returns an empty string.
- Only lowercase or only uppercase letters — The set will only contain one case, so the pair check fails and returns an empty string.
- Multiple valid pairs — Handled correctly by reverse iteration ('Z' to 'A'), ensuring the greatest letter is returned first.

---

## 💡 Key Insights

### Key Observation

Instead of comparing every character in the string against every other character, we can store all characters in a set and iterate backwards through the alphabet ('Z' to 'A'). The first letter we find that has both cases present is guaranteed to be the greatest.

### Common Mistakes

- Iterating from 'A' to 'Z' and keeping track of the maximum, which is less elegant and slower than returning early during a reverse search.
- Using nested loops to compare every character pair, leading to an unnecessary O(N^2) time complexity.

---

## 🔁 How to Approach Similar Problems

When asked to find the 'greatest' or 'best' element satisfying a condition from a small, fixed domain (like the alphabet), prefer iterating backwards through the domain itself rather than the input. Use a hash set or boolean array/bitmask for O(1) existence checks of paired states.

**Similar Problems to Practice:**

- First Letter to Appear Twice
- Keyboard Row
- Find Words That Can Be Formed by Characters

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

# 1915. Check if One String Swap Can Make Strings Equal

> 🔗 [LeetCode](https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/) &nbsp;|&nbsp; 🏷 Easy &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 27 Aug 2026

---

## 📝 Problem Summary

Determine if two strings of equal length can be made identical by swapping at most one pair of characters in one of the strings.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- "at most one string swap" → "limit of 2 mismatched positions"
- "make strings equal" → "compare character-by-character and count differences"

**Pattern(s) used:**

- String Manipulation
- Two-Pointer/Index Tracking
- Counting Mismatches

---

## 🛠 Solution Approach

- Initialize two index variables `i` and `j` to -1 to store the positions of mismatches, and a counter `cnt` to 0.
- Iterate through the strings from index 0 to length - 1.
- If characters at the current index differ, increment `cnt`. If it is the first mismatch, store the index in `i`. If it is the second, store it in `j`.
- After the loop, if `cnt` is 0, return true because the strings are already equal.
- If `cnt` is exactly 2, verify if swapping the characters at `i` and `j` in `s1` matches `s2` (i.e., `s1[i] == s2[j]` and `s1[j] == s2[i]`).
- Otherwise, return false.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(N)`

### Space Complexity

`O(1)`

> We perform a single pass over the strings of length N, using constant extra space to store mismatch indices and counters.

---

## ⚠️ Edge Cases to Consider

- Strings already equal — No mismatches found (cnt == 0), should return true immediately.
- Exactly one mismatch — Cannot resolve with a swap (cnt == 1), should return false.
- More than two mismatches — Requires more than one swap, should return false.
- Two mismatches but mismatched characters do not match crosswise — e.g., s1='bank', s2='bink' (cnt=2 but 'a' != 'i'), should return false.

---

## 💡 Key Insights

### Key Observation

For two strings to be equal after exactly one swap, they must differ at exactly zero positions (already equal) or exactly two positions, and those two mismatched positions must contain the same pair of characters in reversed order.

### Common Mistakes

- Forgetting to check if the mismatched characters actually match crosswise (only checking if the count of mismatches is 2).
- Not handling the case where the strings are already identical (0 mismatches).
- Using a full frequency map or sorting, which unnecessarily increases space complexity to O(N) or time complexity to O(N log N).

---

## 🔁 How to Approach Similar Problems

When a problem asks if a single swap or a small, fixed number of operations can make two sequences equal, avoid heavy sorting or hashing. Instead, perform a single-pass comparison to isolate the exact indices where the sequences differ. If the number of differences exceeds the allowed budget (e.g., > 2 for a single swap), terminate early. Otherwise, validate if the isolated differences can be resolved by the permitted operation.

**Similar Problems to Practice:**

- Buddy Strings
- Determine if Two Strings Are Close
- Make Number of Distinct Characters Equal After One Swap

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

