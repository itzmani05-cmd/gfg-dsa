// User solved: Remove the balls
// Problem URL: https://practice.geeksforgeeks.org/contest/stack-1615/problems
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    static class Pair{
        int color,radius;
        Pair(int color, int radius){
            this.color=color;
            this.radius=radius;
        }
    }
    public int findLength(int[] color, int[] radius) {
        // code here
        Stack<Pair> st=new Stack<>();
        int n=color.length;
        for(int i=0;i<n;i++){
            if(!st.isEmpty()&& st.peek().color==color[i]&&st.peek().radius==radius[i]){
                st.pop();
            }
            else{
                st.push(new Pair(color[i],radius[i]));
            }
        }
        return st.size();
        
    }
}