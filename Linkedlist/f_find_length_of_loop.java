// User solved: Find length of Loop
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-LinkedList-4/problem/find-length-of-loop
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast){
                int count=1;
                fast=fast.next;
                while(fast!=slow){
                    count++;
                    fast=fast.next;
                }
                return count;
            }
        }
        return 0;
    }
}