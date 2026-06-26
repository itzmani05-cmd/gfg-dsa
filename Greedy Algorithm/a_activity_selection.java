// User solved: Activity Selection
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Greedy1/problem/activity-selection-1587115620
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    class Activity{
        int start, finish;
        Activity(int s,int f){
            start=s;
            finish=f;
        }
    }
    public int activitySelection(int[] start, int[] finish) {
        int n=start.length;
        Activity[] arr=new Activity[n];
        
        for(int i=0;i<n;i++){
            arr[i]=new Activity(start[i],finish[i]);
        }
        Arrays.sort(arr,(a,b)->a.finish-b.finish);
        
        int res=1;
        int prev=0;
        for(int curr=1;curr<n;curr++){
            if(arr[curr].start>arr[prev].finish){
                res++;
                prev=curr;
            }
        }
        return res;
    }
}
