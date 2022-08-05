class Solution {
    public boolean isPalindrome(int x) {
        int reversedNum = reverseNum(x);
        return x == reversedNum;
    }
    
    int reverseNum(int num){
        int reversedNumber = 0;
        while(num > 0){
            reversedNumber = reversedNumber * 10 +  num % 10;
            num /= 10;
        }
        return reversedNumber;
    }
}