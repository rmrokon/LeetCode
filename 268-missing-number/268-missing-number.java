class Solution {
    public int missingNumber(int[] nums) {
         int i = 0;
        while(i <= nums.length - 1 ){

            if(nums[i] == nums.length){
                i++;
            }
            if(i < nums.length && nums[i] != i){
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }

        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j){
                return j;
            }
        }

        
    return nums.length;
    }
}