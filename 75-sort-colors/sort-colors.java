class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int minidx=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[minidx]){
                    minidx=j;
                }
            }
            int temp=nums[minidx];
            nums[minidx]=nums[i];
            nums[i]=temp;
        }
    }
}