class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();
        for(String op:operations){
            if(op.equals("C")){
                st.pop();
            }
            else if(op.equals("D")){
                st.push(2*st.peek());
            }
            else if(op.equals("+")){
                int a=st.pop();
                int b=st.pop();
                st.push(b);
                st.push(a);
                st.push(a+b);
            }
            else{
                st.push(Integer.parseInt(op));
            }
        }
        int sum=0;
        for(int x:st){
            sum+=x;
        }
        return sum;
    }
}