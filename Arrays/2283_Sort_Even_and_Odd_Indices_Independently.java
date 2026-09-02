/*
 * Problem: #2283 - Sort Even and Odd Indices Independently
 * Difficulty: Easy
 * Topic: array, sorting
 * Runtime: 1 ms
 * Memory: 46 MB
 * Date: 02 Sept 2026
 * LeetCode: https://leetcode.com/problems/sort-even-and-odd-indices-independently/
 */

} else {
                odd[nums[i]]++;
            }
        }
        int e = 0;
        int o = 100;
        for (int i = 0; i < length; ++i) {
            if (i % 2 == 0) {
                // check even
                while (even[e] == 0) {
                    ++e;
                }
                nums[i] = e;
                even[e]--;
            } else {
                while(odd[o] == 0) {
                    --o;
                }
                nums[i] = o;
                odd[o]--;
            }
        }
        return nums;
    }
}