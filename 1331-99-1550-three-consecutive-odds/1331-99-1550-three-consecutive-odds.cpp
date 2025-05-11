class Solution {
public:
    bool threeConsecutiveOdds(vector<int>& arr) {
        int count = 0;
        bool hasThreeConsecutiveOdds = false;
        vector<int>::iterator it = arr.begin();
        while(it != arr.end()){
            if(*it % 2 != 0){
                count++;
            }else{
                count = 0;
                hasThreeConsecutiveOdds = false;
            }

            if(count >= 3){
                hasThreeConsecutiveOdds = true;
                break;
            }
            it++;
        }
        return hasThreeConsecutiveOdds;
    }
};