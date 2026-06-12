// User solved: Ceil in BST
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-BST-2/problem/implementing-ceil-in-bst
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
} */

class Solution {
    int findCeil(Node root, int x) {
        int ans=-1;
        while(root!=null){
            if(root.data==x){
                return root.data;
            }
            else if(root.data>x){
                ans=root.data;
                root=root.left;
            }
            else{
                root=root.right;
            }
        }
        return ans;
    }
}