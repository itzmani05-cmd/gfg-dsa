// User solved: Get min at pop
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Stack1/problem/get-min-at-pop
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class GetMin {
    public static Stack<Integer> _push(int arr[], int n) {
        // code here
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            st.push(arr[i]);
        }
        return st;
    }

    static void _getMinAtPop(Stack<Integer> s) {
        
        while(!s.isEmpty()){
            int min=Collections.min(s);
            System.out.print(min+" ");
            s.pop();
        }
    }
}