class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int []stop=new int[1001];
        for(int[]trip:trips){
            int passenger=trip[0];
            int from=trip[1];
            int to=trip[2];
            stop[from]+=passenger;
            stop[to]-=passenger;
        }
        int current=0;
        for(int i=0;i<=1000;i++){
            current+=stop[i];
            if(current>capacity){
                return false;
            }
        }
        return true;
    }
}