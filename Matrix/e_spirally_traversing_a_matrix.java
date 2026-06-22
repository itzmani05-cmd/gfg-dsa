// User solved: Spirally traversing a matrix
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Matrix-3/problem/spirally-traversing-a-matrix-1587115621
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        ArrayList<Integer> ans=new ArrayList<>();
        int top=0,bottom=mat.length-1,right=mat[0].length-1,left=0;
        while(top<=bottom&&left<=right){
            for(int i=left;i<=right;i++){
                ans.add(mat[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans.add(mat[i][right]);
            }
            right--;
            
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(mat[bottom][i]);
                }
                bottom--;
            }
            
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
