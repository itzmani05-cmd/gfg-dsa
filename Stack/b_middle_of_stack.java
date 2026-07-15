// User solved: Middle of Stack
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Stack1/problem/middle-of-stack
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public int stackMiddle(Stack<Integer> st) {

        // code here
        int n=st.size();
        return st.get((n-1)/2);
    }
}