// User solved: DFS of Graph
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPGraph-5/problem/depth-first-traversal-for-a-graph
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans=new ArrayList<>();
        int s=0;
        int V=adj.size();
        boolean[] visited=new boolean[V+1];
        
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                DfsRec(adj,i,visited,ans);
            }
        }
        return ans;
    }
    void DfsRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, ArrayList<Integer> ans){
        visited[s]=true;
        ans.add(s);
        for(int u:adj.get(s)){
            if(visited[u]==false){
                DfsRec(adj,u,visited,ans);
            }
        }
    }
}