// Problem: #1600437 - Duplicates in a Limited Range Array
// Difficulty: Easy
// Topic: Other
// Runtime: N/A
// Memory: N/A
// Date: 16 Jul 2026
// GeeksforGeeks: https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array

class Solution {
public ArrayList<Integer> findDuplicates(int[] arr) {
// code here
int n = arr.length;
boolean[] res = new boolean[n + 1];
ArrayList<Integer> ans = new ArrayList<>();
for (int i = 0; i < n; i++) {
if (res[arr[i]] == true) ans.add (arr[i]);
else res[arr[i]] = true;
}
return ans;
}
}