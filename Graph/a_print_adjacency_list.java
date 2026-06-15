// User solved: Print adjacency list
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPGraph-5/problem/print-adjacency-list-1587115620
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension


class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        return adj;
    }
}