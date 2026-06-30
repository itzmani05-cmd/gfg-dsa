// User solved: All Subsequences of a String
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Recursion2-3/problem/power-set4302
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public List<String> powerSet(String s) {
        // Code here
        List<String> ans=new ArrayList<>();
        solve(s,0,"",ans);
        Collections.sort(ans);
        return ans;
    }
    void solve(String s, int i, String curr, List<String> ans){
        if(i==s.length()){
            ans.add(curr);
            return;
        }
        solve(s,i+1,curr+s.charAt(i),ans);
        solve(s,i+1,curr,ans);
    }
}