class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>path=new ArrayList<>();
        solve(0,ans,path,candidates,target);
        return ans;
    }
    void solve(int start,List<List<Integer>>ans,List<Integer>path,int [] candidates,int target){
        if(target==0){
            ans.add(new ArrayList<>(path));
            return ;
        }
        if(target<0) return;
        for(int i=start;i<candidates.length;i++){
            if(i>start && candidates[i]==candidates[i-1]) continue;
            path.add(candidates[i]);
            solve(i+1,ans,path,candidates,target-candidates[i]);
            path.remove(path.size()-1);
        }
    }
}