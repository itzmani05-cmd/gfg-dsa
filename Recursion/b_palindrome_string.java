// User solved: Palindrome String
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Recursion2-3/problem/palindrome-string0817
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    boolean isPalindrome(String s) {
        // code here
        
        int start=0;
        int end=s.length()-1;
        return solve(s, start, end);
        
    }
    boolean solve(String s, int start, int end){
        if(start>=end){
            return true;
        }
        if(s.charAt(start) != s.charAt(end)){
            return false;
        }
        return solve(s,start+1,end-1);
    }
}