// User solved: Top View of Binary Tree
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-BST-2/problem/top-view-of-binary-tree
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

    int hd;
    Node node;
    Pair(Node node, int hd){
        this.node=node;
        this.hd=hd;
    }
}

class Solution {
    public ArrayList<Integer> topView(Node root) {
        TreeMap<Integer,Integer> mp=new TreeMap<>();
        ArrayList<Integer> ans= new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<Pair> q=new LinkedList<>();
        
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            Pair curr=q.poll();
            Node node= curr.node;
            int hd=curr.hd;
            if(!mp.containsKey(hd)){
                mp.put(hd,node.data);
            }
            if(node.left!=null){
                q.offer(new Pair(node.left,hd-1));
            }
            if(node.right!=null){
                q.offer(new Pair(node.right,hd+1));
            }
        }
        
        for(int sum:mp.values()){
            ans.add(sum);
        }
        return ans;
    }
}