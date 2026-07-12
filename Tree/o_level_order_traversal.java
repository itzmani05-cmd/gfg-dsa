// User solved: Level order traversal
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPTree/problem/level-order-traversal
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/* A binary tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    // Constructor
    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
};
*/

class Solution {
    public ArrayList<Integer> levelOrder(Node root) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        Queue<Node> que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            Node curr=que.poll();
            arr.add(curr.data);
            if(curr.left!=null){
                que.add(curr.left);
                
            }
            if(curr.right!=null){
                que.add(curr.right);
            }
        }
        return arr;
    }
}