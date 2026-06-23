// User solved: Coin Change (Count Ways)
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-DP-3/problem/coin-change2448
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    static int memo[][];
    public int count(int coins[], int sum) {
        int n = coins.length;
        memo=new int[n+1][sum+1];
        
        for(int i=0;i<=n;i++){
            Arrays.fill(memo[i],-1);
        }
        return solve(coins,n,sum);
    }
    
    static int solve(int coins[], int n, int sum){
        if(sum==0){
            return 1;
        }
        if(sum<0){
            return 0;
        }
        if(n==0){
            return 0;
        }
        if(memo[n][sum]!=-1){
            return memo[n][sum];
        }
        return memo[n][sum]=solve(coins,n,sum-coins[n-1])+solve(coins,n-1,sum);
    }
}