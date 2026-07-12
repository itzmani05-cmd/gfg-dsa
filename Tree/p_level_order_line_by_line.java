// User solved: Level Order Line by Line
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPTree/problem/level-order-traversal-line-by-line
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

        left = right = null;
    }
}*/

class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        //  code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        Queue<Node> que=new LinkedList<>();
        que.add(root);
        
        while(!que.isEmpty()){
            int size=que.size();
            ArrayList<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node curr=que.poll();
                level.add(curr.data);
                if(curr.left!=null){
                    que.add(curr.left);
                }
                if(curr.right!=null){
                    que.add(curr.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}