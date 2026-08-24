/*
 * Problem: #1970 - Sorting the Sentence
 * Difficulty: Easy
 * Topic: string, sorting, bubble-sort
 * Runtime: 0 ms
 * Memory: 43 MB
 * Date: 24 Aug 2026
 * LeetCode: https://leetcode.com/problems/sorting-the-sentence/
 */

class Solution {
      public static String sortSentence(String s) {
    String[] str = s.split(" ");                
    String[] res = new String[str.length];  
    StringBuilder sb = new StringBuilder();     
    int i = 0;                          
    for (String elem : str) {
        i = (int) (elem.charAt(elem.length() - 1) - '0'); 
        res[i - 1] = elem.substring(0, elem.length() - 1);
    }
    //append the words from res[] to StringBuilder object to form a sentence
    for (i = 0; i < res.length - 1; i++)
        sb.append(res[i]).append(" ");
    sb.append(res[i]);
    return sb.toString();
}
}