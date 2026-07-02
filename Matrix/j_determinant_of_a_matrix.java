// User solved: Determinant of a Matrix
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Matrix-3/problem/determinant-of-a-matrix-1587115620
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension



class Solution {
    // Function for finding determinant of matrix.
    static int determinantOfMatrix(int matrix[][], int n) {
        if(n==1){
            return matrix[0][0];
        }
        if(n==2){
            return matrix[0][0]*matrix[1][1]-matrix[0][1]*matrix[1][0];
        }
        int det=0;
        
        for(int col=0;col<n;col++){
            int[][] minor= getMinor(matrix,n,col);
            int sign= (col%2==0)?1:-1;
            det+=sign*matrix[0][col]*determinantOfMatrix(minor,n-1);
        }
        return det;
    }
    
    static int[][] getMinor(int[][] matrix,int n, int skipCol){
        int[][] minor=new int[n-1][n-1];
        int r=0;
        for(int i=1;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(j==skipCol){
                    continue;
                }
                minor[r][c++]=matrix[i][j];
            }
            r++;
        }
        return minor;
    }
}
