// User solved: Implementation of Deque using circular array
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASPDeque/problem/implementation-of-deque-using-circular-array--174925
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

       for(int i=0;i<size-1;i++){
           arr[i]=arr[i+1];
       }
       size--;
    }

    public void deleteRear() {
        // Delete element from the rear
        if(isEmpty()){
            return;
            
        }
        size--;
    }

    public int frontEle() {
        // Get the front element
        if(isEmpty()){
            return -1;
        }
        return arr[0];
    }

    public int rearEle() {
        // Get the rear element
        if(isEmpty()){
            return -1;
        }
        return arr[size-1];
    }
}