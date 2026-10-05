class Solution {

    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
        List<String>path=new ArrayList<>();
        backtrack(0,s,ans,path);
        return ans;
    }
    void backtrack(int idx,String s,List<List<String>>ans,List<String> path){
        if(idx==s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(palindrome(s,idx,i)){
            path.add(s.substring(idx,i+1));
            backtrack(i+1,s,ans,path);
            path.remove(path.size()-1);
            }
        }
    }
    boolean palindrome(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

}
