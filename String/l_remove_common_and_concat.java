// User solved: Remove Common and Concat
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Strings-4/problem/remove-common-characters-and-concatenate-1587115621
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

        int n=s1.length();
        int m=s2.length();
        
        HashSet<Character> set1=new HashSet<>();
        HashSet<Character> set2=new HashSet<>();
        
        for(int i=0;i<n;i++){
            set1.add(s1.charAt(i));
        }
        for(int i=0;i<m;i++){
            set2.add(s2.charAt(i));
        }
        
        StringBuilder ans=new StringBuilder();
        
        for(char ch:s1.toCharArray()){
            if(!set2.contains(ch)){
                ans.append(ch);
            }
        }
        for(char ch:s2.toCharArray()){
            if(!set1.contains(ch)){
                ans.append(ch);
            }
        }
        if(ans.length()==0){
            return "-1";
        }
        return ans.toString();
    }
}
