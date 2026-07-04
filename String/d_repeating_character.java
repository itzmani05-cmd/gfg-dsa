// User solved: Repeating Character
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Strings-4/problem/repeating-character-first-appearance-leftmost
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    static int CHAR=256;
    public int repeatedCharacter(String S) {
        // code here
        int n=S.length();
        int count[]=new int[CHAR];
        return solve(S, n,count);
    }
    
    static int solve(String s, int n,int count[]){
        for(int i=0;i<n;i++){
            count[s.charAt(i)]++;
        }
        for(int i=0;i<n;i++){
            if(count[s.charAt(i)]>1){
                return i;
            }
        }
        return -1;
    }
}