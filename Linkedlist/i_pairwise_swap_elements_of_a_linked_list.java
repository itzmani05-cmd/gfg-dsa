// User solved: Pairwise swap elements of a linked list
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-LinkedList-4/problem/pairwise-swap-of-nodes-in-linkelist
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
};*/
class Solution {
    public Node pairwiseSwap(Node head) {
        
        // code here
        if(head==null||head.next==null){
            return head;
        }
        Node dummy=new Node(0);
        dummy.next=head;
        Node prev=dummy;
        while(prev.next!=null&&prev.next.next!=null){
            Node first=prev.next;
            Node second=first.next;
            
            first.next=second.next;
            second.next=first;
            prev.next=second;
            
            prev=first;
        }
        return dummy.next;
    }
}