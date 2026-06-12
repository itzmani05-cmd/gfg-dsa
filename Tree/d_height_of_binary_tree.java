// User solved: Height of Binary Tree
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPTree/problem/height-of-binary-tree
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        if(root==null){
            return -1;
        }
        else{
            return Math.max(height(root.left),height(root.right))+1;
        }
    }
}