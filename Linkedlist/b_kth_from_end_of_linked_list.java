// User solved: Kth from End of Linked List
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-LinkedList-4/problem/nth-node-from-end-of-linked-list
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        int count=0;
        for(Node curr=head;curr!=null;curr=curr.next){
            count++;
        }
        if(count<k){
            return -1;
        }
        Node curr=head;
        for(int i=0;i<count-k;i++){
            curr=curr.next;
        }
        return curr.data;
    }
}