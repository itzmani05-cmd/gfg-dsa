// User solved: Matrix Boundary Traversal
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Matrix-3/problem/boundary-traversal-of-matrix-1587115620
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public ArrayList<Integer> boundaryTraversal(int matrix[][]) {
        ArrayList<Integer> ans=new ArrayList<>();
        int R=matrix.length;
        int C=matrix[0].length;
        
        if(R==1){
            for(int i=0;i<C;i++){
                ans.add(matrix[0][i]);
            }
        }
        else if(C==1){
            for(int i=0;i<R;i++){
                ans.add(matrix[i][0]);
            }
        }
        else{
            for(int i=0;i<C;i++){
                ans.add(matrix[0][i]);
            }
            for(int i=1;i<R;i++){
                ans.add(matrix[i][C-1]);
            }
            for(int i=C-2;i>=0;i--){
                ans.add(matrix[R-1][i]);
            }
            for(int i=R-2;i>0;i--){
                ans.add(matrix[i][0]);
            }
        }
        return ans;
    }
}
