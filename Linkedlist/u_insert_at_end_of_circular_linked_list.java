// User solved: Insert at End of Circular Linked List
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-LinkedList-4/problem/insert-node-at-last-in-circular-linked-list
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/* Structure of circular linked list Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/
class Solution {
    Node insertAtEnd(Node tail, int key) {
        // code here
        Node temp=new Node(key);
        Node head=tail.next;
        temp.next=head;
        tail.next=temp;
        tail=temp;
        return tail;
    }
}