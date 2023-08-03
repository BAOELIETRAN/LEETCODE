class prob1351 {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int row = rows - 1;
        int col = 0;
        while (row >= 0 && col < cols){
            if (grid[row][col] < 0){
                count += cols - col;
                row --;
            }
            else{
                col ++;
            }
        }
        return count;
    }
}