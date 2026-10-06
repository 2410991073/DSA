class Solution {
    public int lastStoneWeightII(int[] stones) {
    int sum=0;
    for(int stone:stones){
        sum+=stone;
    }
    int target=sum/2;
    int n=stones.length;
    boolean[][]dp=new boolean[n][target+1];
    for(int i=0;i<n;i++){
        dp[i][0]=true;
    }
    if(stones[0]<=target){
        dp[0][stones[0]]=true;
    }
    for(int i=1;i<n;i++){
        for(int j=1;j<=target;j++){
            boolean take=false;
            boolean notake=dp[i-1][j];
            if(stones[i]<=j){
                take=dp[i-1][j-stones[i]];
            }
            dp[i][j]=take|| notake;
        }
    }
    for(int j=target;j>=0;j--){
        if(dp[n-1][j]){
            return sum-2*j;
        }
    }
    return 0;
    }
}