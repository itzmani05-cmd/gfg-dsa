// User solved: Remove loop in Linked List
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-LinkedList-4/problem/remove-loop-in-linked-list
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

        // code here
        if(head==null||head.next==null){
            return;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==null|| fast.next==null){
            return;
        }
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
            
        }
        while(fast.next!=slow){
            fast=fast.next;
        }
        fast.next=null;
        
    }
}