// User solved: Undirected Graph Cycle
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPGraph-5/problem/detect-cycle-in-an-undirected-graph
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    class Pair{
        int node;
        int parent;
        Pair(int node,int parent){
            this.node=node;
            this.parent=parent;
        }
    }
    public boolean isCycle(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(bfs(adj,i,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean bfs(ArrayList<ArrayList<Integer>> adj,int start, boolean[] visited){
        Queue<Pair> q=new LinkedList<>();
        visited[start] = true;
        q.offer(new Pair(start,-1));
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int node=curr.node;