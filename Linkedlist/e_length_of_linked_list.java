// User solved: Length of Linked List
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-LinkedList-4/problem/count-nodes-of-linked-list
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }
}
*/
class Solution {
    public int getCount(Node head) {
        // code here
        int count=0;
        if(head==null){
            return count;
        }
        Node current=head;
        while(current!=null && current.next!=null){
            count++;
            current=current.next;
        }
        return count+1;
    }
}