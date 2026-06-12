// User solved: Max and min element in Binary Tree
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPTree/problem/max-and-min-element-in-binary-tree
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public static int findMax(Node root) {
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data,
            Math.max(findMax(root.left),findMax(root.right)));
    }

    public static int findMin(Node root) {
        if(root==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data,
            Math.min(findMin(root.left),findMin(root.right)));
    }
}