// User solved: Most Frequent Character
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Strings-4/problem/maximum-occuring-character-1587115620
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        int[] freq=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        int max=0;
        char ans='a';
        for(int i=0;i<26;i++){
            if(freq[i]>max){
                max=freq[i];
                ans=(char) (i+'a');
            }
        }
        return ans;
        
    }
}