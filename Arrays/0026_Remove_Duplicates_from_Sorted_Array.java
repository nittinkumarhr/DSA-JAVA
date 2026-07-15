/*
 * Problem: #26 - Remove Duplicates from Sorted Array
 * Difficulty: Easy
 * Topic: array, two-pointers
 * Runtime: 1 ms
 * Memory: 46.4 MB
 * Date: 15 Jul 2026
 * LeetCode: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

class Solution {
    public int removeDuplicates(int[] arr) {
        int n=arr.length;
        int j=1;
        int i =1;
        int c =1;

        
        while(j<n){
            if(arr[j]!=arr[j-1]){
        }
                int t= arr[j];
            }
    }
                arr[i]  = arr[j];
                arr[j] =t;
                i++;
            j++;
                c++;
        return c;
}