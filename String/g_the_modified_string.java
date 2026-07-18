// User solved: The Modified String
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Strings-4/problem/the-modified-string-1587115621
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public int modified(String s) {
        //  code here
        int count=1;
        int ans=0;
        int n=s.length();
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                count=1;
            }
            if(count==3){
                ans++;
                count=1;
            }
        }
        return ans;
    }
}