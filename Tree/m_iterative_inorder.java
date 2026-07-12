// User solved: Iterative Inorder
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPTree/problem/inorder-traversal-iterative
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
};
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        Stack<Node> st=new Stack<>();
        ArrayList<Integer> arr=new ArrayList<>();
        Node curr=root;
        while(curr!=null || !st.isEmpty()){
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();
            arr.add(curr.data);
            curr=curr.right;
        }
        return arr;
    }
}