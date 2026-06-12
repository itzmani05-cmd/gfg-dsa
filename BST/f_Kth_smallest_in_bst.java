// User solved: k-th Smallest in BST
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-BST-2/problem/find-k-th-smallest-element-in-bst
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/*
Definition for Node
class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/


class Solution {
    int count=0;
    int ans=-1;
    void InorderTraversal(Node root, int k){
        if(root!=null){
            kthSmallest(root.left,k);
            count++;
            if(count==k){
                ans=root.data;
                return;
            }
            kthSmallest(root.right,k);
        }
    }
    
    public int kthSmallest(Node root, int k) {
        InorderTraversal(root,k);
        return ans;
    }
}