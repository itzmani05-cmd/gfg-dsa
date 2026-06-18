// User solved: Count Strongly Connected
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPGraph-5/problem/strongly-connected-components-kosarajus-algo
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    // Function to find number of strongly connected components in the graph
    public int kosaraju(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int edge[]:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
        }
        Stack<Integer> st=new Stack<>();
        boolean[] visited= new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs1(i,adj,st,visited);
            }
        }
        
        ArrayList<ArrayList<Integer>> transpose=new ArrayList<>();
        for(int i=0;i<V;i++){
            transpose.add(new ArrayList<>());
        }
        
        for(int i=0;i<V;i++){
            for(int neighbor:adj.get(i)){
                transpose.get(neighbor).add(i);
            }
        }
        Arrays.fill(visited,false);
        int sccCount=0;