class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int reversedNum = reverseNum(x);
        return x == reversedNum;
    }
    
    int reverseNum(int num){
        int reversedNumber = 0;
        while(num > 0){
            int currentDigit = num % 10;
            reversedNumber = reversedNumber * 10 +  currentDigit;
            num /= 10;
        }
        return reversedNumber;
    }
}