class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        boolean used[]=new boolean[nums.length];
        helper(nums,ans,list,used);
        return ans;
    }
    static void helper(int[]nums,List<List<Integer>>ans,List<Integer>list,boolean[] used){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return ;
        }

        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
             if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
                list.add(nums[i]);
                used[i]=true;
                helper(nums,ans,list,used);
                used[i]=false;
                list.remove(list.size()-1);
            }
        }
    }