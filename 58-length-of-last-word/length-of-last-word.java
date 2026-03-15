class Solution {
    public int lengthOfLastWord(String s) {
       s=s.trim();
       String [] arr=s.split(" ");
       String len=arr[arr.length-1];
       return len.length(); 
    }
}