// User solved: Delete Mid of a Stack
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Stack1/problem/delete-middle-element-of-a-stack
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        int n=s.size();
        int m=(n-1)/2;
        s.remove(m);
    }
}