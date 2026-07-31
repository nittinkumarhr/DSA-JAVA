/*
 * Problem: #1600383 - Courses
 * Difficulty: Medium
 * Topic: Other
 * Runtime: N/A
 * Memory: N/A
 * Date: 01 Aug 2026
 * GeeksforGeeks: https://www.geeksforgeeks.org/problems/multiply-two-strings
 */

}
            }
            if(carry > 0) {
                product[k] = carry;
            }
            
            carry = 0;
            for(int i = n+m-1; i >= 0; i--) {
                sum = product[i] + res[i] + carry;
                if(sum >= 10) {
                    res[i] = sum % 10;
                    carry = sum / 10;
                } else {
                    res[i] = sum;
                    carry = 0;
                }
            }
        }
        
        int l = 0;
        while(l < n+m && res[l] == 0) {
            l++;
        }
        
        if(sign == -1) {
            sb.append("-");
        }
        
        for(;l < m + n; l++) {
            sb.append((char)(res[l] + 48));
        }
        
        if(sb.toString().equals("-")) {
            return "0";
        }
        return sb.toString();
    }
}