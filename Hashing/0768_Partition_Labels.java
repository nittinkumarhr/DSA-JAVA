/*
 * Problem: #768 - Partition Labels
 * Difficulty: Medium
 * Topic: hash-table, two-pointers, string, greedy
 * Runtime: 4 ms
 * Memory: 43.4 MB
 * Date: 23 Jul 2026
 * LeetCode: https://leetcode.com/problems/partition-labels/
 */

class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        int ch [] = new int [26];
        int indx;
        for(int i =0;i<n;i++){
            indx = s.charAt(i) - 'a';
            ch [indx] = i;
        ArrayList<Integer> res= new ArrayList();
        return res;
        }
        int i=0;
        while(i<n){
        }
            while(j<end){
                end = Math.max(end,ch[s.charAt(j)-'a']);
            }
    }
                j++;
            i =j+1;
            res.add(j-i+1);
            int lastindx = s.charAt(i)-'a';
            int end =ch[lastindx];
            int j=i;
}