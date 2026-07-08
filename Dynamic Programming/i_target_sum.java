// User solved: Target Sum
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-DP-3/problem/target-sum-1626326450
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    HashMap<String, Integer> memo= new HashMap<>();
    public int totalWays(int[] arr, int target) {
        return solve(arr,0,0,target);
    }
    int solve(int[] arr, int i, int sum, int target){
        if(i==arr.length){
            return (sum==target)?1:0;
        }
        String key=i+","+sum;
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        int plus= solve(arr,i+1,sum+arr[i],target);
        int minus=solve(arr, i+1,sum-arr[i],target);
        memo.put(key,plus+minus);
        return memo.get(key);
    }
}