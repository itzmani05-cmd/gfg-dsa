// User solved: Stickler Thief
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-DP-3/problem/max-sum-without-adjacents2430
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    static int memo[];
    public int findMaxSum(int arr[]) {
        int n=arr.length;
        memo=new int[n];
        Arrays.fill(memo,-1);
        return solve(arr, n-1);
    }
    
    static int solve(int[] arr, int i){
        if(i<0){
            return 0;
        }
        if(memo[i]!=-1){
            return memo[i];
        }
        int take=arr[i]+solve(arr,i-2);
        int nottake=solve(arr,i-1);
        return memo[i]=Math.max(take,nottake);
    }
}