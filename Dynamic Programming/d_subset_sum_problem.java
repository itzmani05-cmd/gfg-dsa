// User solved: Subset Sum Problem
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-DP-3/problem/subset-sum-problem-1611555638
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    static int[][] memo;
    static Boolean isSubsetSum(int arr[], int sum) {
        int n=arr.length;
        memo=new int[n][sum+1];
        for(int i=0;i<n;i++){
            Arrays.fill(memo[i],-1);
            
            
        }
        return solve(arr,n-1,sum);
    }
    static boolean solve(int[] arr, int n,int sum){
        if(sum==0){
            return true;
        }
        if(n<0){
            return false;
        }
        if(memo[n][sum]!=-1){
            return memo[n][sum]==1;
        }
        boolean nottake=solve(arr,n-1,sum);
        boolean take=false;
        if(arr[n]<=sum){
            take=solve(arr,n-1,sum-arr[n]);
        }
        memo[n][sum]=(take||nottake)?1:0;
        return take||nottake;
        
    }
}