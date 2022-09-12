class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSumOfNums = new int[nums.length];
        int prevNum = 0;
        for(int i = 0; i < nums.length; i++){
            runningSumOfNums[i] = prevNum + nums[i];
            prevNum = runningSumOfNums[i];
        }
        return runningSumOfNums;
    }
}