class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // int n=nums.length;
        // Stack<Integer>st=new Stack<>();
        // int nge[]=new int[n];
        // for(int i=2*n-1;i>=0;i--){
        //     int num=nums[i%n];
        //     while(!st.isEmpty() && st.peek()<=num){
        //         st.pop();
        //     }
        //     if(i<n){
        //         nge[i]=st.isEmpty() ?-1:st.peek();
        //     }
        //     st.push(num);
        // }
        // return nge;
        Stack<Integer>st=new Stack<>();
        int n=nums.length;
        int nge[]=new int[n];
        for(int i=2*n-1;i>=0;i--){
            int num=nums[i%n];
            while(!st.isEmpty() && st.peek()<=num){
                st.pop();
            }
            if(i<n){
                nge[i]=st.isEmpty()?-1:st.peek();
            }
            st.push(num);
        }
        return nge;
    }
}