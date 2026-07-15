// User solved: Validate Stack Operations
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Stack1/problem/stack-permutations
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public boolean validateOp(int[] a, int[] b) {
        // code here
        Stack<Integer> st=new Stack<>();
        int n=a.length;
        int m=b.length;
        int j=0;
        for(int i=0;i<n;i++){
            st.push(a[i]);
            while(!st.isEmpty() &&j<n&& st.peek()==b[j]){
                st.pop();
                j++;
            }
            
        }
        return st.isEmpty();
    }
}