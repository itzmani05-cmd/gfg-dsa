// User solved: Equilibrium Point
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Arrays-3/problem/equilibrium-point-1587115620
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int n=arr.length;
        int totalSum=0;
        for(int num:arr){
            totalSum+=num;
        }
        int leftSum=0;
        for(int i=0;i<n;i++){
            totalSum-=arr[i];
            if(leftSum== totalSum){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }
}
