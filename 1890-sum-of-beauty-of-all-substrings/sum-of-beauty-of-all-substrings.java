class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int[]freq=new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                int maxf=0;
                int minf=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                        maxf=Math.max(maxf,freq[k]);
                        minf=Math.min(minf,freq[k]);
                    }
                }
                ans+=(maxf-minf);
            }
        }
        return ans;
    }
}