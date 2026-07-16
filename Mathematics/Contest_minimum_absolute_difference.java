// User solved: Minimum Absolute Difference
// Problem URL: https://practice.geeksforgeeks.org/contest/mathematics-1614/problems
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    void generate(int x, HashSet<Integer> set){
        if(set.contains(x)){
            return;
        }
        set.add(x);
        if(x%2==0){
            generate(x/2,set);
        }
        else{
            generate(x*2,set);
        }
    }
    public int findMinAbsDiff(int a, int b) {
        // code here
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> s2=new HashSet<>();
        
        generate(a,s1);
        generate(b,s2);
        
        int ans=Integer.MAX_VALUE;
        for(int x:s1){
            for(int y:s2){
                ans=Math.min(ans, Math.abs(x-y));
            }
        }
        return ans;
    }
}