/*
 * Problem: #404 - Sum of Left Leaves
 * Difficulty: Easy
 * Topic: tree, depth-first-search, breadth-first-search, binary-tree
 * Runtime: 1 ms
 * Memory: 43.4 MB
 * Date: 29 Aug 2026
 * LeetCode: https://leetcode.com/problems/sum-of-left-leaves/
 */

public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        Queue<Pair<TreeNode, Boolean>> queue = new LinkedList<>();
        queue.offer(new Pair<>(root, false));  // (node, is_left)
        int totalSum = 0;
        
        while (!queue.isEmpty()) {
            Pair<TreeNode, Boolean> pair = queue.poll();
            TreeNode node = pair.getKey();
            boolean isLeft = pair.getValue();
            
            if (isLeft && node.left == null && node.right == null) {
                totalSum += node.val;
            }
            
            if (node.left != null) {
                queue.offer(new Pair<>(node.left, true));
            }
            if (node.right != null) {
                queue.offer(new Pair<>(node.right, false));
            }
        }
        
        return totalSum;
    }
}