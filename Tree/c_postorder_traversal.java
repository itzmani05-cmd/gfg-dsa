// User solved: Postorder Traversal
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPTree/problem/postorder-traversal
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> result=new ArrayList<>();
        postorderTraversal(root,result);
        return result;
    }
    private void postorderTraversal(Node root, ArrayList<Integer> result){
        if(root!=null){
            postorderTraversal(root.left,result);
            postorderTraversal(root.right,result);
            result.add(root.data);
        }
    }
}