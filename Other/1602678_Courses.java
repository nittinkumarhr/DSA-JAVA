/*
 * Problem: #1602678 - Courses
 * Difficulty: Easy
 * Topic: Other
 * Runtime: N/A
 * Memory: N/A
 * Date: 24 Jul 2026
 * GeeksforGeeks: https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512
 */

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>(List.of(0,0));

        for (int i = 1; i < arr.length+1; i++) {
            map.put(i, 0);
        }
                
                
        for(int a: arr){
            map.put(a, map.get(a)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            
            if(entry.getValue() == 0){
                list.set(1,entry.getKey());
            }else if(entry.getValue() > 1){
                list.set(0,entry.getKey());
            }
        }
        
        return list;
    }
}