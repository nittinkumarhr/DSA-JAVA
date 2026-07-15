# Problem: #1601393 - Courses
# Difficulty: Medium
# Topic: Other
# Runtime: N/A
# Memory: N/A
# Date: 16 Jul 2026
# LeetCode: https://leetcode.com/problems/minimum-number-of-jumps-1587115620/

class Solution {
    public int minJumps(int[] arr) {
        // code here
        int ans = 0;
        for (int i = 0; i < arr.length - 1; ) {
        //    System.out.printf("i (prev) : %d , ", i);
            if(arr[i]==0) return -1;
            else if (i == arr.length - 1) return ans;
            else if (arr[i] + i >= arr.length - 1) return ++ans;
            int maxIdx = i + 1;
            for (int j = i+1; j < arr.length && j <= arr[i] + i; j++) {
                if(arr[j] != 0 && arr[maxIdx] + maxIdx < arr[j] + j) maxIdx = j;
            }
            i = maxIdx;
            ans++;
         //   System.out.printf("i(new) : %d , maxIdx: %d, ans: %d\n",i, maxIdx, ans);
        }
        return ans;
    }
}