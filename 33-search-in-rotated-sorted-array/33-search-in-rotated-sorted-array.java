class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        // If pivot not found, that means the array is not rotated. So just do normal binary search.
//         This will not work with duplicate values in the array
        
        if(pivot == -1){
            return findTarget(nums, target, 0, nums.length -1);
        }
        
        if(nums[pivot] == target){
            return pivot;
        }
        
        if(target >= nums[0]){
            return findTarget(nums, target, 0, pivot - 1);
        }       
        return findTarget(nums, target, pivot + 1, nums.length - 1);   
    }
    
    int findTarget(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(target < nums[mid]){
                end = mid -1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    
    int findPivot(int[] nums){
        
        int start = 0;
        int end = nums.length - 1;
        
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            if(nums[mid] <= nums[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}