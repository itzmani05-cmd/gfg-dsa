// User solved: Check for BST
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-BST-2/problem/check-for-bst
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBST(Node root) {
        return checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        
    }
    public boolean checkBST(Node root, int min, int max){
        if(root==null){
            return true;
        }
        
        return(root.data>min&&root.data<max&&
            checkBST(root.left,min, root.data)&&checkBST(root.right,root.data,max));
    }
}