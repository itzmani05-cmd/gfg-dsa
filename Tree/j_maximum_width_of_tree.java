// User solved: Maximum Width of Tree
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPTree/problem/maximum-width-of-tree
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    int maxWidth(Node root) {
        if(root==null){
            return 0;
        }
        Queue<Node> q =new LinkedList<Node>();
        q.offer(root);
        int res=0;
        while(q.isEmpty()==false){
            int count=q.size();
            res=Math.max(res,count);
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return res;
    }
}