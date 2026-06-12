// User solved: Delete a node from BST
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-BST-2/problem/delete-a-node-from-bst
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/* Structure of a Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};
*/

class Solution {
    public Node delNode(Node root, int x) {
        if(root==null){
            return null;
        }
        if(root.data>x){
            root.left=delNode(root.left,x);
        }
        else if(root.data<x){
            root.right=delNode(root.right,x);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                Node succ=getSucc(root);
                root.data=succ.data;
                root.right=delNode(root.right,succ.data);
            }
        }
        return root;
    }
       