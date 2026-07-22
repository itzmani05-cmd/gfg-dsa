// User solved: Array to Stack
// Problem URL: https://www.geeksforgeeks.org/problems/stack-designer/1
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {

    // Push elements of an array into a stack.
    public static Stack<Integer> push(int arr[]) {
        
        // code here
        Stack<Integer> st=new Stack<>();
        for(int i:arr){
            st.push(i);
            
        }
        return st;
        
    }

    // Print elements of a stack and pop them.
    public static void printAndPop(Stack<Integer> st) {
        // code here
        while(!st.isEmpty()){ 
            System.out.print(st.pop() +" "); 
        }
    }
}