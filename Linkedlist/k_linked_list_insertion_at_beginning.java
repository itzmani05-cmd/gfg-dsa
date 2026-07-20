// User solved: Linked List Insertion At Beginning
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-LinkedList-4/problem/linked-list-insertion-at-beginning
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
    public Node insertAtFront(Node head, int x) {
        // code here
        Node current=new Node(x);
        current.next=head;
        head=current;
        return head;
    }
}