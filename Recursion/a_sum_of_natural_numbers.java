// User solved: Sum of Natural Numbers
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Recursion2-3/problem/sum-of-series2811
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
}