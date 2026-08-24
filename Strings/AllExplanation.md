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

# 0657. Robot Return to Origin

> 🔗 [LeetCode](https://leetcode.com/problems/robot-return-to-origin/) &nbsp;|&nbsp; 🏷 Easy &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 30 Jul 2026

---

## 📝 Problem Summary

The problem asks whether a sequence of directional moves (U, D, L, R) results in a robot returning to its starting coordinate (0, 0) on a 2D plane.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- sequence of operations → simulation
- returning to origin → net displacement calculation
- fixed set of moves → state tracking

**Pattern(s) used:**

- Simulation
- Coordinate Geometry

---

## 🛠 Solution Approach

- Initialize x and y coordinates to 0.
- Iterate through each character in the input string.
- Update x by +1 for 'R' and -1 for 'L'.
- Update y by +1 for 'U' and -1 for 'D'.
- Return true if both x and y are 0 after processing all moves.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(n)`

### Space Complexity

`O(1)`

> The algorithm performs a single pass over the input string of length n, using only two integer variables for state tracking.

---

## ⚠️ Edge Cases to Consider

- Empty string — the robot starts at (0,0) and makes no moves, so it remains at the origin.
- Odd number of moves — it is mathematically impossible to return to the origin if the total move count is odd.

---

## 💡 Key Insights

### Key Observation

The order of moves does not matter; only the net count of opposing directions (U vs D, L vs R) determines the final position.

### Common Mistakes

- Using a 2D array or grid to simulate the movement, which is unnecessary and inefficient.
- Forgetting to reset the coordinate variables if the function is called multiple times in a class instance.

---

## 🔁 How to Approach Similar Problems

When a problem involves tracking a state through a sequence of operations, identify if the operations are commutative or if they can be reduced to a net change. If the order doesn't matter, use counters to track the net effect of each operation type. If the order does matter, simulate the process step-by-step using variables or a data structure to maintain the current state.

**Similar Problems to Practice:**

- Goal Parser Interpretation
- Check if the Sentence Is Pangram
- Determine if String Halves Are Alike

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

# 0957. Minimum Add to Make Parentheses Valid

> 🔗 [LeetCode](https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/) &nbsp;|&nbsp; 🏷 Medium &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 05 Aug 2026

---

## 📝 Problem Summary

The problem asks for the minimum number of parentheses (either '(' or ')') that must be added to a given string to make the entire sequence valid. A valid sequence is one where every opening parenthesis has a matching closing parenthesis in the correct order.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- parentheses/brackets sequence → Stack or balance counters
- minimum add to make valid → tracking unmatched elements

**Pattern(s) used:**

- Stack
- Greedy
- Simulation

---

## 🛠 Solution Approach

- Initialize a stack to keep track of unmatched parentheses.
- Iterate through each character of the string.
- If the current character is ')' and the top of the stack is '(', pop the '(' from the stack since they form a valid matching pair.
- Otherwise, push the current character (whether '(' or unmatched ')') onto the stack.
- After processing the entire string, the size of the stack represents the total number of unmatched parentheses, which is the minimum number of additions required.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(N)`

### Space Complexity

`O(N)`

> We traverse the string of length N exactly once, performing O(1) push and pop operations on the stack. In the worst case (e.g., all '(' or all ')'), the stack stores all N characters, requiring O(N) auxiliary space.

---

## ⚠️ Edge Cases to Consider

- Empty string — returns 0 because no additions are needed for an already valid empty sequence.
- Already valid string (e.g., '()()') — returns 0 as all brackets match and the stack ends up empty.
- Only open parentheses (e.g., '(((') — stack retains all elements, returning the length of the string.
- Only close parentheses (e.g., ')))') — stack retains all elements, returning the length of the string.

---

## 💡 Key Insights

### Key Observation

Any valid pair of adjacent parentheses '()' can be immediately eliminated from consideration because they cancel each other out. The remaining unmatched parentheses cannot be paired with each other and must each be resolved by adding a corresponding matching parenthesis.

### Common Mistakes

- Using a single integer balance counter that decrements below zero without tracking unmatched closing brackets separately (e.g., treating ')' followed by '(' as balanced when it actually requires 2 additions).
- Failing to handle the syntax error in the provided code where an unreachable 'else' block is placed after the return statement.

---

## 🔁 How to Approach Similar Problems

When dealing with nested or matching structures like brackets, HTML tags, or paired operations, think of a Stack. If you only need to count unmatched elements without reconstructing the string, optimize the O(N) space stack to O(1) space by using two counters: one for unmatched open brackets and one for unmatched close brackets.

**Similar Problems to Practice:**

- Valid Parentheses
- Minimum Remove to Make Valid Parentheses
- Generate Parentheses

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

# 1283. Reformat Date

> 🔗 [LeetCode](https://leetcode.com/problems/reformat-date/) &nbsp;|&nbsp; 🏷 Easy &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 18 Aug 2026

---

## 📝 Problem Summary

Convert a date string from 'Day Month Year' format (with English ordinal suffixes for days and abbreviated month names) into the standard 'YYYY-MM-DD' ISO format.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- "Day Month Year" format → String splitting by delimiter
- Abbreviated month names → Hash map lookup for translation
- Ordinal suffixes (st, nd, rd, th) → Slicing/substring manipulation
- Fixed-width output (e.g., 2-digit day/month) → Conditional zero-padding

**Pattern(s) used:**

- String Manipulation
- Hash Map / Lookup Table

---

## 🛠 Solution Approach

- Split the input date string by spaces to isolate the day, month, and year components.
- Initialize a lookup map containing the 12 month abbreviations mapped to their corresponding 2-digit string representations (e.g., 'Jan' -> '01').
- Extract the numeric day by removing the last two characters (the ordinal suffix) from the day component.
- Pad the day with a leading '0' if it is a single digit (length of 1).
- Construct and return the final formatted string in the order of 'YYYY-MM-DD' using a StringBuilder.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(1)`

### Space Complexity

`O(1)`

> The input string has a strictly bounded length (at most 15 characters), and the month lookup map has a constant size of 12 elements, resulting in constant time and space complexities.

---

## ⚠️ Edge Cases to Consider

- Single-digit days (e.g., '1st', '2nd') — Requires prepending a leading '0' to ensure a 2-digit 'DD' format.
- Double-digit days (e.g., '20th', '31st') — Must be parsed correctly without adding an extra leading '0'.
- Varying ordinal suffixes ('st', 'nd', 'rd', 'th') — Handled uniformly by stripping the last two characters of the day string regardless of the specific suffix.

---

## 💡 Key Insights

### Key Observation

The components of the date are always separated by spaces in a fixed order (Day, Month, Year), and the ordinal suffix of the day is always exactly two characters long, allowing for deterministic splitting and slicing.

### Common Mistakes

- Hardcoding the day substring indices (e.g., assuming day is always index 0 to 2) instead of dynamically slicing relative to the string's length, which fails for single-digit days.
- Forgetting to pad single-digit days or months with a leading zero.
- Manually writing complex conditional logic for month conversion instead of using a clean hash map or list lookup.

---

## 🔁 How to Approach Similar Problems

When faced with string reformatting and translation problems, first identify the delimiters to split the input into logical tokens. Use a hash map or lookup array for translating categorical tokens (like months or words) to their target values. Finally, apply conditional padding or slicing to normalize variable-length tokens (like days or numbers) to a fixed-width format before joining them back together.

**Similar Problems to Practice:**

- Reformat Phone Number
- Compare Version Numbers
- Most Common Word

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

# 1970. Sorting the Sentence

> 🔗 [LeetCode](https://leetcode.com/problems/sorting-the-sentence/) &nbsp;|&nbsp; 🏷 Easy &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 24 Aug 2026

---

## 📝 Problem Summary

The problem asks us to reconstruct a shuffled sentence where each word has its original 1-based position appended to its end. We need to extract these positions, strip them from the words, place the words in their correct order, and return the reconstructed sentence.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- words with appended numbers → bucket sort / direct placement
- reconstruct original order from shuffled indices → direct indexing

**Pattern(s) used:**

- String Manipulation
- Direct Placement

---

## 🛠 Solution Approach

- Split the input sentence by spaces to get an array of shuffled words.
- Initialize a result string array of the same size as the split array.
- Iterate through each word, extract the last character, and convert it to a 0-based index by subtracting '1'.
- Store the word (excluding the last character) at the calculated index in the result array.
- Join the sorted words from the result array using a StringBuilder, separating them with single spaces, and return the final string.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(N)`

### Space Complexity

`O(N)`

> We iterate through the string of length N to split and process each character exactly once, and we use O(N) auxiliary space to store the split words and the reconstructed sentence.

---

## ⚠️ Edge Cases to Consider

- Single word sentence — The loop runs once, extracts index '1', and correctly returns the word without the digit.
- Max length sentence (up to 9 words) — The indices are single digits ('1'-'9'), so extracting the last character works without needing multi-digit parsing.

---

## 💡 Key Insights

### Key Observation

The appended numbers are 1-based indices that directly map to the correct positions in the output array, allowing us to place each word in its final position in O(1) time per word without using a general-purpose sorting algorithm.

### Common Mistakes

- Using a heavy sorting algorithm like Arrays.sort() which takes O(N log N) instead of O(N) direct placement.
- Off-by-one errors when converting 1-based string indices to 0-based array indices.
- Forgetting to strip the trailing digit from the word before appending it to the final result.

---

## 🔁 How to Approach Similar Problems

When a problem requires sorting elements based on explicit, small, bounded integer keys embedded in the input, avoid comparison-based sorting. Instead, use direct placement (bucket sort style) by mapping the keys directly to array indices. This reduces the time complexity from O(N log N) to O(N).

**Similar Problems to Practice:**

- Shuffle String
- Cells in a Range on an Excel Sheet
- Reconstruct Original Digits from English

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

