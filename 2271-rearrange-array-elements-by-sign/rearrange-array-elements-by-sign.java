class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int posidx=0;
        int negidx=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans[posidx]=nums[i];
                posidx+=2;
            }
            else{
                ans[negidx]=nums[i];
                negidx+=2;
            }
        }
        return ans;
    }
}