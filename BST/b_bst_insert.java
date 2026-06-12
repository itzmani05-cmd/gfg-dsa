// User solved: BST Insert
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-BST-2/problem/insert-a-node-in-a-bst
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
    public Node insert(Node root, int x) {
        if(root==null){
            return new Node(x);
        }
        if(root.data>x){
            root.left=insert(root.left,x);
        }
        else if(root.data<x){
            root.right=insert(root.right,x);
        }
        return root;
        
    }
}
