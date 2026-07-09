class Solution {
    public int findPeakElement(int[] arr) {
        // int start=0;
        // int end=arr.length-1;
        // while(start<end){
        //     int mid=start+(end-start)/2;
        //     if(arr[mid]>arr[mid+1]){
        //         end=mid;
        //     }
        //     else{
        //         start=mid+1;
        //     }
        // }
        // return start;
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid+1]){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
