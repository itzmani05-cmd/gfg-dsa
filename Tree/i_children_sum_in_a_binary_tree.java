// User solved: Children Sum in a Binary Tree
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPTree/problem/children-sum-parent
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/*
class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/
class Solution {
    public boolean isSumProperty(Node root) {
       if(root==null){
           return true;
       }
       if(root.left==null && root.right==null){
           return true;
       }
       int sum=0;
       if(root.left!=null){
           sum=sum+root.left.data;
       }
       if(root.right!=null){
           sum=sum+root.right.data;
       }
       return (root.data==sum && isSumProperty(root.left)&& isSumProperty(root.right));
       
    }
}