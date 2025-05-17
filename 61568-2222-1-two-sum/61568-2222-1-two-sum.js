/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let hasEl = {};
    let tool = [];
    let ans = [];
    for(let i = 0; i< nums.length; i++){
        if(!hasEl[nums[i]]){
            hasEl[nums[i]] = [true, i];
        }
    }
    for(let i = 0; i< nums.length; i++){
        const sub = target - nums[i];
        if(hasEl[sub]?.[0] && hasEl[sub]?.[1] !== i){
            tool = [i, sub];
            break;
        }
    }

    for(let i = 0; i< nums.length; i++){
        if(nums[i] === tool[1] && i !== tool[0]){
            ans = [tool[0], i];
            break;
        }
    }

    return ans;
};
