// User solved: Check for Subsequence
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Strings-4/problem/given-two-strings-find-if-first-string-is-a-subsequence-of-second
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public boolean isSubSeq(String s1, String s2) {
        // code here
       int n=s1.length();
       int m=s2.length();
       return solve(s1,s2,n,m);
       
        
    }
    static boolean solve(String s1, String s2, int n, int m){
        if(n==0){
            return true;
        }
        if(m==0){
            return false;
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return solve(s1,s2,n-1,m-1);    
        }
        else{
            return solve(s1,s2,n,m-1);
        }
         
    }
};