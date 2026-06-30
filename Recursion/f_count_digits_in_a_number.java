// User solved: Count Digits in a Number
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Recursion2-3/problem/count-total-digits-in-a-number
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public static int countDigits(int n) {
        // Code here
        if(n==0){
            return 1;
        }
        int count=0;
        return solve(n,count);
    }
    static int solve(int n, int count){
        if(n==0){
            return count;
        }
        count++;
        return solve(n/10,count);
    }
}
