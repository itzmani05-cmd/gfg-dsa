// User solved: Array Leaders
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Arrays-3/problem/leaders-in-an-array-1587115620
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result=new ArrayList<>();
        int maxRight=arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=maxRight){
                maxRight=arr[i];
                result.add(arr[i]);
            }
        }
        Collections.reverse(result);
        return result;
    }
}
