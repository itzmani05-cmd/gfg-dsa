// User solved: Ways to Reach the n'th Stair
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-DP-3/problem/count-ways-to-reach-the-nth-stair-1587115620
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    int[] memo;
    public int countWays(int n) {
        // code here
        memo=new int[n+1];
        Arrays.fill(memo,-1);
        return solve(n);
    }
    int solve(int n){
        if(n==0){
            return 1;
            
        }
        if(n==1){
            return 1;
        }
        if(memo[n]!=-1){
            return memo[n];
        }
        return memo[n]=solve(n-1)+solve(n-2);
    }
}