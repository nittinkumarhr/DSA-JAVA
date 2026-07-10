/*
 * Problem: #347 - Top K Frequent Elements
 * Difficulty: Medium
 * Topic: array, hash-table, divide-and-conquer, sorting, heap-priority-queue, bucket-sort, counting, quickselect
 * Runtime: 15 ms
 * Memory: 47.8 MB
 * Date: 10 Jul 2026
 * LeetCode: https://leetcode.com/problems/top-k-frequent-elements/
 */

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int element : nums){
            map.put(element, map.getOrDefault(element,0)+1);
        }

        ArrayList<Map.Entry<Integer,Integer>> arr =
                new ArrayList<>(map.entrySet());

        arr.sort((a,b) -> b.getValue() - a.getValue());

        int[] last = new int[k];

        for(int i = 0; i < k; i++){
            last[i] = arr.get(i).getKey();
        }

        return last;
    }
}