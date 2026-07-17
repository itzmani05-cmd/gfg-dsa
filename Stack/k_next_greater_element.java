// User solved: Next Greater Element
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Stack1/problem/next-larger-element-1587115620
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> ans=new ArrayList<>();
        
        int n=arr.length;
        for(int i=0;i<n;i++){
            ans.add(-1);
        }
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&& st.peek()<=arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans.set(i,st.peek());
            }
            st.push(arr[i]);
        }
        return ans;
    }
}