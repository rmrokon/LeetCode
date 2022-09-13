class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> greatest = new ArrayList<>();
        
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= max){
                greatest.add(true);
            }else{
                greatest.add(false);
            }
        }
        return greatest;
    }
}