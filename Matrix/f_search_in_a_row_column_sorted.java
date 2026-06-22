// User solved: Search in a Row-Column Sorted
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Matrix-3/problem/search-in-a-matrix17201720
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public static boolean matSearch(int mat[][], int x) {
       int top=0;
       int right=mat[0].length-1;
       
       while(top<mat.length&&right>=0){
           if(mat[top][right]==x){
               return true;
           }
           else if(mat[top][right]>x){
               right--;
           }
           else{
               top++;
           }
       }
       return false;
        
    }
}