// User solved: Bridge edge in a graph
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPGraph-5/problem/bridge-edge-in-graph
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

           adj.get(u).add(v);
           adj.get(v).add(u);
           
        }
      
        int[] disc=new int[V];
        int[] low=new int[V];
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
           if(!visited[i]){
               dfs(i,-1,adj,visited,disc,low,c,d);
           }
        }
        return isBridge;
       
    } 
    private void dfs(int node,int parent, ArrayList<ArrayList<Integer>> adj, boolean[] visited, int[] disc, int[] low,int c, int d){
        visited[node]= true;
        disc[node]=low[node]=timer++;
        for(int neighbor:adj.get(node)){
            if(neighbor==parent){
                continue;
            }
            if(!visited[neighbor]){
                dfs(neighbor,node,adj,visited,disc,low,c,d);
                low[node]=Math.min(low[node],low[neighbor]);
                if(low[neighbor]> disc[node]){
                    if((node==c && neighbor==d) || (node==d && neighbor==c)){
                        isBridge=true;
                    }
                }
            }
            else{
                low[node]=Math.min(low[node],disc[neighbor]);
            }
        }
    }
}