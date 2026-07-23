/*
 * Problem: #768 - Partition Labels
 * Difficulty: Medium
 * Topic: hash-table, two-pointers, string, greedy
 * Runtime: 4 ms
 * Memory: 43.2 MB
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
    }
            i++;
            res.add(end -st +1);
            end = Math.max(end,ch[s.charAt(i)-'a']);
            if(i ==end){
            }
            st =end+1;
        int st = 0;
        int end =0;
}