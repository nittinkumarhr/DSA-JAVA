/*
 * Problem: #3163 - Subarrays Distinct Element Sum of Squares I
 * Difficulty: Easy
 * Topic: array, hash-table, binary-indexed-tree, segment-tree
 * Runtime: 5 ms
 * Memory: 45 MB
 * Date: 19 Oct 2026
 * LeetCode: https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-i/
 */

class Solution {
    public int sumCounts(List<Integer> nums) {
        int  n = nums.size();
        int ans =0;
        for(int i=0;i<n;i++){
            int dis =0;
            boolean see[] = new boolean[101];
            for(int j=i;j<n;j++){
                int val = nums.get(j);
                if(!see[val]){
                    see[val] = true;
                    dis++;
                }
                ans += dis *dis;
            }
        }
        return ans;
        
    }
}