// User solved: Sum of Nodes in BST Range
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-BST-2/problem/range-sum-of-bst
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
    int sum =0;
    public int nodeSum(Node root, int l, int r) {
        if(root==null){
            return 0;
        }
        nodeSum(root.left,l,r);
        if(root.data<=r && root.data>=l){
            sum+=root.data;
        }
        nodeSum(root.right,l,r);
        return sum;
    }
}
