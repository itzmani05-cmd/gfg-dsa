// User solved: Two Stacks in an Array
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Stack1/problem/implement-two-stacks-in-an-array
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        // code here
        top1++;
        arr[top1]=x;
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        // code here
        top2--;
        arr[top2]=x;
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        // code here
        if(top1==-1){
            return -1;
            
        }
        int value=arr[top1];
        top1--;
        return value;
    }
        
    // Function to remove an element from top of the stack2.
    int pop2() {
        // code here
        if(top2==size){
            return -1;
        }
        int value=arr[top2];
        top2++;
        return value;
    }
}