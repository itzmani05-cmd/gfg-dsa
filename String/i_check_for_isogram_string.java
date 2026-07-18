// User solved: Check for Isogram String
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Strings-4/problem/check-if-a-string-is-isogram-or-not-1587115620
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension



class Solution {
    // Function to check if a string is Isogram or not.
    static boolean isIsogram(String data) {
        // Your code here
        HashSet<Character> set=new HashSet<>();
        
        int n=data.length();
        for(int i=0;i<n;i++){
            char ch=data.charAt(i);
            if(set.contains(ch)){
                return false;
            }
            set.add(ch);
        }
        return true;
    }
}