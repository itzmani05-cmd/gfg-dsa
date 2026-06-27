// User solved: Maximize The Cut Segments
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-DP-3/problem/cutted-segments1642
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    // Function to find the maximum number of cuts.
    static int[] memo;
    public int maximizeCuts(int n, int x, int y, int z) {
        memo= new int[n+1];
        Arrays.fill(memo,-2);
        int ans=solve(n,x,y,z);
        return Math.max(ans,0);
    }
    static int solve(int n, int x,int y, int z){
        if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }
        if(memo[n]!=-2){
            return memo[n];
        }
        int cutx=solve(n-x,x,y,z);
        int cuty=solve(n-y,x,y,z);
        int cutz=solve(n-z,x,y,z);
        int res=Math.max(cutx,Math.max(cuty,cutz));
        
        if(res==-1){
            return memo[n]=-1;
        }
        return memo[n]=res+1;
    }
}
