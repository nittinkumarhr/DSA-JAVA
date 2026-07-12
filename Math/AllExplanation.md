# Math Learning Guide

---

# 0258. Add Digits

> 🔗 [LeetCode](https://leetcode.com/problems/add-digits/) &nbsp;|&nbsp; 🏷 Easy &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 10 Jul 2026

---

## Problem Summary

Problem #258 — Add Digits. Difficulty: Easy.

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

- math
- simulation
- number-theory

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

# 2608. Count the Digits That Divide a Number

> 🔗 [LeetCode](https://leetcode.com/problems/count-the-digits-that-divide-a-number/) &nbsp;|&nbsp; 🏷 Easy &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 12 Jul 2026

---

## Problem Summary

Given an integer, count the number of its individual digits that can evenly divide the original number without leaving a remainder.

---

## AI-Powered Solution Explanation

- Store the original number in a temporary variable to preserve it for division checks.
- Iterate through each digit of the number by repeatedly extracting the last digit using the modulo operator.
- Reduce the temporary number by dividing it by 10 in each iteration to shift to the next digit.
- Check if the original number is divisible by the extracted digit without a remainder.
- Increment the counter if the divisibility condition is met, and return the final count after processing all digits.

---

## AI Complexity Analysis

### Time Complexity

`O(log10(N))`

### Space Complexity

`O(1)`

> The time complexity is proportional to the number of digits in the input number, which is floor(log10(num)) + 1, while the space complexity is constant as only a few primitive variables are used.

---

## AI Learning Insights

### Pattern

- Math
- Digit Extraction

### Key Observation

Preserving the original number in a separate variable is crucial because we need to divide the original value by each of its individual digits, which are extracted by progressively destroying a copy of the number.

### Similar Problems

- Subtract the Product and Sum of Digits of an Integer
- Self Dividing Numbers
- Find Numbers with Even Number of Digits

### Common Mistakes

- Modifying the original number directly during digit extraction, which makes the final divisibility check incorrect.
- Using string conversion unnecessarily, which increases space complexity to O(log N) instead of O(1).
- Failing to consider division-by-zero errors in scenarios where the input number contains the digit 0 (though constraints here may prevent it).

---

## Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

# 2752. Sum Multiples

> 🔗 [LeetCode](https://leetcode.com/problems/sum-multiples/) &nbsp;|&nbsp; 🏷 Easy &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 13 Jul 2026

---

## 📝 Problem Summary

Given a positive integer n, the problem asks us to find the sum of all integers in the range [1, n] inclusive that are divisible by 3, 5, or 7.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- range [1, n] -> linear scan or mathematical formula
- divisible by 3, 5, or 7 -> modulo operations or Principle of Inclusion-Exclusion (PIE)

**Pattern(s) used:**

- Brute Force
- Mathematics

---

## 🛠 Solution Approach

- Initialize an accumulator variable `sum` to 0.
- Loop through each integer `i` from 1 up to `n` inclusive.
- Check if `i` is divisible by 3, 5, or 7 using the modulo operator (`i % 3 == 0 || i % 5 == 0 || i % 7 == 0`).
- If the condition is met, add `i` to `sum`.
- Return the accumulated `sum` after the loop terminates.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(n)`

### Space Complexity

`O(1)`

> The algorithm iterates from 1 to n exactly once, performing constant-time arithmetic operations at each step. No auxiliary space is used.

---

## ⚠️ Edge Cases to Consider

- n < 3 — The loop runs but no numbers satisfy the condition, correctly returning 0.
- n is a multiple of multiple targets (e.g., 15, 105) — The logical OR operator ensures these numbers are only added once, avoiding double-counting.

---

## 💡 Key Insights

### Key Observation

For small constraints (n <= 10^3), a simple linear scan is highly efficient and less prone to off-by-one errors than a mathematical approach. However, for large n, the Principle of Inclusion-Exclusion (PIE) can solve this in O(1) time.

### Common Mistakes

- Using separate 'if' statements instead of logical OR ('||'), which causes common multiples (like 15) to be added multiple times.
- Using integer division ('/') instead of the modulo operator ('%') to check for divisibility.

---

## 🔁 How to Approach Similar Problems

When dealing with divisibility of numbers in a range, first check the constraints on 'n'. If 'n' is small, a simple loop with modulo checks is the safest approach. If 'n' is extremely large (e.g., up to 10^9), use the Principle of Inclusion-Exclusion (PIE) to calculate the sum of arithmetic progressions in O(1) time.

**Similar Problems to Practice:**

- Three Divisors
- Ugly Number
- Self Dividing Numbers

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

