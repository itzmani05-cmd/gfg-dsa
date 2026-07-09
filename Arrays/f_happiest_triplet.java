// User solved: Happiest Triplet
// Problem URL: https://www.geeksforgeeks.org/batch/dsa-self-paced-original-2026/track/DSASP-Arrays-3/problem/happiest-triplet2921
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

            int z=c[k];
            
            int max=Math.max(x, Math.max(y,z));
            int min=Math.min(x,Math.min(y,z));
            int diff=max-min;
            int sum=x+y+z;
            if(diff<bestDiff|| (diff==bestDiff&& sum<bestSum)){
                bestDiff=diff;
                bestSum=sum;
                ans.clear();
                int[] temp={x,y,z};
                Arrays.sort(temp);
                ans.add(temp[2]);
                ans.add(temp[1]);
                ans.add(temp[0]);
            }
            if(min==x){
                i++;
            }
            else if(min==y){
                j++;
            }
            else{
                k++;
            }
        }
        return ans;
        
    }
}
