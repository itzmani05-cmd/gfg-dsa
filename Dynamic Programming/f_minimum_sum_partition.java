// User solved: Minimum sum partition
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-DP-3/problem/minimum-sum-partition3317
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    static int[][] memo;
    public int minDifference(int arr[]) {
        int n=arr.length;
        int total=0;
        for(int x:arr){
            total+=x;
        }
        memo=new int[n][total+1];
        
        for(int i=0;i<n;i++){
            Arrays.fill(memo[i],-1);
        }
        
        return solve(arr,n-1,0,total);
    }
    
    static int solve(int[] arr,int i,int currSum, int total){
        if(i<0){
            return Math.abs(total-2*currSum);
        }
        if(memo[i][currSum]!=-1){
            return memo[i][currSum];
        }
        int take=solve(arr,i-1,currSum+arr[i],total);
        int nottake=solve(arr,i-1,currSum,total);
        
        return memo[i][currSum]= Math.min(take,nottake);
    }
}
