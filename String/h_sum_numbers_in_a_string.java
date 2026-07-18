// User solved: Sum Numbers in a String
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Strings-4/problem/sum-of-numbers-in-string-1587115621
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public static int findSum(String s) {
        // code here
        int sum=0;
        int num=0;
        int n=s.length();
        
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else{
                sum=sum+num;
                num=0;
            }
        }
        sum+=num;
        return sum;
    }
}