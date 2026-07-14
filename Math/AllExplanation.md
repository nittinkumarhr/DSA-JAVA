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

# 1610. XOR Operation in an Array

> 🔗 [LeetCode](https://leetcode.com/problems/xor-operation-in-an-array/) &nbsp;|&nbsp; 🏷 Easy &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 13 Jul 2026

---

## 📝 Problem Summary

The problem asks us to generate an array of n integers where each element at index i is defined by the formula start + 2 * i, and then compute and return the bitwise XOR sum of all these generated elements.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- nums[i] = start + 2*i → Formulaic array generation
- bitwise XOR of all elements → Bit manipulation / Cumulative XOR reduction

**Pattern(s) used:**

- Bit Manipulation
- Simulation
- Mathematics

---

## 🛠 Solution Approach

- Initialize a variable to store the cumulative XOR sum.
- Iterate through the range from 0 to n - 1.
- In each iteration, compute the element value using the formula: start + 2 * i.
- XOR this computed value with the running XOR sum.
- Return the final XOR sum after the loop completes (avoiding array allocation to save space).

---

## ⏱ Complexity Analysis

### Time Complexity

`O(n)`

### Space Complexity

`O(n)`

> The provided solution loops exactly n times to populate the array and another n times to compute the XOR sum, resulting in O(n) time. It allocates an array of size n, resulting in O(n) auxiliary space.

---

## ⚠️ Edge Cases to Consider

- n = 1 — The loop for XORing should correctly return just the 'start' value without index out of bounds.
- Large start or n values — If start + 2*i exceeds Integer.MAX_VALUE, integer overflow can occur, though standard constraints usually prevent this.
- start = 0 — XORing with 0 acts as an identity operation, which must be handled correctly as the initial value of the XOR accumulator.

---

## 💡 Key Insights

### Key Observation

The elements generated are of the form start + 2*i, meaning they all share the same parity (all even or all odd). By shifting the numbers right by 1 bit, we get a sequence of consecutive integers, allowing us to use the O(1) mathematical pattern of consecutive XORs (which repeats every 4 integers) to optimize the solution.

### Common Mistakes

- Allocating an actual array of size n, which uses unnecessary O(n) memory when the XOR sum can be accumulated on the fly in O(1) space.
- Confusing the XOR operator '^' with exponentiation or other arithmetic operators.
- Failing to recognize that the problem can be solved in O(1) time using mathematical properties of XOR on consecutive numbers.

---

## 🔁 How to Approach Similar Problems

To solve bitwise sequence problems, start with a simple simulation using a loop to accumulate the bitwise state. If constraints are extremely tight (e.g., n > 10^9), look for mathematical properties of bitwise operations, such as the 4-step periodicity of XORing consecutive integers (XOR from 1 to N), to transition from an O(n) simulation to an O(1) mathematical formula.

**Similar Problems to Practice:**

- Single Number
- Decode XORed Array
- Find the Original Array of Prefix XOR

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

# 0007. Reverse Integer

> 🔗 [LeetCode](https://leetcode.com/problems/reverse-integer/) &nbsp;|&nbsp; 🏷 Medium &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 13 Jul 2026

---

## 📝 Problem Summary

The problem requires reversing the digits of a 32-bit signed integer and returning 0 if the reversed value overflows the 32-bit integer range.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- reverse digits → modulo and division operators
- 32-bit signed integer constraints → overflow check before final operation

**Pattern(s) used:**

- Math
- Modulo Arithmetic

---

## 🛠 Solution Approach

- Initialize a result variable as 0.
- While the input number is not 0, extract the last digit using modulo 10.
- Check if multiplying the current result by 10 will cause an overflow beyond Integer.MAX_VALUE or below Integer.MIN_VALUE.
- If safe, update result = result * 10 + digit.
- Divide the input number by 10 to remove the last digit.
- Return the result if no overflow occurred, otherwise return 0.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(log(n))`

### Space Complexity

`O(1)`

> The number of iterations is proportional to the number of digits in the integer, which is log10(n).

---

## ⚠️ Edge Cases to Consider

- Negative numbers — modulo operator in some languages preserves sign, requiring careful handling.
- Overflow — the reversed integer may exceed 2^31-1 or fall below -2^31, requiring a return of 0.
- Trailing zeros — the logic naturally handles these by shifting the result.

---

## 💡 Key Insights

### Key Observation

The last digit of a number is always obtained by 'n % 10', and the number is reduced by 'n / 10'; the reversed number is built by accumulating these digits into a new variable.

### Common Mistakes

- Failing to check for overflow before performing the multiplication.
- Assuming the input is always positive and ignoring sign handling.

---

## 🔁 How to Approach Similar Problems

When a problem involves manipulating digits of a number, think of modulo 10 and integer division by 10 as your primary tools. Always identify the constraints on the data type (e.g., 32-bit integer) early, as overflow detection is usually the most critical part of these problems. If the problem asks for reversal or digit-by-digit processing, treat the number as a sequence of digits and process from right to left.

**Similar Problems to Practice:**

- Palindrome Number
- String to Integer (atoi)
- Divide Two Integers

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

# 3172. Divisible and Non-divisible Sums Difference

> 🔗 [LeetCode](https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/) &nbsp;|&nbsp; 🏷 Easy &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 15 Jul 2026

---

## 📝 Problem Summary

The problem asks us to calculate the difference between two sums: the sum of all integers in the range [1, n] that are not divisible by m (num1), and the sum of all integers in the same range that are divisible by m (num2). The final output is num1 - num2.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- sum of integers in a range [1, n] with a divisibility condition -> Arithmetic Progression (AP) sum formula or linear simulation
- divisible and non-divisible sums -> partitioning a range into two complementary sets

**Pattern(s) used:**

- Math
- Simulation
- Arithmetic Progression

---

## 🛠 Solution Approach

- Initialize two variables, num1 and num2, to 0 to accumulate the non-divisible and divisible sums respectively.
- Iterate through all integers i from 1 to n inclusive.
- For each integer, check if it is divisible by m using the modulo operator (i % m == 0).
- If it is not divisible, add i to num1; otherwise, add i to num2.
- Return the difference num1 - num2.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(n)`

### Space Complexity

`O(1)`

> The loop runs exactly n times, performing constant-time arithmetic operations in each iteration, resulting in O(n) time complexity. Only a few integer variables are used, requiring O(1) auxiliary space. Note that this can be optimized to O(1) time using the arithmetic progression sum formula.

---

## ⚠️ Edge Cases to Consider

- m > n — when m is strictly greater than n, no numbers in the range are divisible by m, meaning num2 is 0 and num1 is the sum of all numbers from 1 to n.
- m = 1 — every number in the range is divisible by m, meaning num1 is 0 and num2 is the sum of all numbers from 1 to n.

---

## 💡 Key Insights

### Key Observation

The sum of all numbers from 1 to n is a known arithmetic progression sum, and the sum of multiples of m is also an arithmetic progression of the form m * (1 + 2 + ... + k) where k = floor(n/m). This allows the problem to be solved in O(1) time using the formula: Total Sum - 2 * (Sum of Multiples of m).

### Common Mistakes

- Off-by-one errors in the loop boundaries (e.g., iterating up to n-1 instead of n).
- Using integer division incorrectly when attempting the O(1) formula, leading to truncation errors.

---

## 🔁 How to Approach Similar Problems

When a problem asks for sums of elements in a range [1, n] satisfying a step condition (like divisibility by m), think of arithmetic progressions. You can partition the range into elements that satisfy the condition and those that do not. Use the formula Sum = k * (first + last) / 2 to compute these sums in O(1) time instead of simulating with a loop.

**Similar Problems to Practice:**

- Difference Between Element Sum and Digit Sum of an Array
- Sum of All Odd Length Subarrays
- Find Greatest Common Divisor of Array

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

