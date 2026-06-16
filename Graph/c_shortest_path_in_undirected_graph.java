// User solved: Shortest Path in Undirected Graph
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPGraph-5/problem/shortest-path-in-undirected-graph-having-unit-distance
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public int[] shortestPath(int V, int[][] edges, int src) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        boolean[] visited=new boolean[V];
        Queue<Integer> q= new LinkedList<>();
        int[] dist=new int[V];
        
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);