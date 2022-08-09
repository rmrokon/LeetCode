class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums, 0, nums.length - 1);
        // If pivot not found, that means the array is not rotated. So just do normal binary search.
        
        if(pivot == -1){
            return findTarget(nums, target, 0, nums.length -1);
        }
        
        if(nums[pivot] == target){
            return pivot;
        }
        
        if(target >= nums[0]){
            int firstTry = findTarget(nums, target, 0, pivot - 1);
        if(firstTry != -1){
            return firstTry;
        }
        }
        
        if(target <= nums[0]){
            int secondTry = findTarget(nums, target, pivot + 1, nums.length - 1);
        return secondTry;
        }
        
        return -1;
        
    }
    
    int findTarget(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = calcMid(start, end);
            
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
    
    int calcMid(int start, int end){
        return start + (end - start)/2;
    }
    
    int findPivot(int[] nums, int start, int end){
        
        while(start <= end){
            int mid = calcMid(start, end);
            
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