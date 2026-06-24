// User solved: Edit Distance
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-DP-3/problem/edit-distance3702
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

    static int[][] memo;
    public int editDistance(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        memo=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(memo[i],-1);
        }
        return solve(s1,s2,n-1,m-1);
    }
    
    static int solve(String s1, String s2, int i,int j){
        if(i<0){
            return j+1;
        }
        if(j<0){
            return i+1;
        }
        if(memo[i][j]!=-1){
            return memo[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return memo[i][j]= solve(s1,s2,i-1,j-1);
        }
        else{
            return memo[i][j]=1+Math.min(solve(s1,s2,i,j-1),Math.min(
            solve(s1,s2,i-1,j), solve(s1,s2,i-1,j-1)));
        }
        
    }
}