class Solution {
    Boolean[] dp;
    public boolean wordBreak(String s, List<String> wordDict) {
        dp=new Boolean[s.length()];
        return canBreak(s,0,wordDict);
    }
    boolean canBreak(String s,int start,List<String>dict){
        if(start==s.length()){
            return true;
        }
        if(dp[start]!=null){
            return dp[start];
        }
        for(String word:dict){
            int len=word.length();
            if(start+len<=s.length() && s.substring(start,start+len).equals(word)){
                if(canBreak(s,start+len,dict)){
                    dp[start]=true;
                    return true;
                }
            }
        }
        dp[start]=false;
        return false;
    }
}