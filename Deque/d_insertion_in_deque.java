// User solved: Insertion in deque
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPDeque/problem/insertion-in-deque
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public Deque<Integer> dqInsertion(List<Integer> arr) {
        // code here
        Deque<Integer> deq=new LinkedList<Integer>();
        for(int x:arr){
            deq.offerLast(x);
            
            
        }
        return deq;
    }
}