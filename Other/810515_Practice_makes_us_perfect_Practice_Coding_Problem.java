/*
 * Problem: #810515 - Practice makes us perfect Practice Coding Problem
 * Difficulty: Difficulty:467
 * Topic: Other
 * Runtime: N/A
 * Memory: N/A
 * Date: 25 Jul 2026
 * CodeChef: https://www.codechef.com/problems/PRACTICEPERF
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int[] weeklyProblems = new int[4];
        int successfulWeeks = 0;
        
        //check if the entered number of the problem solved each week is greater than 
            or equal to 10
        for(int i=0; i<4; i++) 
        {
            weeklyProblems[i]= sc.nextInt();
            if (weeklyProblems[i]>=10) 
            {
                successfulWeeks++;
            }
        }
        
        System.out.println(successfulWeeks);