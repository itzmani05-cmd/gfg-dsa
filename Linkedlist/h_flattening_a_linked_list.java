// User solved: Flattening a Linked List
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-LinkedList-4/problem/flattening-a-linked-list
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

}
*/
class Solution {
    Node merge(Node a, Node b){
        Node dummy=new Node(0);
        Node temp=dummy;
        while(a!=null && b!=null){
            if(a.data<=b.data){
                temp.bottom=a;
                a=a.bottom;
            }
            else{
                temp.bottom=b;
                b=b.bottom;
                
            }
            temp=temp.bottom;
            temp.next=null;
        }
        if(a!=null){
            temp.bottom=a;
        }
        else{
            temp.bottom=b;
            
            
        }
        return dummy.bottom;
    }
    public Node flatten(Node root) {