class Solution {
    static final long MOD = 1000000007;
    public int countGoodNumbers(long n) {
        
        long even=(n+1)/2;
        long odd=n/2;
        long evenWays=power(5,even)%MOD;
        long oddways=power(4,odd)%MOD;
        long ans=(evenWays*oddways) %MOD;
        return (int)ans;
    }
    private long power(long base,long exp){
        long result=1;
        while(exp>0){
            if((exp&1)==1){
                result=(result*base)%MOD;
            }
            base=(base*base)%MOD;
            exp>>=1;
        }
        return result;
    }
}