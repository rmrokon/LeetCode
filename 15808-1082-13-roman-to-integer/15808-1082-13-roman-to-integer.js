/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    const values = {
        I: 1,
        V: 5,
        X: 10,
        L: 50,
        C: 100,
        D: 500,
        M: 1000
    }
    const arr = s.split("");
    let ans = 0;
    for(let i=0; i< arr.length; i++){
        if(i+1 < arr.length && values[arr[i]] < values[arr[i+1]]){
            ans += (values[arr[i+1]] - values[arr[i]]);
            i += 1;
        }else{
            ans += values[arr[i]];
        }
    }
    return ans;
};