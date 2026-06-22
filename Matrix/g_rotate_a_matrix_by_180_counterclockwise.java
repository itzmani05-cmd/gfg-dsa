// User solved: Rotate a Matrix by 180 Counterclockwise
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Matrix-3/problem/c-matrix-rotation-by-180-degree0745
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public void rotateMatrix(int[][] mat) {
        int n=mat.length;
        int top=0,bottom=n-1;
        while(top<bottom){
            int[] temp=mat[top];
            mat[top]= mat[bottom];
            mat[bottom]=temp;
            top++;
            bottom--;
        }
        for(int i=0;i<n;i++){
            int left=0,right=n-1;
            while(left<right){
                int temp=mat[i][left];
                mat[i][left]=mat[i][right];
                mat[i][right]=temp;
                left++;
                right--;
            }
        }
    }
}