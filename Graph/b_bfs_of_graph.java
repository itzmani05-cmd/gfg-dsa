// User solved: BFS of graph
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPGraph-5/problem/bfs-traversal-of-graph
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int h=adj.size();
        boolean[] visited= new boolean[h+1];
        ArrayList<Integer> arr=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        int s=0;
        visited[s]=true;
        q.add(s);
        while(!q.isEmpty()){
            int u=q.poll();
            arr.add(u);
            for(int v:adj.get(u)){
                if(!visited[v]){
                    visited[v]=true;
                    q.add(v);
                }
            }
        }
        return arr;
    }
}