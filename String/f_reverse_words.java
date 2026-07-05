// User solved: Reverse Words
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Strings-4/problem/reverse-words-in-a-given-string5459
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public String reverseWords(String s) {
        // Code here
        String[] words=s.split("\\.+");
        StringBuilder ans=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            if(words[i].length()==0){
                continue;
            }
            if(ans.length()>0){
                ans.append(".");
            }
            ans.append(words[i]);
            
        }
        return ans.toString();
    }
}
