// User solved: Minimum Indexed Character
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Strings-4/problem/minimum-indexed-character-1587115620
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public int minIndexChar(String s1, String s2) {
        // code here
        HashSet<Character> set=new HashSet<>();
        int n=s1.length();
        int m=s2.length();
        for(int i=0;i<m;i++){
            set.add(s2.charAt(i));
        }
        for(int i=0;i<n;i++){
            if(set.contains(s1.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}