/*
 * Problem: #239 - Sliding Window Maximum
 * Difficulty: Hard
 * Topic: array, queue, sliding-window, heap-priority-queue, monotonic-queue
 * Runtime: N/A
 * Memory: N/A
 * Date: 05 Jul 2026
 * LeetCode: https://leetcode.com/problems/sliding-window-maximum/
 */

class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        if(n==1) return arr;
        int i=0 , j = k-1;
         ArrayList<Integer> res = new ArrayList<>();
        while(j<n){
            int i1=i, j1 = j;
            int max =-1;
            while( i1<=j1){
                if(arr[i1] > max){
                    max = arr[i1];
                }
                i1++;
            }
            res.add(max);
            i++;
            j++;
        }
        int s = res.size();
        int r[] = new int [s];
        for(int l = 0;l<s;l++){
            r[l]= res.get(l);
        }
        return r;
    }
}