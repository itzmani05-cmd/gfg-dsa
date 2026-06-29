// User solved: Sum Of Digits
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Recursion2-3/problem/sum-of-digits-of-a-number
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    static int sumOfDigits(int n) {
        // code here
        if(n==0){
            return 0;
        }
        return sumOfDigits(n/10)+n%10;
    }
}
