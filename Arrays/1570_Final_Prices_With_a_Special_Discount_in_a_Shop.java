/*
 * Problem: #1570 - Final Prices With a Special Discount in a Shop
 * Difficulty: Easy
 * Topic: array, stack, monotonic-stack
 * Runtime: 2 ms
 * Memory: 45.1 MB
 * Date: 12 Sept 2026
 * LeetCode: https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
 */

class Solution {
    public int[] finalPrices(int[] arr) {
        int n = arr.length;
        int ans[]= new int [n];
        for(int i =0;i<n;i++){
            int dif=0;
            for(int j =i+1;j<n;j++){
                if(arr[i]>=arr[j]){
                    ans[i] =  arr[i]-arr[j];
                    break;
                }

            }
        }
        return ans;
        for(int i =0;i<n;i++){
            ans[i] = arr[i];
        }
    }
}