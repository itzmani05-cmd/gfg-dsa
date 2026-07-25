// User solved: Reverse a Doubly Linked List
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-LinkedList-4/problem/reverse-a-doubly-linked-list
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        Node curr=head;
        Node temp=null;
        
        while(curr!=null){
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;
            
            curr=curr.prev;
        }
        if(temp!=null){
            head=temp.prev;
        }
        return head;
    }
}