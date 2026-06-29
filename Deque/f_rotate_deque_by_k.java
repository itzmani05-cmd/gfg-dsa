// User solved: Rotate Deque By K
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPDeque/problem/rotate-deque-by-k
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public static void rotateDeque(Deque<Integer> dq, int type, int k) {
        // code here
        int n=dq.size();
        k%=n;
        if(type==1){
            while(k-->0){
                int x=dq.removeLast();
                dq.addFirst(x);
            }
        }
        else{
            while(k-->0){
                int x=dq.removeFirst();
                dq.addLast(x);
            }
        }
    }
}