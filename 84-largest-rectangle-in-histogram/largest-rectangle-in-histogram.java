class Solution {
    public int largestRectangleArea(int[] heights) {
        // int n=heights.length;
        // Stack<Integer>st=new Stack<>();
        // int maxarea=0;
        // for(int i=0;i<=n;i++){
        //     int currheight=(i==n)?0:heights[i];
        //     while(!st.isEmpty()&& heights[st.peek()]>currheight){
        //         int height=heights[st.pop()];
        //         int right=i;
        //         int left=st.isEmpty()?-1:st.peek();
        //         int width=right-left-1;
        //         maxarea=Math.max(maxarea,height*width);
        //     }
        //     st.push(i);
        // }
        // return maxarea;
        int n=heights.length;
        Stack<Integer>st=new Stack<>();
        int maxarea=0;
        for(int i=0;i<=n;i++){
            int currheight=(i==n)?0:heights[i];
            while(!st.isEmpty() && heights[st.peek()]>currheight){
                int height=heights[st.pop()];
                int right=i;
                int left=st.isEmpty()?-1:st.peek();
                int width=right-left-1;
                maxarea=Math.max(maxarea,height*width);
            }
            st.push(i);
        }
        return maxarea;
    }
}