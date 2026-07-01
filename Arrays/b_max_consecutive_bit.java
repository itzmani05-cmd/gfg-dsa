// User solved: Max Consecutive Bit
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Arrays-3/problem/max-consecutive-one
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int res=0;
        int zeros=0;
        int ones=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                zeros=0;
                ones++;
            }
            else{
                ones=0;
                zeros++;
                
            }
            res=Math.max(res,Math.max(ones,zeros));
        }
        return res;
    }
}
