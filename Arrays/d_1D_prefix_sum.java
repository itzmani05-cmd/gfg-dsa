// User solved: 1-D prefix sum
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Arrays-3/problem/1-d-prefix-sum
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        
        ArrayList<Integer> ans=new ArrayList<>();
        for(int x:arr){
            ans.add(x);
        }
        return ans;
        
    }
}