/*
 * Problem: #451 - Sort Characters By Frequency
 * Difficulty: Medium
 * Topic: hash-table, string, sorting, heap-priority-queue, bucket-sort, counting
 * Runtime: 380 ms
 * Memory: 48.2 MB
 * Date: 18 Jul 2026
 * LeetCode: https://leetcode.com/problems/sort-characters-by-frequency/
 */

class Solution {
    public String frequencySort(String s) {
    Map<Character, Integer> map = new HashMap<>();
        // 2. Optimized Entry List (Allocates exact required memory instantly)
        List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(map.entrySet());
        // 3. Optimized Sort (Reversed lambda avoids generic type-casting overhead)
        sortedList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        // 4. Use or Iterate through the sorted data
        for (Map.Entry<Character, Integer> entry : sortedList) {
        }
        for(int i=0;i<n;i++){
        int n = s.length();
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        return res;
            char c = entry.getKey();
            int num = entry.getValue();
        String res ="";
            while(num>0){
                res+=c;
            }
    }
                num--;
}