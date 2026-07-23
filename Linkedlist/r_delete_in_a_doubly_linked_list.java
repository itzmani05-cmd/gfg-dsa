// User solved: Delete in a Doubly Linked List
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-LinkedList-4/problem/delete-node-in-doubly-linked-list
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

/* Structure of a Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        // code here
        if(head==null){
            return null;
        }
        if(x==1){
            head=head.next;
            if(head!=null){
                head.prev=null;
            }
            return head;
        }
        Node curr=head;
        for(int i=0;i<x-2;i++){
            curr=curr.next;
        }
        Node temp=curr.next;
        curr.next=temp.next;