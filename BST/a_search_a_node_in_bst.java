// User solved: Search a node in BST
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-BST-2/problem/search-a-node-in-bst
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/*
Definition for Node
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
    public boolean search(Node root, int key) {
        if(root==null){
            return false;
        }
        else if(root.data==key){
            return true;
        }
        else if(root.data>key){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
    }
}