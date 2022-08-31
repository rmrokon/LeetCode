class Solution {
    public int findKthPositive(int[] arr, int k) {
                    
            int start = 0, end = arr.length, mid = 0;
            
            while(start < end){
                mid = start + (end - start)/2;
//                 Number of missing element arr[mid] - 1 - mid
                if(arr[mid] - 1 - mid < k){
                    start = mid + 1;
                }
                else {
                    end = mid;
                }
            } 
        return start + k;
    }
}