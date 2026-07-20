// User solved: Deletion at the end of a Linked List
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-LinkedList-4/problem/deletion-at-the-end-of-a-linked-list
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Solution {
    public Node removeLastNode(Node head) {
        // code here
        if(head==null || head.next==null){
            return null;
        }
        Node current=head;
        while(current.next.next!=null){
            current=current.next;
        }
        current.next=null;
        return head;
    }
}