/*
 * Problem: #15 - 3Sum
 * Difficulty: Medium
 * Topic: array, two-pointers, sorting
 * Runtime: 37 ms
 * Memory: 59.2 MB
 * Date: 27 Jul 2026
 * LeetCode: https://leetcode.com/problems/3sum/
 */

while (l < r) {
                int sum = arr[l] + arr[r];
                if (sum == tar) {
                    res.add(Arrays.asList(arr[i], arr[l], arr[r])); // Fixed 
                    // Move pointers first to avoid infinite loops
                    l++;
                    r--;
                    
                    // Now safely skip duplicate values while ensuring 
                    'j' to 'l'
                    boundaries
                    while (l < r && arr[l] == arr[l - 1]) {
                        l++;
                    }
                    while (l < r && arr[r] == arr[r + 1]) {
                        r--;
                    }
                } else if (sum < tar) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return res;
    }
}