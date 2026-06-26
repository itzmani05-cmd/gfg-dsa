// User solved: Fractional Knapsack
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Greedy1/problem/fractional-knapsack-1587115620
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    class Item{
        int val,wt;
        double ratio;
        Item(int v, int w){
            this.val=v;
            this.wt=w;
            this.ratio=(double)v/w;
        }
    }
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n= val.length;
        Item[] arr=new Item[n];
        for(int i=0;i<n;i++){
            arr[i]= new Item(val[i],wt[i]);
        }
        
        Arrays.sort(arr, (a,b)->Double.compare(b.ratio,a.ratio));
        double ans=0.0;
        
        for(int i=0;i<n;i++){
            if(capacity>=arr[i].wt){
                ans+= arr[i].val;
                capacity-=arr[i].wt;
            }
            else{
                ans+= arr[i].ratio*capacity;
                break;
            }
        }
        return ans;
    }
}