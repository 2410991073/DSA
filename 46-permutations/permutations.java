class Solution {
    public List<List<Integer>> permute(int[] nums) {
    //     List<List<Integer>> ans=new ArrayList<>();
    //     List<Integer> list=new ArrayList<>();
    //     boolean [] used=new boolean[nums.length];
    //     helper(nums,ans,list,used);
    //     return ans;
    // }
    //     private void helper(int [] nums,List<List<Integer>>ans, List<Integer>list,boolean [] used){
    //         if(list.size()==nums.length){
    //             ans.add(new ArrayList<>(list));
    //             return ;

    //         }
    //         for(int i=0;i<nums.length;i++){
    //             if(!used[i]){
    //                 list.add(nums[i]);
    //                 used[i]=true;
    //                 helper(nums,ans,list,used);
    //                 used[i]=false;
    //                 list.remove(list.size()-1);
    //             }
    //         }
    //     }
    List<List<Integer>>ans=new ArrayList<>();
    List<Integer>list=new ArrayList<>();
    boolean[] used=new boolean[nums.length];
    helper(ans,list,used,nums);
    return ans;
    }
    void helper(List<List<Integer>>ans,List<Integer>list,boolean[]used,int[]nums){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(!used[i]){
                list.add(nums[i]);
                used[i]=true;
                helper(ans,list,used,nums);
                used[i]=false;
                list.remove(list.size()-1);
            }
        }
    }
    
}