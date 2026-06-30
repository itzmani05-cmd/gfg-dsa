// User solved: Digital Root
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Recursion2-3/problem/digital-root
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public int digitalRoot(int n) {
        if(n<10){
            return n;
        }
        return digitalRoot(solve(n));
    }
    static int solve(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+solve(n/10);
    }
};