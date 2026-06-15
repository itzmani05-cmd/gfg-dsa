// User solved: Median of BST
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-BST-2/problem/median-of-bst
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

    }
}
*/

class Solution {
    int count=0;
    int curr=0;
    int ans1=-1,ans2=-1;
    public int findMedian(Node root) {
        count=0;
        curr=0;
        ans1=-1;
        ans2=-1;
        
        count(root); //for counting the element
        find(root);
        
        if(count%2==0){
            return ans1;
        }
        return ans1;
        
    }
    void count(Node root){
        if(root==null){
            return;
        }
        count(root.left);
        count++;
        count(root.right);
    }
    
    void find(Node root){
        if(root==null){
            return;
        }
        find(root.left);
        curr++;
        if(count%2==0){
            if(curr==count/2){