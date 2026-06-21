// User solved: Rotate by 90 degree
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Matrix-3/problem/rotate-by-90-degree-1587115621
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public void rotateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                swap(mat,i,j,j,i);
            }
        }
        
        for(int i=0;i<n;i++){
            int low=0,high=n-1;
            while(low<high){
                swap(mat,low,i,high,i);
                low++;
                high--;
            }
        }
    }
    static void swap(int[][] mat, int r1,int c1, int r2, int c2){
        int temp=mat[r1][c1];
        mat[r1][c1]=mat[r2][c2];
        mat[r2][c2]=temp;
    }
}