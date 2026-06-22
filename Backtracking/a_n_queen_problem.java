// User solved: N-Queen Problem
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPBacktracking/problem/n-queen-problem0315
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int[][] board= new int[n][n];
        solveRec(0,n,board,ans);
        return ans;
        
    }
    static boolean isSafe(int row, int col, int[][] board, int n){
        for(int j=0;j<col;j++){
            if(board[row][j]==1){
                return false;
            }
        }
        for(int i=row,j=col;i>=0&&j>=0;i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        for(int i=row,j=col;i<n&&j>=0;i++,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        return true;
    }
    
    static void solveRec(int col,int n,int[][] board, ArrayList<ArrayList<Integer>> ans){
        if(col==n){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<n;j++){
                for(int i=0;i<n;i++){
                    if(board[i][j]==1){
                        temp.add(i+1);
                        break;
                    }
                }
            }
            ans.add(temp);
            return;
        }