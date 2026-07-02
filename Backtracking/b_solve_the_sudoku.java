// User solved: Solve the Sudoku
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPBacktracking/problem/solve-the-sudoku-1587115621
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

                    return false;
                }
            }
        }
        return true;
    }
    
    static boolean isSafe(int[][] grid, int row, int col, int num){
        for(int i=0;i<9;i++){
            if(grid[row][i]==num){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(grid[i][col]==num){
                return false;  
            }
        }
        int startRow=row-row%3;
        int startCol=col-col%3;
        for(int i=startRow;i<startRow+3;i++){
            for(int j=startCol; j<startCol+3;j++){
                if(grid[i][j]==num){
                    return false;
                }
            }
        }
        
        return true;
    }
}