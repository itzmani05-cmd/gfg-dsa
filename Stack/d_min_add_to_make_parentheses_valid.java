// User solved: Min Add to Make Parentheses Valid
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Stack1/problem/min-add-to-make-parentheses-valid
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public int minParentheses(String s) {
        // code here
        Stack<Character> st=new Stack<>();
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch =='('){
                st.push(ch);
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    count++;
                }
            }
        }
        return count+st.size();
    }
}
