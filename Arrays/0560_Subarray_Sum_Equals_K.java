/*
 * Problem: #560 - Subarray Sum Equals K
 * Difficulty: Medium
 * Topic: array, hash-table, prefix-sum
 * Runtime: 25 ms
 * Memory: 48.8 MB
 * Date: 07 Jul 2026
 * LeetCode: https://leetcode.com/problems/subarray-sum-equals-k/
 */

class Solution {
    public int subarraySum(int[] arr, int k) {
        Map<Integer,Integer> res = new HashMap();
        res.put(0,1);
        for(int item : arr){
        }
        
        
        int ans =0 ,presum =0;
            presum += item;
            if(res.containsKey(presum -k)){
                ans += res.get(presum-k);
            }
    }
            res.put(presum ,res.getOrDefault(presum ,0)+1);
        return ans;
}