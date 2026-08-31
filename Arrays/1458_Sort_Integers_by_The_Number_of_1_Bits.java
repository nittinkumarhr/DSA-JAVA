/*
 * Problem: #1458 - Sort Integers by The Number of 1 Bits
 * Difficulty: Easy
 * Topic: array, bit-manipulation, sorting, counting
 * Runtime: 9 ms
 * Memory: 46.6 MB
 * Date: 31 Aug 2026
 * LeetCode: https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
 */

other
        ArrayList<Node> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int count = OnesInNumber(arr[i]);
            list.add(new Node(arr[i], count));
        }
        
        // FIX 3: Sorted the list using your original sorting rules
        Collections.sort(list, new Comparator<Node>() {
            @Override
            public int compare(Node a, Node b) {
                if (a.bits != b.bits) {
                    return Integer.compare(a.bits, b.bits); // Sort by bit count
                }
                return Integer.compare(a.val, b.val); // Tie-breaker: sort by actual value
            }
        });

        // Put the sorted values back into the original array
        int idx = 0;
        for (Node node : list) {
            arr[idx] = node.val;
            idx++;
        }
        return arr;
    }
}