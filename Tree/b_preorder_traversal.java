// User solved: Preorder Traversal
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPTree/problem/preorder-traversal
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
    
    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> result=new ArrayList<>();
        preOrderT(root,result);
        return result;
    }
    private void preOrderT(Node root, ArrayList<Integer> result){
        if(root!=null){
           result.add(root.data);
           preOrderT(root.left,result);
           preOrderT(root.right,result);
       }
    }
}