/*
 * Problem: #885751 - World Chess Championship Practice Coding Problem
 * Difficulty: Difficulty:  935
 * Topic: Other
 * Runtime: N/A
 * Memory: N/A
 * Date: 01 Aug 2026
 * CodeChef: https://www.codechef.com/problems/WCC
 */

for (int i = 0; i < 14; i++) {
                char result = s.charAt(i);
                if (result == 'C') {
                    carlsenPoints += 2;
                } else if (result == 'N') {
                    chefPoints += 2;
                } else {
                    carlsenPoints += 1;
                    chefPoints += 1;
                }
            }
            
            // Determine prize money based on the scores
            if (carlsenPoints > chefPoints) {
                System.out.println(60 * X);
            } else if (carlsenPoints == chefPoints) {
                System.out.println(55 * X);
            } else {
                System.out.println(40 * X);
            }
        }
        
        scanner.close();
    }
}