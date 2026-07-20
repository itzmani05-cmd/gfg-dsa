// User solved: Delete Head of Linked List
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-LinkedList-4/problem/delete-head-of-linked-list
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
    public Node deleteHead(Node head) {
        // code here
        return head.next;
    }
}