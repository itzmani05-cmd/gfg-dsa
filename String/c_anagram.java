// User solved: Anagram
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Strings-4/problem/anagram-1587115620
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    static int CHAR=256;
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        int n=s1.length();
        int m=s2.length();
        int count[]=new int[CHAR];
        return solve(s1,s2,n,m,count);
        
    }
    
    static boolean solve(String s1, String s2, int n, int m, int count[]){
        if(n!=m){
            return false;
        }  
        for(int i=0;i<n;i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0;i<CHAR;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
        
    }
}