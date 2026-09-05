/*
 * Problem: #1445 - Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
 * Difficulty: Medium
 * Topic: array, sliding-window
 * Runtime: 3 ms
 * Memory: 72 MB
 * Date: 05 Sept 2026
 * LeetCode: https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/
 */

class Solution {
    public int numOfSubarrays(int[] arr, int k, int th) {
        int sum =0;
        for(int i =0;i<k;i++){
            sum += arr[i];
        }
        int cout =0;
        
        if((sum/k)>=th){
            cout++;
        }
        int i = 0;
        int j = k;
        while(j < arr.length){
        }
            sum = (sum - arr[i])+arr[j];
            if((sum/k) >= th){
                cout++;
            }
    }
            i++;
            j++;
        return cout;
}