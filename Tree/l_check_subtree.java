// User solved: Check Subtree
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPTree/problem/check-if-subtree
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

*/

class Solution {
    public boolean isSubTree(Node root1, Node root2) {
        // code here
        if(root2==null){
            return true;
        }
        if(root1==null){
            return false;
            
            
        }
        if(isSame(root1,root2)){
            return true;
        }
        return isSubTree(root1.left,root2)||isSubTree(root1.right,root2);
    }
    boolean isSame(Node root1, Node root2){
        if(root1==null&& root2==null){
            return true;
        }
        if(root1==null||root2==null){
            return false;
        }
        if(root1.data!=root2.data){
            return false;
        }
        return isSame(root1.left,root2.left)&&isSame(root1.right,root2.right);
    }
}