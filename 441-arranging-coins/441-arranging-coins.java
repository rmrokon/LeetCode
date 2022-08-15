class Solution {
    public int arrangeCoins(int n) {
        if(n == 1){
            return 1;
        }
        long sumOfCoins = 0;
        for(long i =1; i <= n; i++){
            sumOfCoins = sumOfCoins + i;
            if(sumOfCoins > n){
                return (int) i - 1;
            }
        }
      return -1;  
    }
}