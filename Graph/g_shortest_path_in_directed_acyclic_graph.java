// User solved: Shortest path in Directed Acyclic Graph
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPGraph-5/problem/shortest-path-in-undirected-graph
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

        }
    }
    public int[] shortestPath(int V, int E, int[][] edges) {
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        int indegree[]=new int[V];
        
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int weight=edge[2];
            
            adj.get(u).add(new Pair(v,weight));
            indegree[v]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        
        ArrayList<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.poll();
            ans.add(node);
            for(Pair neighbor:adj.get(node)){
                indegree[neighbor.v]--;
                if(indegree[neighbor.v]==0){
                    q.offer(neighbor.v);