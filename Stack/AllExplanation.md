# Stack Learning Guide

---

# 0144. Binary Tree Preorder Traversal

> 🔗 [LeetCode](https://leetcode.com/problems/binary-tree-preorder-traversal/) &nbsp;|&nbsp; 🏷 Easy &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 10 Sept 2026

---

## 📝 Problem Summary

The problem asks us to perform a preorder traversal of a binary tree and return the values of the nodes in a list. Preorder traversal visits the nodes in the order: Root, Left subtree, Right subtree.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- binary tree → signals tree traversal techniques (DFS/BFS)
- preorder traversal → signals Root-Left-Right processing order

**Pattern(s) used:**

- Depth-First Search (DFS)
- Tree Traversal
- Recursion
- Stack

---

## 🛠 Solution Approach

- Initialize an empty list to store the traversal result.
- Define a recursive helper function that takes the current node and the result list.
- In the helper function, if the current node is null, return immediately (base case).
- Add the current node's value to the result list (Root step).
- Recursively call the helper function on the left child (Left step).
- Recursively call the helper function on the right child (Right step).
- Alternatively, for an iterative approach, use an explicit Stack: push the root, and while the stack is not empty, pop a node, record its value, and push its right child then its left child onto the stack.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(N)`

### Space Complexity

`O(H)`

> We visit every node exactly once, resulting in O(N) time complexity. The space complexity is determined by the recursion stack (or explicit stack), which is proportional to the height of the tree H (O(N) in the worst-case skewed tree, O(log N) in a balanced tree).

---

## ⚠️ Edge Cases to Consider

- Empty tree (root is null) — The code must return an empty list immediately without throwing a NullPointerException.
- Single node tree — The recursion should process the root and terminate immediately when encountering null children.
- Skewed tree (linked list style) — The recursion stack depth will reach N, which could cause stack overflow if N is extremely large; highlights the need for iterative or Morris traversal alternatives.

---

## 💡 Key Insights

### Key Observation

In preorder traversal, a node is processed before its children. When implementing this iteratively with a stack, because a stack is LIFO (Last-In-First-Out), we must push the right child before the left child to ensure the left child is processed first.

### Common Mistakes

- Pushing the left child before the right child in the iterative stack approach, which results in a right-to-left traversal.
- Forgetting to handle the null root edge case, leading to NullPointerException.
- Confusing preorder (Root-Left-Right) with inorder (Left-Root-Right) or postorder (Left-Right-Root).

---

## 🔁 How to Approach Similar Problems

When asked to traverse a tree structure, identify the required order of node processing. If it is Depth-First (Preorder, Inorder, Postorder), use recursion for simplicity, or an explicit Stack to avoid call stack overhead. For Preorder, process the current node first, then recurse left, then right. For iterative DFS, always remember that stack LIFO behavior requires pushing children in reverse order of their intended processing.

**Similar Problems to Practice:**

- Binary Tree Inorder Traversal
- Binary Tree Postorder Traversal
- N-ary Tree Preorder Traversal

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

