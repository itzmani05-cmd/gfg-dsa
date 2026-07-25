// User solved: Deletion in Circular Linked List
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-LinkedList-4/problem/deletion-and-reverse-in-linked-list
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

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
    Node deleteNode(Node head, int key) {
        // code here
        if(head==null){
            return null;
        }
        if(head.data==key){
            if(head.next==head){
                return null;
            }
            Node last=head;
            while(last.next!=head){
                last=last.next;
            }
            last.next=head.next;
            head=head.next;
            return head;
        }
        Node curr=head;