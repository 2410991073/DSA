class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix==null || matrix.length==0){
            return 0;
        }
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[]heights=new int[cols];
        int maxarea=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]=='1'){
                    heights[j]+=1;
                }
                else{
                    heights[j]=0;
                }
            }
            maxarea=Math.max(maxarea,largestRectangleArea(heights));
            
        }
        return maxarea;
    }
    private int largestRectangleArea(int[]heights){
        Stack<Integer>st=new Stack<>();
        int maxArea=0;
        int n=heights.length;
        for(int i=0;i<=n;i++){
            int currHeight=(i==n)?0:heights[i];
            while(!st.isEmpty() && heights[st.peek()]>currHeight){
                int height=heights[st.pop()];
                int left=st.isEmpty()?-1:st.peek() ;
                int width=i-left-1;
                maxArea=Math.max(maxArea,height*width);
            }
            st.push(i);
        }
        return maxArea;
    }
}