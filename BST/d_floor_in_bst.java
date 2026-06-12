// User solved: Floor in BST
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-BST-2/problem/implementing-floor-in-bst
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int findMaxFork(Node root, int k) {
        int ans=-1;
        while(root!=null){
            if(root.data==k){
                return root.data;
            }
            if(root.data>k){
                root=root.left;
            }
            else{
                ans=root.data;
                root=root.right;
            }
        }
        return ans;
    }
}