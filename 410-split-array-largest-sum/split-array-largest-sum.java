class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;
        for(int i=0;i<nums.length;i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(nums,mid,k)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return low;
    }
    public boolean possible(int[]nums,int mid,int k){
        int count=1;
        int sum=0;
        for(int num:nums){
            if(sum+num<=mid){
                sum+=num;
            }
            else{
                count++;
                sum=num;
            }
        }
        return count<=k;
    }
}