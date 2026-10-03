/*
 * Problem: #735 - Asteroid Collision
 * Difficulty: Medium
 * Topic: array, stack, simulation
 * Runtime: 5 ms
 * Memory: 47.2 MB
 * Date: 03 Oct 2026
 * LeetCode: https://leetcode.com/problems/asteroid-collision/
 */

while (!st.isEmpty() && (st.peek()>0 &&abs > st.peek())) {
                    st.pop();
                }
        }
                int abs = Math.abs(arr[i]);
                 if(abs == st.peek()){
                
                }
        }
        int[] reversedArray = new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            reversedArray[i] = st.pop();
        }
        return reversedArray;

            else {
            }
                    st.pop();
            if(arr[i]>0){
                st.push(arr[i]);
        for (int i = 0; i < n; i++) {
                 if (st.isEmpty() || st.peek()< 0) {
                    st.push(arr[i]);
                }
    }
}