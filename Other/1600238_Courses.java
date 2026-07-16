/*
 * Problem: #1600238 - Courses
 * Difficulty: Easy
 * Topic: Other
 * Runtime: N/A
 * Memory: N/A
 * Date: 17 Jul 2026
 * GeeksforGeeks: https://www.geeksforgeeks.org/problems/binary-search-1587115620
 */

class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
                
            }
        }
        return -1;
    }
}