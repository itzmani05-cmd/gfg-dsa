// User solved: Possible Words From Phone Digits
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Recursion2-3/problem/possible-words-from-phone-digits-1587115620
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

        // code here
        ArrayList<String> ans=new ArrayList<>();
        solve(arr,0,"",ans);
        return ans;
    }
    static void solve(int[] arr, int i,String curr, ArrayList<String> ans){
        if(i==arr.length){
            ans.add(curr);
            return;
        }
        String letters="";
        if(arr[i]==1 || arr[i]==0){
            solve(arr,i+1,curr,ans);
        }
        else if(arr[i]==2){
            letters="abc";
        }
        else if(arr[i]==3){
            letters="def";
        }else if(arr[i]==4){
            letters="ghi";
        }else if(arr[i]==5){
            letters="jkl";
        }else if(arr[i]==6){
            letters="mno";
        }else if(arr[i]==7){
            letters="pqrs";
        }
        else if(arr[i]==8){
            letters="tuv";
        }
        else if(arr[i]==9){
            letters="wxyz";
        }
        for(int j=0;j<letters.length();j++){
            solve(arr, i+1,curr+letters.charAt(j),ans);
        }
    }
}