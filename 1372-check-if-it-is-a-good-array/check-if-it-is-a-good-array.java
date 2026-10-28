class Solution {
    public boolean isGoodArray(int[] nums) {
        int gcd=nums[0];
        for(int i=1;i<nums.length;i++){
            gcd=findgcd(gcd,nums[i]);
        }
        return gcd==1;


    }
    private int findgcd(int a,int b){
        while(b!=0){

        
        int num=a%b;
        a=b;
        b=num;
        }
    
    return a;
    }
}