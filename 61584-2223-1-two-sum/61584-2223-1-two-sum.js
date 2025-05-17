/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const sorted = [...nums].sort((a,b)=> a-b);
    let left = 0;
    let right = nums.length - 1;
    let ansEl = [];
    while(left < right){
        const sum = sorted[left] + sorted[right];
        if(sum === target){
            ansEl = [sorted[left], sorted[right]];
            break;
        }
        else if (sum > target){
            right--;
        }
        else{
            left++;
        }
    }
    let ansIndex = [];
    for(let i =0; i<nums.length; i++){
        if(nums[i] === ansEl[0] || nums[i] === ansEl[1]){
            ansIndex.push(i);
        }
    }
    return ansIndex;
};