// User solved: Preorder to BST
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-BST-2/problem/preorder-to-postorder4423
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

        left = right = null;
    }
}
*/

class Solution {

    // Function that constructs BST from its preorder traversal.
    public Node preToBST(int pre[]) {
        Node root=null;
        int n=pre.length;
        for(int i=0;i<n;i++){
            root=insert(root,pre[i]);
            
        }
        return root;
    }
    Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=insert(root.left,data);
        }
        else{
            root.right=insert(root.right,data);
        }
        return root;
    }
}