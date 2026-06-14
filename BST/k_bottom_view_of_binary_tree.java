// User solved: Bottom View of Binary Tree
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-BST-2/problem/bottom-view-of-binary-tree
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

        int hd;
        Pair(Node node, int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        
        Queue<Pair> queue=new LinkedList<>();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        queue.offer(new Pair(root,0));
        while(!queue.isEmpty()){
            Pair current=queue.poll();
            Node node =current.node;
            int hd=current.hd;
            
            map.put(hd,node.data);
            if(node.left!=null){
                queue.offer(new Pair(node.left,hd-1));
            }
            if(node.right!=null){
                queue.offer(new Pair(node.right,hd+1));
            }
        }
        for(int value:map.values()){
            result.add(value);
        }
        return result;