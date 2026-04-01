class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        } 
        List<Character>list=new ArrayList<>(mp.keySet());
        Collections.sort(list,(a,b)->mp.get(b)-mp.get(a));
        StringBuilder sb=new StringBuilder();
        for(char ch:list){
            int freq=mp.get(ch);
            for(int i=0;i<freq;i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}