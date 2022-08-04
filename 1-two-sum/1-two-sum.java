class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length == 0){
            return new int[] {-1, -1};
        }
        for(int firstNum=0; firstNum < nums.length; firstNum++){
            for(int secondNum=0; secondNum < nums.length; secondNum++){
                if(firstNum != secondNum){
                //     if(nums[firstNum] > target){
                //     firstNum++;
                // }
                // if(nums[secondNum] > target){
                //     secondNum++;
                // }
                if(nums[firstNum] + nums[secondNum] == target){
                    int[] ans = {firstNum, secondNum};
                    return ans;
                }
                }
            }
        }
        return new int[] {-1, -1};
    }
}