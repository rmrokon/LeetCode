class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i += 2){
            ans[i] = nums[i/2];
        }

        for(int i = 1; i <= n; i += 2){
            ans[i] = nums[n];
            n++;
        }
        return ans;
    }
}