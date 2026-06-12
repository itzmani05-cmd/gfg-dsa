// User solved: K distance from root
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPTree/problem/k-distance-from-root
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
        left = null;
        right = null;
    }
};
*/

class Solution {
    public ArrayList<Integer> Kdistance(Node root, int k) {
        ArrayList<Integer> result=new ArrayList<>();
        PrintKDis(root, result, k);
        return result;
    }
    void PrintKDis(Node root,ArrayList<Integer> result, int k){
        if(root==null){
            return;
        }
        if(k==0){
            result.add(root.data);
        }
        PrintKDis(root.left,result,k-1);
        PrintKDis(root.right,result,k-1);
    }
};