// User solved: Predecessor and Successor
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-BST-2/problem/predecessor-and-successor
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

                    Node temp=root.left;
                    while(temp.right!=null){
                        temp=temp.right;
                    }
                    pre=temp;
                }
                if(root.right!=null){
                    Node temp=root.right;
                    while(temp.left!=null){
                        temp=temp.left;
                    }
                    suc=temp;
                }
                break;
            }
            else if(key<root.data){
                suc=root;
                root=root.left;
            }
            else{
                pre=root;
                root=root.right;
            }
        }
        
        //Storing the answer in the ans ArrayList<>()
        ArrayList<Node> ans=new ArrayList<>();
        ans.add(pre);
        ans.add(suc);
        return ans;
    }
}