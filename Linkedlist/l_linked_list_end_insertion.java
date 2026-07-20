// User solved: Linked List End Insertion
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-LinkedList-4/problem/linked-list-insertion-1587115620
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node ptr=new Node(x);
        if(head==null){
            return ptr;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        ptr.next=null;
        current.next=ptr;
        return head;
    }
}