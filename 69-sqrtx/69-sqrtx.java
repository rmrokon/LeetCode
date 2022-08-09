class Solution {
    public int mySqrt(int x) {
      if(x == 0){
          return 0;
      }
    return (int)(binarySearch(x));
           
        
    }
    
    long binarySearch(int num){
        long start = 1;
        long end = num;
        
        while(start <= end){
            long mid = start + (end - start)/2;
            
            if(mid * mid == num){
                return mid;             
            }
            if(mid * mid > num){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return end;
    }
}