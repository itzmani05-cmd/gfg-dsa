// User solved: Closest in BST
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-BST-2/problem/find-the-closest-element-in-bst
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

        data = d;
        left = right = null;
    }
}
*/

class Solution {
    static int minDif;
    static int minDiff(Node root, int K) {
        minDif=Integer.MAX_VALUE;
        traversal(root,K);
        return minDif;
    }
    static void traversal(Node root,int K){
        if(root==null){
            return;
        }
        minDif= Math.min(minDif,Math.abs(root.data-K));
        
        if(K>root.data){
            traversal(root.right,K);        
        }
        else if(root.data>K){
            traversal(root.left,K);
        }
        else{
            minDif=0;
            return;
        }
    }
}