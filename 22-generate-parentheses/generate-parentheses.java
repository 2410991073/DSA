class Solution {
    public List<String> generateParenthesis(int n) {
    //     List<String>ans=new ArrayList<>();
    //     solve(n,ans,"",0,0);
    //     return ans;
    // }
    // void solve(int n,List<String>ans,String curr,int open,int close){
    //     if(curr.length()==2*n){
    //         ans.add(curr);
    //         return ;
    //     }
    //     if(open<n){
    //         solve(n,ans,curr+"(",open+1,close);
    //     }
    //     if(close<open){
    //         solve(n,ans,curr+")",open,close+1);
    //     }
    List<String>ans=new ArrayList<>();
    solve(ans,n,"",0,0);
    return ans;
    }
    void solve(List<String>ans,int n,String curr,int open,int close){
        if(curr.length()==2*n){
            ans.add(curr);
            return ;
        }
        if(open<n){
            solve(ans,n,curr+"(",open+1,close);
        }

        if(close<open){
            solve(ans,n,curr+")",open,close+1);
        }
    }
}