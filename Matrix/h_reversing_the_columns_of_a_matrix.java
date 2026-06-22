// User solved: Reversing the columns of a Matrix
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Matrix-3/problem/reversing-the-columns-of-a-matrix-1587115621
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    // Function to reverse the columns of a matrix.
    static void reverseCol(int mat[][]) {
        int n=mat.length;
        int m=mat[0].length;
        
        for(int i=0;i<n;i++){
            int left=0,right=m-1;
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
