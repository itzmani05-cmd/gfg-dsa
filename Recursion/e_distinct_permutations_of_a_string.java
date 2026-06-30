// User solved: Distinct Permutations of a String
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Recursion2-3/problem/permutations-of-a-given-string2041
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String> ans=new ArrayList<>();
        char[] ch=s.toCharArray();
        solve(ch, 0,ans);
        Collections.sort(ans);
        return ans;
    }
    void solve(char[] ch,int i,ArrayList<String> ans ){
        if(i==ch.length){
            ans.add(new String(ch));
            return;
        }
        HashSet<Character> set=new HashSet<>();
        for(int j=i;j<ch.length;j++){
            if(set.contains(ch[j])){
                continue;
            }
            set.add(ch[j]);
            swap(ch,i,j);
            solve(ch, i+1,ans);
            swap(ch,j,i);
        }
    }
    void swap(char[] ch, int i,int j){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }
}