/*
 * Problem: #2329 - Maximum Product After K Increments
 * Difficulty: Medium
 * Topic: array, greedy, heap-priority-queue
 * Runtime: 336 ms
 * Memory: 90.9 MB
 * Date: 17 Oct 2026
 * LeetCode: https://leetcode.com/problems/maximum-product-after-k-increments/
 */

class Solution {
    public int maximumProduct(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int items :arr){
            pq.add(items);
        }
        for(int i=0;i<k;i++){
            int min = pq.remove();
        }
            min++;
            pq.add(min);
        while(!pq.isEmpty()){
        long res=1;

            res *= pq.poll();
        }
    }
        return (int)res;
            res = res % 1000000007;
}