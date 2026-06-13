// User solved: Fixing Two nodes of a BST
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-BST-2/problem/fixed-two-nodes-of-a-bst
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

        left = null;
        right = null;
    }
}
*/

class Solution {
    Node prev=null,first=null,second=null;
    void correctBST(Node root){
        inorder(root);
        if(first!=null && second!=null){
            int temp=first.data;
            first.data=second.data;
            second.data=temp;
        }
    }
    void inorder(Node root) {
        if(root==null){
            return;
        }
        inorder(root.left);
        if(prev!=null && root.data<prev.data){
            if(first==null){
                first=prev;
            }
            second=root;
        }
        prev=root;
        inorder(root.right);
    }
}