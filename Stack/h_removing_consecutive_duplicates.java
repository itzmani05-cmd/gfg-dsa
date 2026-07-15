// User solved: Removing consecutive duplicates
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Stack1/problem/removing-consecutive-duplicates-1587115621
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public static String removeConsecutiveDuplicates(String s) {
        // Your code here
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(st.isEmpty()|| st.peek()!=ch){
                st.push(ch);
            }
        }
        StringBuilder ans=new StringBuilder();
        for(char ch:st){
            ans.append(ch);
        }
        return ans.toString();
    }
}