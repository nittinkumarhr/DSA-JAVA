# Trees Learning Guide

---

# 0404. Sum of Left Leaves

> 🔗 [LeetCode](https://leetcode.com/problems/sum-of-left-leaves/) &nbsp;|&nbsp; 🏷 Easy &nbsp;|&nbsp; 💻 Java &nbsp;|&nbsp; 📅 29 Aug 2026

---

## 📝 Problem Summary

The problem asks us to calculate the sum of all leaf nodes in a binary tree that are specifically the left child of their parent node. A leaf node is defined as a node with no left or right children.

---

## 🧭 Pattern Recognition

**How to spot this pattern in the problem statement:**

- binary tree traversal → BFS or DFS traversal
- left child condition → pass parent-to-child directional state during traversal
- leaf node check → verify node.left == null && node.right == null

**Pattern(s) used:**

- Breadth-First Search (BFS)
- Tree Traversal with State Tracking

---

## 🛠 Solution Approach

- Initialize a queue to store pairs of (TreeNode, Boolean), where the boolean flag indicates whether the node is a left child.
- Enqueue the root node with the flag set to false, as the root cannot be a left child.
- Initialize a running sum variable to 0.
- While the queue is not empty, dequeue the current pair.
- If the node is a leaf (both left and right children are null) and the left-child flag is true, add its value to the running sum.
- If the node has a left child, enqueue it with the flag set to true.
- If the node has a right child, enqueue it with the flag set to false.
- Return the accumulated sum after the queue is fully processed.

---

## ⏱ Complexity Analysis

### Time Complexity

`O(N)`

### Space Complexity

`O(N)`

> The time complexity is O(N) because we visit every node in the binary tree exactly once. The space complexity is O(N) because, in the worst case of a balanced or complete binary tree, the queue will hold up to O(N) nodes at the leaf level.

---

## ⚠️ Edge Cases to Consider

- Empty tree (root is null) — Handled immediately by returning 0.
- Single node tree — The root is not a left child, so the code correctly returns 0.
- Tree with only right children — No left leaves exist, so the code correctly returns 0.
- Negative node values — Handled correctly because the code adds node.val directly, allowing the sum to decrease or be negative.

---

## 💡 Key Insights

### Key Observation

A node cannot determine if it is a left child solely by examining itself; this contextual metadata must be passed down from the parent node during the traversal.

### Common Mistakes

- Counting all left nodes instead of only left leaf nodes (forgetting to check if both children are null).
- Counting the root node as a left leaf when it is the only node in the tree.
- Attempting to solve the problem recursively without passing a direction flag or checking the child's status from the parent's perspective.

---

## 🔁 How to Approach Similar Problems

When solving tree problems where a node's eligibility depends on its relationship with its parent (such as direction, depth, or path history), you must propagate this contextual state down during traversal. Whether using DFS (via helper parameters) or BFS (via tuple/pair structures), always bundle the node with its metadata to evaluate the condition correctly at each step.

**Similar Problems to Practice:**

- Sum Root to Leaf Numbers
- Path Sum
- Binary Tree Paths

---

## ✍️ Personal Notes

- **My observation:**
- **Mistakes I made:**
- **Better approach:**
- **Revision notes:**

=====================================================

