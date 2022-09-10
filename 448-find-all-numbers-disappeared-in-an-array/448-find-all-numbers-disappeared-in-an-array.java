class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        cyclicSort(nums);
        List<Integer> ans = new ArrayList<>();
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                ans.add(j + 1);
            }
        }
        return ans;
    }
    void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] <= arr.length && arr[i] != arr[arr[i] - 1]){
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            }else{
                i++;
            }
        }
    }
}