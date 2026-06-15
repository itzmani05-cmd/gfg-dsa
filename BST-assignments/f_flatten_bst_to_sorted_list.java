// User solved: Flatten BST to sorted list
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-BST-2/problem/flatten-bst-to-sorted-list--111950
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/*
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
    Node head=null;
    Node prev=null;
    public Node flattenBST(Node root) {
        inorder(root);
        return head;
    }
    void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        if(head==null){
            head=root;
        }
        if(prev!=null){
            prev.right=root;
        }
        root.left=null;
        prev=root;
        inorder(root.right);
    }
}
