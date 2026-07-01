// User solved: Max Sum Subarray of size K
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Arrays-3/problem/max-sum-subarray-of-size-k5313
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n=arr.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        
        int res=sum;
        for(int i=k;i<n;i++){
            sum+=arr[i]-arr[i-k];
            res=Math.max(res,sum);
        }
        return res;
    }
}