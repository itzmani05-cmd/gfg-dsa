// User solved: Non Repeating Character
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Strings-4/problem/non-repeating-character-1587115620
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        int n=s.length();
        int count[]=new int[256];
        return solve(s,n,count);
        
    }
    static char solve(String s, int n, int[] count){
        for(int i=0;i<n;i++){
            count[s.charAt(i)]++;
            
        }
        for(int i=0;i<n;i++){
            if(count[s.charAt(i)]==1){
                return s.charAt(i);
            }
        }
        return '$';
    }
}
