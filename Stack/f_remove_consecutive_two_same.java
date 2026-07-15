// User solved: Remove Consecutive Two Same
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Stack1/problem/removing-consecutive-duplicates-2-1587115621
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public String removePair(String s) {
        // code here
        int n=s.length();
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && st.peek() == ch){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        if(st.isEmpty()){
            return "-1";
        }
        StringBuilder ans=new StringBuilder();
        for(char ch:st){
            ans.append(ch);
        }
        return ans.toString();
    }
}