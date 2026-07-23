// User solved: Circular Linked List Traversal
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-LinkedList-4/problem/circular-linked-list-traversal
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/* Structure of circular linked list node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public void printList(Node head) {
        // code here
       
        Node curr=head;
        while(curr.next!=head){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.print(curr.data+" ");
    }
    
}