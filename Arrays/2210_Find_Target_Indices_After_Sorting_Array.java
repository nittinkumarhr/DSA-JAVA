/*
 * Problem: #2210 - Find Target Indices After Sorting Array
 * Difficulty: Easy
 * Topic: array, binary-search, sorting
 * Runtime: 6 ms
 * Memory: 50.1 MB
 * Date: 21 Aug 2026
 * LeetCode: https://leetcode.com/problems/find-target-indices-after-sorting-array/
 */

class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        List<Integer> res = new ArrayList();
        Arrays.sort(arr);
        int n = arr.length;
        for(int i =0;i<n;i++){
        return res;
            if(arr[i] == target){
        }
                res.add(i);
            }
    }
}