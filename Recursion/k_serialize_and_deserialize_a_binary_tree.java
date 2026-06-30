// User solved: Serialize and deserialize a binary tree
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPTree/problem/serialize-and-deserialize-a-binary-tree
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

    static void solve(Node root, ArrayList<Integer> ans){
        if(root==null){
            ans.add(EMPTY);
            return;
        }
        ans.add(root.data);
        solve(root.left,ans);
        solve(root.right,ans);
    }

    public Node deSerialize(ArrayList<Integer> arr) {
        // code here
        index=0;
        return solve1(arr);
     
    }
    static Node solve1(ArrayList<Integer> arr){
        if(index==arr.size()){
            return null;
        }
        int val=arr.get(index);
        index++;
        if(val==EMPTY){
            return null;
        }
        Node root=new Node(val);
        root.left=solve1(arr);
        root.right=solve1(arr);
        return root;
    }
};