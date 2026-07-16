// User solved: Easy string
// Problem URL: https://practice.geeksforgeeks.org/contest/stack-1615/problems
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    String transform(String S) {
        // code here
        Stack<Character> st=new Stack<>();
        Stack<String> ans=new Stack<>();
        int n=S.length();
        for(int i=0;i<n;i++){
            char ch=Character.toLowerCase(S.charAt(i));
            st.push(ch);
        }
        while(!st.isEmpty()){
            char ch=st.pop();
            int count=1;
            while(!st.isEmpty() && st.peek()==ch){
                count++;
                st.pop();
            }
            ans.push(count+""+ch);
        }
        StringBuilder res=new StringBuilder();
        while(!ans.isEmpty()){
            res.append(ans.pop());
        }
        return res.toString();
    }
}