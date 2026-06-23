// User solved: Longest Common Subsequence
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-DP-3/problem/longest-common-subsequence-1587115620
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    static int[][] memo;
    static int lcs(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        
        memo= new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(memo[i],-1);
        }
        
        return solve(s1,s2,n-1,m-1);
        
    }
    
    static int solve(String s1, String s2, int n,int m){
        if(m<0||n<0){
            return 0;
        }
        if(memo[n][m]!=-1){
            return memo[n][m];
        }
        
        if(s1.charAt(n)==s2.charAt(m)){
            memo[n][m]=1+solve(s1,s2,n-1,m-1);
        }
        else{
            memo[n][m]=Math.max(solve(s1,s2,n-1,m),solve(s1,s2,n,m-1));
        }
        return memo[n][m];
    }
}