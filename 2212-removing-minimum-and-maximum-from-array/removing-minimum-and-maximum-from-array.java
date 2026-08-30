class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int minindex=0;
        int maxindex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[maxindex]){
                maxindex=i;
            }
            if(nums[i]<nums[minindex]){
                minindex=i;
            }

        }
        int fromleft=Math.max(minindex,maxindex)+1;
        int fromright=n-Math.min(minindex,maxindex);
        int fromBoth=Math.min(minindex,maxindex)+1+n-Math.max(minindex,maxindex);
        return Math.min(fromleft,Math.min(fromright,fromBoth));
    }
}