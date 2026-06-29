// User solved: Deque deletion
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPDeque/problem/deque-deletion
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    public static void eraseAt(ArrayDeque<Integer> deq, int X) {
        // code here
        LinkedList<Integer> list=new LinkedList<>(deq);
        list.remove(X);
        deq.clear();
        deq.addAll(list);
        
    }

    public static void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {
        
        // code here
        LinkedList<Integer> list=new LinkedList<>(deq);
        for(int i=start;i<end;i++){
            list.remove(start);
        }
        deq.clear();
        deq.addAll(list);
    }

        
    public static void eraseAll(ArrayDeque<Integer> deq) {
        // code here
        deq.clear();
    }
}