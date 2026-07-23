// User solved: Insertion at the beginning of Circular Linked List
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-LinkedList-4/problem/insertion-at-the-beginning-of-circular-linked-list
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
    public Node insertAtBeginning(Node tail, int key) {
        // code here
        Node newHead=new Node(key);
        Node head=tail.next;
        newHead.next=head;
        head=newHead;
        tail.next=head;
        return head;
    }
}