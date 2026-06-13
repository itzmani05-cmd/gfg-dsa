// User solved: Vertical Sum
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-BST-2/problem/vertical-sum
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/* Structure of binary tree node
class Node{
public:
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> verticalSum(Node root) {
        TreeMap<Integer,Integer> mp=new TreeMap<Integer,Integer>();
        ArrayList<Integer> ans=new ArrayList<>();
        vSum(root,0,mp);
        
        for(int sum:mp.values()){
            ans.add(sum);
        }
        return ans;
    }
    void vSum(Node root, int hd, TreeMap<Integer, Integer> mp){
        if(root==null){
            return;
        }
        vSum(root.left,hd-1,mp);
        int pSum=(mp.get(hd)==null)?0:mp.get(hd);
        mp.put(hd,pSum+root.data);
        vSum(root.right,hd+1,mp);
    }
}