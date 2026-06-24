// User solved: Parenthesis Checker
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Stack1/problem/parenthesis-checker2744
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

    public boolean isBalanced(String s) {
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else if(ch==')'){
                if(st.isEmpty()||st.pop()!='('){
                    return false;
                }
                
            }
            else if(ch=='}'){
                if(st.isEmpty()||st.pop()!='{'){
                    return false;
                }
                
            }
            else if(ch==']'){
                if(st.isEmpty()||st.pop()!='['){
                    return false;
                }
                
            }
            
        }
        return st.isEmpty();
    }
}
