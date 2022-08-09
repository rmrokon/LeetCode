class Solution {
    public int mySqrt(int x) {
      if(x == 0){
          return 0;
      }
        long[] perfectSquare = binarySearch(x);
        if(perfectSquare[0] != -1){
            return (int)(perfectSquare[0]);
        }
        
        return (int)(perfectSquare[1]);
           
        
    }
    
    long[] binarySearch(int num){
        long start = 1;
        long end = num;
        
        while(start <= end){
            long mid = start + (end - start)/2;
            
            if(mid * mid == num){
                return new long[] {mid};             
            }
            if(mid * mid > num){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return new long[] {-1, end};
    }
}