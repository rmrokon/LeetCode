class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int count = 0;
        int col = 0;


        for(int row = 0; row <= rows - 1; ){

            if(grid[row][col] < 0){
                count++;
            }
            col++;
            if(col == cols){
                col = 0;
                row++;
            }
        }
    return count;
    }
}