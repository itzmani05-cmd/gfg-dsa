// User solved: Insertion at doubly linked list
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-LinkedList-4/problem/insert-a-node-in-doubly-linked-list
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        Node ptr=new Node(x);
        
        Node current=head;
        int i=0;
        while(i<p &&current!=null){
            current=current.next;
            i++;
        }
        if(current==null){
            return head;
        }
        ptr.next=current.next;
        ptr.prev=current;
        if(current.next!=null){
            current.next.prev=ptr;
        }
        current.next=ptr;
        return head;
        
    }
}