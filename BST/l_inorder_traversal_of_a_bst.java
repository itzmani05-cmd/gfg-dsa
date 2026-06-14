// User solved: Inorder traversal of a BST
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-BST-2/problem/inorder-traversal-of-a-bst
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Tree {
    // Function to return a list containing the inorder traversal of the BST.
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> result=new ArrayList<>();
        traversal(root,result);
        return result;
    }
    void traversal(Node root, ArrayList<Integer> result){
        if(root == null){
            return;
        }
        traversal(root.left,result);
        result.add(root.data);
        traversal(root.right,result);
    }
}