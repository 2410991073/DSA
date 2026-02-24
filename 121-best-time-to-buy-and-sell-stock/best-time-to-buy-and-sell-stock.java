class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int n=prices.length;
        int maxprofit=0;
        int max=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else{
                int profit=prices[i]-min;
                maxprofit=Math.max(maxprofit,profit);
            }
        }
        return maxprofit;
    }
}