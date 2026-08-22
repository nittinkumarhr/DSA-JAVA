/*
 * Problem: #1899 - Count Items Matching a Rule
 * Difficulty: Easy
 * Topic: array, string
 * Runtime: 8 ms
 * Memory: 50 MB
 * Date: 22 Aug 2026
 * LeetCode: https://leetcode.com/problems/count-items-matching-a-rule/
 */

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        for(List s : items){
            String type = (String)  s.get(0);
            String col = (String)  s.get(1);
            String  name  =  (String)  s.get(2);
            if (ruleKey.equals("type") && type.equals(ruleValue)) {
        int c =0;
                c++;
            }
            if (ruleKey.equals("color") && col.equals(ruleValue)) {
                c++;
            }
            if (ruleKey.equals("name") && name.equals(ruleValue)) {
                c++;
            }
        }
        return c;
    }
}