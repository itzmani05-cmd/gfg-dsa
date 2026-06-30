// User solved: Serialize and deserialize a binary tree
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPTree/problem/serialize-and-deserialize-a-binary-tree
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
}*/

class Solution {
    static final int EMPTY=-1;
    static int index;
    public ArrayList<Integer> serialize(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        solve(root, ans);
        return ans;
        
    }
    static void solve(Node root, ArrayList<Integer> ans){
        if(root==null){
            ans.add(EMPTY);
            return;
        }
        ans.add(root.data);
        solve(root.left,ans);
        solve(root.right,ans);
    }