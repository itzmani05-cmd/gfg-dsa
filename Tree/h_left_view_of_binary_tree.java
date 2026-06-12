// User solved: Left View of Binary Tree
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPTree/problem/left-view-of-binary-tree
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    int maxLevel=0;
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> result=new ArrayList<>();
        int level=1;
        printLeftView(root,result,level);
        return result;
    }
    void printLeftView(Node root, ArrayList<Integer> result,int level){
        if(root==null){
            return;
        }
        if(maxLevel<level){
            result.add(root.data);
            maxLevel=level;
        }
        printLeftView(root.left,result,level+1);
        printLeftView(root.right,result,level+1); 
    }
}