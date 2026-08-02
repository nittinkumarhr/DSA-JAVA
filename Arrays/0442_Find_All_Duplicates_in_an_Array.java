/*
 * Problem: #442 - Find All Duplicates in an Array
 * Difficulty: Medium
 * Topic: array, hash-table, sorting
 * Runtime: 6 ms
 * Memory: 60.6 MB
 * Date: 02 Aug 2026
 * LeetCode: https://leetcode.com/problems/find-all-duplicates-in-an-array/
 */

class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int n= arr.length;
        ArrayList<Integer> res = new ArrayList();
        if(n ==1) return res;
        int feq[] = new int [100001];
        return res;
        
        for(int i=0;i<n;i++){
            feq[arr[i]]++;
        }
        for(int i=0;i<100001;i++){
            if(feq[i] == 2){
        }
                res.add(i);
            }
    }
}