// User solved: Print Matrix in snake Pattern
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Matrix-3/problem/print-matrix-in-snake-pattern-1587115621
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    // Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        ArrayList<Integer> ans= new ArrayList<>();
        int R=matrix.length;

        for(int i=0;i<R;i++){
            if(i%2==0){
                for(int j=0;j<matrix[i].length;j++){
                    ans.add(matrix[i][j]);
                }
            }
            else{
                for(int j=matrix[i].length-1;j>=0;j--){
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }
}