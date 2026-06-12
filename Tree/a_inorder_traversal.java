// User solved: Inorder Traversal
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPTree/problem/inorder-traversal
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans=new ArrayList<>();
        traverse(root,ans);
        return ans;
    }
    void traverse(Node root, ArrayList<Integer> ans){
        if(root!=null){
            traverse(root.left,ans);
            ans.add(root.data);
            traverse(root.right,ans);
        }
    }
}