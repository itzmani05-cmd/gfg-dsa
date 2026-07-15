// User solved: Reverse Array Using Stack
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Stack1/problem/reverse-array-using-stack
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public void reverseArray(int[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            st.push(arr[i]);
        }
        for(int i=0;i<n;i++){
            arr[i]=st.pop();
        }
    }
}
