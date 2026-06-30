// User solved: Lowest Common Ancestor in a BST
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-BST-2/problem/lowest-common-ancestor-in-a-bst
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public Node LCA(Node root, Node n1, Node n2) {
        // code here
        while(root!=null){
            if(n1.data<root.data&&n2.data<root.data){
                root=root.left;
            }
            else if(n1.data>root.data&&n2.data>root.data){
                root=root.right;
            
            }
            else{
                return root;
            }
        }
        return null;
        
    }