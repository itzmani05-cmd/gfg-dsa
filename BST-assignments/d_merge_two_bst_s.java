// User solved: Merge two BST 's
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-BST-2/problem/merge-two-bst-s
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

        ArrayList<Integer> result=new ArrayList<>();
        
        inorder(root1,list1);
        inorder(root2,list2);
        
        int i=0;
        int j=0;
        
        while(i<list1.size() && j<list2.size()){
            if(list1.get(i)<list2.get(j)){
                result.add(list1.get(i));
                i++;
            }   
            else{
                result.add(list2.get(j));
                j++;
            }
        }
        while(i<list1.size()){
            result.add(list1.get(i));
            i++;
        }
        while(j<list2.size()){
            result.add(list2.get(j));
            j++;
        }
        return result;
        
    }
    
    void inorder(Node root, ArrayList<Integer> list){
        if(root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
}