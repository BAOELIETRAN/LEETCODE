class prob63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1){
            return 0;
        }
        for (int i = 0; i < row; i ++){
            for (int j = 0; j < col; j ++){
                if (obstacleGrid[i][j] == 1){
                    obstacleGrid[i][j] = 0;
                }
                else{
                    obstacleGrid[i][j] ++;  
                }
            }
        }
        for (int i = 0; i < col; i ++){
            if (obstacleGrid[0][i] == 0){
                for (int j = i; j < col; j ++){
                    obstacleGrid[0][j] = 0;
                }
                break;
            }
        }
        for (int i = 0; i < row; i ++){
            if (obstacleGrid[i][0] == 0){
                for(int j = i; j < row; j ++){
                    obstacleGrid[j][0] = 0;
                }
                break;
            }
        }
        for (int i = 1; i < row; i ++){
            for (int j = 1; j < col; j ++){
                if (obstacleGrid[i][j] == 0){
                    continue;
                }
                obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
            }
        }
        return obstacleGrid[row - 1][col - 1];
    }
}