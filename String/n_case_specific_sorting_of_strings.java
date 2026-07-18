// User solved: Case-specific Sorting of Strings
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Strings-4/problem/case-specific-sorting-of-strings4845
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public static String caseSort(String s) {
        // code here
        ArrayList<Character> arr1=new ArrayList<>();
        ArrayList<Character> arr2=new ArrayList<>();
        int n=s.length();
        for(char ch:s.toCharArray()){
            if(Character.isUpperCase(ch)){
                arr1.add(ch);
            }
            else{
                arr2.add(ch);
            }
        }
        
        Collections.sort(arr1);
        Collections.sort(arr2);
        
        StringBuilder ans=new StringBuilder();
        
        int i=0,j=0;
        for(char ch:s.toCharArray()){
            if(Character.isUpperCase(ch)){
                ans.append(arr1.get(i++));
            }
            else{
                ans.append(arr2.get(j++));
            }
        }
        return ans.toString();
    }
}