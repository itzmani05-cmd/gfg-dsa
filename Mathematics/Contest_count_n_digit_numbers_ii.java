// User solved: Count n-digit Numbers - II
// Problem URL: https://practice.geeksforgeeks.org/contest/mathematics-1614/problems
// Language: Java
// Synced using GFG -> GitHub Sync Chrome Extension

class Solution {
    static long MOD=1000000007;
    static long power(long a, long n){
        long res=1;
        while(n>0){
            if(n%2==1){
                res=(res*a)%MOD;
                
            }
            a=(a*a)%MOD;
            n/=2;
        }
        return res;
    }
    public int countNumbers(long n) {
        // code here
        long ans=(power(4,n)+power(3,n))%MOD;
        ans=(ans+1)%MOD;
        return (int)ans;
    }
}
