class Solution {
    public int[] findErrorNums(int[] nums) {
        // int n=nums.length;
        // int actualSum=0;
        // Arrays.sort(nums);
        // int total=n*(n+1)/2;
        // for(int i=0;i<nums.length;i++){
        //     actualSum+=nums[i];
        // }
        // int []ans=new int[2];
        //     for(int i=1;i<n;i++){
        //         if(nums[i]==nums[i-1]){
        //             ans[0]=nums[i];
        //             ans[1]=nums[i]+(total-actualSum);
        //             }
        //     }
        //     return ans;
        int n=nums.length;
        int freq[]=new int[n+1];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        int r=-1;
        int m=-1;
        for(int i=1;i<=n;i++){
            if(freq[i]>1) r=i;
            else if(freq[i]==0) m=i;
        }
        return new int[]{r,m};
    }
 
}
