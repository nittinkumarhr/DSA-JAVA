/*
 * Problem: #144 - Binary Tree Preorder Traversal
 * Difficulty: Easy
 * Topic: stack, tree, depth-first-search, binary-tree
 * Runtime: 0 ms
 * Memory: 42.9 MB
 * Date: 10 Sept 2026
 * LeetCode: https://leetcode.com/problems/binary-tree-preorder-traversal/
 */

*     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();
        if(root == null){
    public void helper(TreeNode root,List<Integer> res) {
    }
        res.add(root.val);
        helper(root.left ,res);
        if(root ==null){
            return;
        }
        helper(root.right, res);
            return res;
        }
        helper(root ,res);
        

    }
        return res;