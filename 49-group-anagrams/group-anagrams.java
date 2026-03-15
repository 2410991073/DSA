class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(String s:strs){
            char []ch=s.toCharArray();
            Arrays.sort(ch);
            String K=new String(ch);
            if(!map.containsKey(K)){
                map.put(K,new  ArrayList<>());
            }
            map.get(K).add(s);
        }
        return new ArrayList<>(map.values());
    }
}