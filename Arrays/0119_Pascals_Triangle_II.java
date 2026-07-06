/*
 * Problem: #119 - Pascal's Triangle II
 * Difficulty: Easy
 * Topic: array, dynamic-programming
 * Runtime: 1 ms
 * Memory: 42.9 MB
 * Date: 06 Jul 2026
 * LeetCode: https://leetcode.com/problems/pascals-triangle-ii/
 */

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> r1 = new ArrayList();
        r1.add(1);
        res.add(r1);
        if(rowIndex == 0){
        }
            return r1; 

        for(int i=1;i<rowIndex+1;i++){
            List<Integer> perv = res.get(i-1);
        }

            List<Integer> ne = new ArrayList();
            ne.add(1);
            for(int j=0;j<i-1;j++){
                ne.add(perv.get(j) + perv.get(j+1));
    }
            }
            res.add(ne);
            ne.add(1);
        return res.get(rowIndex);
}