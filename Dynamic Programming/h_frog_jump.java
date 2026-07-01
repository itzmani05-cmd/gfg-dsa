// User solved: Frog Jump
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-DP-3/problem/geek-jump
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

    static int memo[];
    int minCost(int[] height) {
        // code here
        int n=height.length;
        memo=new int[n];
        Arrays.fill(memo,-1);
        return solve(height,n-1);
    }
    static int solve(int[] height, int i){
        if(i==0){
            return 0;
        }
        if(memo[i]!=-1){
            return memo[i];
        }
        int oneJump=solve(height, i-1)+Math.abs(height[i]-height[i-1]);
        int twoJump=Integer.MAX_VALUE;
        if(i>1){
            twoJump=solve(height,i-2)+Math.abs(height[i]-height[i-2]);
        }
        return memo[i]=Math.min(oneJump,twoJump);
    }
}