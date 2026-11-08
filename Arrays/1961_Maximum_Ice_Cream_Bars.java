/*
 * Problem: #1961 - Maximum Ice Cream Bars
 * Difficulty: Medium
 * Topic: array, greedy, sorting, counting-sort
 * Runtime: 5 ms
 * Memory: 81.5 MB
 * Date: 08 Nov 2026
 * LeetCode: https://leetcode.com/problems/maximum-ice-cream-bars/
 */

int[] count = new int[100001];
        for (int i = 0; i < n; i++) {
            count[costs[i]]++;
        }
                
        
                long totalCostOfPriceI = (long) i * count[i];
        for (int i = 1; i <= 100000; i++) {
            if (count[i] != 0) {
                // Using long avoids integer overflow during the multiplication
                    c += count[i];
                // Check if we can afford all ice creams of price 'i'
                if (totalCostOfPriceI <= coins) {
                    coins -= totalCostOfPriceI;
                } else {
                    // We can only afford a partial amount of ice creams at this price
                    int buyable = coins / i;
                    c += buyable;
                    break; // Out of coins for any future, more expensive ice creams
                }
            }
        }
        return c;
    }
}