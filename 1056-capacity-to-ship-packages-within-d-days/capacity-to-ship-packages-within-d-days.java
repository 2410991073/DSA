class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int i=0;i<weights.length;i++){
            low=Math.max(low,weights[i]);
            high+=weights[i];
        }

        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(weights,mid,days)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean possible(int []weights,int mid,int days){
        int day=1;
        int load=0;
        for(int w:weights){
            if(load+w<=mid){
                load+=w;
            }
            else{
                day++;
                load=w;
            }
        }
        return day<=days;
    }
}