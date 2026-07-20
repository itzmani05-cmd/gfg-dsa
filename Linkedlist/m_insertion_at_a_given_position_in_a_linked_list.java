// User solved: Insertion at a Given Position in a Linked List
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-LinkedList-4/problem/insertion-at-a-given-position-in-a-linked-list
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertPos(Node head, int pos, int val) {
        // code here
        Node ptr=new Node(val);
        Node current=head;
        if(pos==1){
            ptr.next=head;
            return ptr;
        }
        int i=1;
        while(i<pos-1 && current!=null){
            current=current.next;
            i++;
            
        }
        if(current==null){
            return head;
        }
        ptr.next=current.next;
        current.next=ptr;
        return head;
    }
}