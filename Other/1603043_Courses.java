/*
 * Problem: #1603043 - Courses
 * Difficulty: Medium
 * Topic: Other
 * Runtime: N/A
 * Memory: N/A
 * Date: 24 Jul 2026
 * GeeksforGeeks: https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809
 */

class Solution {
    public int longestSubarray(int[] arr, int k) {
        
        
        HashMap<Integer,Integer> ob=new HashMap<>();
        
        int n=arr.length;
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            
            if(sum==k){
             max=i+1;
            }
            if(ob.containsKey(sum-k)){
                max=Math.max(max,i-ob.get(sum-k));
            }
            if(!ob.containsKey(sum)){
                ob.put(sum,i);
            }
        }
       
        
         return max;
    }
}