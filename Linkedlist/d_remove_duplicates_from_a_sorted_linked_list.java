// User solved: Remove Duplicates from a Sorted Linked List
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-LinkedList-4/problem/remove-duplicate-element-from-sorted-linked-list
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

      data = d;
      next = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        // code here
        if(head==null){
            return null;
        }
        Node current=head;
        while(current!=null &&current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
        return head;
    }
}