class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>path=new ArrayList<>();
        solve(1,ans,path,n,k);
        return ans;

    }
    void solve(int start,List<List<Integer>>ans,List<Integer>path,int n,int k){
        if(path.size()==k){
            ans.add(new ArrayList<>(path));
            return ;
        }
        for(int i=start;i<=n;i++){
            path.add(i);
            solve(i+1,ans,path,n,k);
            path.remove(path.size()-1);
        }
    }
}